package training.creation;

import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public interface StreamCreator {

    Stream <Integer> intStream = Stream.of(1,2,3,4,5);

    IntStream positiveDigitsUsingOf();

    /**
     * IntStream.iterate(...)
     */
    IntStream positiveDigitsUsingIterate();

    /**
     * IntStream.range(...)
     */
    IntStream positiveDigitsUsingRange();

    /**
     * IntStream.iterate(...)
     */
    IntStream powersOfTwo();

    /**
     * DoubleStream.iterate(...)
     */
    DoubleStream from0Till1WithTenSteps();

    /**
     * IntStream.iterate(...)
     */
    Stream<String> alphabet();
}
