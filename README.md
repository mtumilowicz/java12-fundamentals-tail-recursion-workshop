# java12-fundamentals-tail-recursion-workshop

* references
    * http://groovy-lang.org/closures.html#_trampoline  
    * http://docs.groovy-lang.org/latest/html/gapi/groovy/transform/TailRecursive.html  
    * https://stackoverflow.com/questions/33923/what-is-tail-recursion

## preface
* goals of this workshop
    * introduction to JVM internals: stack, frame, operand stack
        * https://github.com/mtumilowicz/java-stack
    * understand the concept of recursion
    * understand the difference between recursion and tail recursion
    * how recursion is handled by JVM (know the limits)
    * standard approaches to support JVM in handling recursion wise (trampoline, streams)

## tail recursion
* tail call (tail recursion) is a kind of goto dressed as a call
* tail call happens when a function calls another as its last action, so it has nothing else to do 
* for instance, in the following code, the call to `g` is a tail call:
    ```
    function f(x)
      return g(x)
    end
    ```
    * in such situations, the program does not need to return to the calling function when the called function ends
* after the tail call, the program does not need to keep any information about the calling function in the stack

## stack frames
* recursive algorithms are often restricted by a physical limit: the maximum stack height (`StackOverflowException`)
* stack frames: recursive call vs tail-recursive call (of factorial function)
    ```
    static long withRecur(int n) {
        if (n == 1) {
            return 1;
        }

        return n * withRecur(n - 1);
    }

    public static long withTailRecur(int n) {
        return withTailRecur(n, 1);
    }

    private static long withTailRecur(int n, long result) {
        if (n == 1) {
            return result;
        }

        return withTailRecur(n - 1, n * result);
    }
    ```
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
    * tail-recursive call (reusing same frame, but only with trampoline - JVM is not wise!)
        ```
        init-call: factorial(3)
        factorialTailRecursive(3, 1) -> factorialTailRecursive(2, 3) -> factorialTailRecursive(1, 6) -> 6 
        ```

## trampoline
* mechanism that converts recurrent calls to the stream of consecutive function invocations until some function 
could return value
    ```
    Stream.iterate(this, nextInvocation)
                    .filter(checkIfComplete)
                    .findFirst()
                    .orElseThrow()
                    .result();
    ```
* groovy
    * using `Closure` and its trampoline capability
        ```
        public Closure<V> trampoline(final Object... args) {
            return new TrampolineClosure<V>(this.curry(args));
        }
        ```
    * closures are wrapped in a **TrampolineClosure**
    * upon calling, a trampolined `Closure` will call the original `Closure` waiting for its result
    * if the outcome of the call is another instance of a `TrampolineClosure`, created perhaps as a result to a call 
    to the `trampoline()` method, the Closure will again be invoked
    * repetitive invocation of returned trampolined Closures instances will continue until a value other than a 
    trampolined `Closure` is returned
    * that value will become the final result of the trampoline
    * so calls are made serially, rather than filling the stack
* java
    * we have to implement that functionality - simple functional interface