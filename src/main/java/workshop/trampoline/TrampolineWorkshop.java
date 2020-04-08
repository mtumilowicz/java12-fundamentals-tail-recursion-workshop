package workshop.trampoline;

@FunctionalInterface
public interface TrampolineWorkshop<T> {

    /*
    stream of consecutive invocations till complete
    propositions for methods:
        * default isComplete
        * default result
        * default invoke // hints: Stream.iterate, dropWhile, findFirst
        * default completed and a class Completed implements TrampolineWorkshop
        * abstract bounce
     */

    TrampolineWorkshop<T> bounce();
}
