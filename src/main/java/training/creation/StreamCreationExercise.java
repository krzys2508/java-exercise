package training.creation;

import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamCreationExercise implements StreamCreator {

    @Override
    public IntStream positiveDigitsUsingOf() {
        return IntStream.of(-1,0,1,2,3,4,5,6,7,8,9).filter(val->val>0);
    }

    @Override
    public IntStream positiveDigitsUsingRange() {

        return IntStream.range(-20,10).filter(val->val>0);
    }

    @Override
    public IntStream positiveDigitsUsingIterate() {
        return IntStream.iterate(-1,n->n+1).limit(11).filter(val->val>0);
    }

    @Override
    public IntStream powersOfTwo() {
        return IntStream.of(1,2,3,4,5,6,7,8,9,10).map(i->(int)Math.pow(2,i));
    }

    @Override
    public DoubleStream from0Till1WithTenSteps() {
        return DoubleStream.iterate(0,n->(n+0.1)*100).limit(11);
    }

    @Override
    public Stream<String> alphabet() {
        return Stream.empty();
    }

}
