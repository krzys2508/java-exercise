package training.creation;

import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamCreationExercise implements StreamCreator {

    @Override
    public IntStream positiveDigitsUsingOf() {
        return IntStream.of(1,2,3,4,5,-7,-12,-15).filter(val->val>0);
    }

    @Override
    public IntStream positiveDigitsUsingRange() {

        return IntStream.range(-20,20).filter(val->val>0);
    }

    @Override
    public IntStream positiveDigitsUsingIterate() {
        return IntStream.iterate(-20,);
    }

    @Override
    public IntStream powersOfTwo() {
        return IntStream.empty();
    }

    @Override
    public DoubleStream from0Till1WithTenSteps() {
        return DoubleStream.empty();
    }

    @Override
    public Stream<String> alphabet() {
        return Stream.empty();
    }

}
