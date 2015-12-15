package com.thoughtworks.jcprogram.functional.exercise;

import java.util.Collection;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import static java.util.Arrays.asList;

// Given a list of numbers like {1, 9, 4, 16, 4}
// Print the square root of all of the numbers larger than 4.
// For example, "3, 4"

public class IntegerReporter {

    public static final String DELIMITER = ", ";

    public static void main(String[] args) {
        List<Integer> numbers = asList(1, 9, 4, 16, 4);

        System.out.println("------------ Java 8: IntegerReporter ------------");
        System.out.println(new IntegerReporter().reportSquareRootsOfLargeNumbers(numbers));
    }

    public String reportSquareRootsOfLargeNumbers(List<Integer> numbers) {
        Predicate<Integer> isNot4 = i -> i != 4;

        return numbers.stream()
                .filter(isNot4)
                .map(Math::sqrt)
                .map(Double::intValue)
                .map(String::valueOf)
                .collect(Collectors.joining(DELIMITER));
    }

}
