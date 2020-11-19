package training.intermediateoperators;

import javax.sql.ConnectionPoolDataSource;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class IntermediateOperatorsExercise implements StreamIntermediateOperators {

    @Override
    public Stream<String> wordsLongerThanFiveCharacters(List<String> words) {
        return words.stream().filter(n-> n.length()>5);
        }

    @Override
    public Stream<String> firstThreeWordsLongerThanFiveCharacters(List<String> words) {
        return words.stream().filter(n->n.length() > 5).limit(3);
    }

    @Override
    public Stream<String> firstThreeDistinctWordsLongerThanFiveCharactersInReverseAlphabeticalOrder(List<String> words) {
       return  words.stream().filter(n->n.length()>5).distinct().limit(3).sorted(Comparator.reverseOrder());
    }

    @Override
    public Stream<Integer> lengthOfWords(List<String> words) {
        return words.stream().map(n->n.length());
    }

    @Override
    public Stream<Integer> staircase() {
        return IntStream.range(1, 7).flatMap(n -> IntStream.range(0, n + 1)).boxed();
    }
}
