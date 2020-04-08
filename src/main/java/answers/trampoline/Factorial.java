package answers.trampoline;

import java.util.function.IntToLongFunction;

public class Factorial implements IntToLongFunction {

    @Override
    public long applyAsLong(int value) {
        return factorial(value, 1).invoke();
    }

    private Trampoline<Long> factorial(int n, long acc) {
        return n == 1 ? Trampoline.completed(acc) : () -> factorial(n - 1, acc * n);
    }
}
