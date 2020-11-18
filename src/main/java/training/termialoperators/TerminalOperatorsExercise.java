package training.termialoperators;

import javax.xml.crypto.dsig.spec.XSLTTransformParameterSpec;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TerminalOperatorsExercise implements StreamTerminalOperators {

    @Override
    public void addToSet(Stream<String> stream, Set<String> set) {
        set.addAll(stream.collect(Collectors.toList()));
    }

    @Override
    public void addToListInReverseOrder(Stream<String> stream, List<String> list) {
        List<String> newList = stream.collect(Collectors.toList());
        Collections.reverse(newList);
        list.addAll(newList);
    }

    @Override
    public String[] collectToArray(Stream<String> stream) {
     return stream.toArray(String[]::new);
    }

    @Override
    public Set<String> collectToSet(Stream<String> stream) {
        return stream.collect(Collectors.toSet());
    }

    @Override
    public List<String> collectToList(Stream<String> stream) {
        return stream.collect(Collectors.toList());
    }

    @Override
    public String mergeIntoString(Stream<String> stream) {
        String text = stream.collect(Collectors.joining("-"));
        return "["+text+"]";
    }

    @Override
    public int countCharacters(Stream<String> stream) {
        String reduced = stream.reduce("", (first, second) -> first + second);
        return reduced.length();
    }

    @Override
    public int longestWordLength(Stream<String> stream) {
        String reduced = stream.reduce("", (first, second) -> {
            if (first.length() >= second.length()) {
                return first;
            } else {
                return second;
            }
        });
        return reduced.length();
    }

    @Override
    public String longestWord(Stream<String> stream) {
        String reduced = stream.reduce("", (first, second) -> {
            if (first.length() >= second.length()) {
                return first;
            } else {
                return second;
            }
        });
        return reduced;
    }

    @Override
    public Map<Integer, List<String>> wordsGroupedByLength(Stream<String> stream) {
        return stream.collect(Collectors.groupingBy(value ->value.length()));
    }
}
