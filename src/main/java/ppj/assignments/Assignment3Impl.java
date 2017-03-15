package ppj.assignments;

import java.math.BigInteger;
import java.util.Collection;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * Created by Jarda on 3/6/2017.
 */
public class Assignment3Impl implements Assignment3 {
    @Override
    public int deepSumOfEvenSquaredNumbers(List<List<Integer>> src) {
        return src.stream().flatMap(List::stream)
                .filter(i -> i % 2 == 0).mapToInt(b -> b * b).sum();
    }

    @Override
    public int sumOfDivisibleInRange(int from, int to, List<Integer> divisibleBy) {
        return IntStream.range(from, to).boxed()
                .filter(number -> divisibleBy.stream().allMatch(divisor -> number % divisor == 0))
                .mapToInt(i -> i).sum();
    }
}
