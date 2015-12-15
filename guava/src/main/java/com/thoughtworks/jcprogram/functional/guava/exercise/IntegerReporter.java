package com.thoughtworks.jcprogram.functional.guava.exercise;

import com.google.common.base.Function;
import com.google.common.base.Joiner;
import com.google.common.base.Predicate;

import java.math.RoundingMode;
import java.util.List;

import static com.google.common.collect.Collections2.filter;
import static com.google.common.collect.Lists.newArrayList;
import static com.google.common.collect.Lists.transform;
import static com.google.common.math.IntMath.sqrt;

// Given a list of numbers like {1, 9, 4, 16, 4}
// Print the square root of all of the numbers larger than 4.
// For example, "3, 4"

public class IntegerReporter {
    public static void main(String[] args) {
        List<Integer> numbers = newArrayList(1, 9, 4, 16, 4);

        System.out.println("------------ Guava: IntegerReporter ------------");
        System.out.println(new IntegerReporter().reportSquareRootsOfLargeNumbers(numbers));
    }

    private static class SquareRootFunction implements Function<Integer, String> {
        public String apply(Integer numberToGetSquareRootOf) {
            return String.valueOf(sqrt(numberToGetSquareRootOf, RoundingMode.DOWN));
        }
    }

    private static class IsNotFourPredicate implements Predicate<Integer> {
        public boolean apply(Integer integer) {
            return integer != 4;
        }
    }

    public String reportSquareRootsOfLargeNumbers(List<Integer> numbers) {
        List<Integer> nonFourNumbers = newArrayList(filter(numbers, new IsNotFourPredicate()));
        List<String> squareRoots = transform(nonFourNumbers, new SquareRootFunction());
        return Joiner.on(", ").join(squareRoots);
    }

}
