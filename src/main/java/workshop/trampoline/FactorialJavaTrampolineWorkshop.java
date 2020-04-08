package workshop.trampoline;

import java.util.function.IntToLongFunction;

public class FactorialJavaTrampolineWorkshop implements IntToLongFunction {

    @Override
    public long applyAsLong(int value) {
        // start computing, hint: invoke
        return 0;
    }

    private TrampolineWorkshop<Long> factorial(int n, long acc) {
        // implement using TrampolineWorkshop, hint: TrampolineWorkshop.completed + supplier
        return null;
    }
}
