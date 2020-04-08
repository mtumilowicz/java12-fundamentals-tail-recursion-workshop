# java12-fundamentals-tail-recursion-workshop

* references
    * http://groovy-lang.org/closures.html#_trampoline  
    * http://docs.groovy-lang.org/latest/html/gapi/groovy/transform/TailRecursive.html  
    * https://stackoverflow.com/questions/33923/what-is-tail-recursion
    * https://github.com/mtumilowicz/java-stack

## preface

## stack frames
We will compare the stack frames of recursive call and 
tail-recursive call (of factorial function)
* recursive call
    ```
    init-call: factorial(3)
    // 3 * factorial(2)
    factorial(2)
    // 2 * factorial(1)
    factorial(1)
    // 1
    ```
    and then traverse stack in opposite direction
    ```
    1
    1 * 2 = 2
    3 * 2 = 6
    ```
* tail-recursive call (reusing same frame - trampoline)
    ```
    init-call: factorial(3)
    factorialTailRecursive(3, 1) -> factorialTailRecursive(2, 3) -> factorialTailRecursive(1, 6) -> 6 
    ```

## tail recursion
A tail call (tail recursion) is a kind of goto dressed 
as a call. A tail call happens when a function calls 
another as its last action, so it has nothing else to do. 
For instance, in the following code, the call to `g` is a 
tail call:
```
function f (x)
  return g(x)
end
```
After `f` calls `g`, it has nothing else to do. In 
such situations, the program does not need to return 
to the calling function when the called function ends.

**Therefore, after the tail call, the program does not 
need to keep any information about the calling function 
in the stack**.

Note that:
```
class NumberTailRecursion {

    @TailRecursive
    static def isEven(int n) {
        n == 0 ? true : isOdd(n-1)
    }

    @TailRecursive
    static def isOdd(int n) {
        n == 0 ? false : isEven(n-1)
    }
}
```
will produce compile time error:
`Error: Groovyc: No recursive calls detected. You must remove annotation @TailRecursive.`

From documentation (known shortcomings):
* Only non-void methods are currently being handled. 
Void methods will fail compilation.

* **Only direct recursion (calling the exact same method 
again) is supported.**

* Mixing of tail calls and non-tail calls is not possible. 
The compiler will complain if some recursive calls cannot 
be handled.

* Checking if a recursive call is really tail-recursive 
is not very strict. You might run into cases where 
non-tail calls will be considered tail calls.

* In the presence of method overloading and method 
overriding you might run into situations where a call 
is considered recursive although it really is not.

* Catching Throwable around a recursive might lead to problems

* Non trivial continuation passing style examples do not work.

* Probably many unrecognized edge cases.

## trampoline
We want to have mechanism that will convert recurrent 
calls to the stream of consecutive function 
invocations until some function could return value.
```
Stream.iterate(this, nextInvocation)
                .filter(checkIfComplete)
                .findFirst()
                .orElseThrow()
                .result();
```

Recursive algorithms are often restricted by a physical 
limit: the maximum stack height (`StackOverflowException`).

An approach that helps in those situations is by using 
`Closure` and its trampoline capability.

Closures are wrapped in a **TrampolineClosure**. Upon 
calling, a trampolined `Closure` will call the original 
`Closure` waiting for its result. If the outcome of the 
call is another instance of a `TrampolineClosure`, 
created perhaps as a result to a call to the 
`trampoline()` method, the Closure will again be 
invoked. This repetitive invocation of returned 
trampolined Closures instances will continue 
until a value other than a trampolined Closure is 
returned. That value will become the final result of 
the trampoline. **That way, calls are made serially, 
rather than filling the stack**.