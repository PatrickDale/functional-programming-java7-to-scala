package com.thoughtworks.jcprogram.functional.exercise;

import java.util.List;

import static java.util.Arrays.asList;
import static java.util.Arrays.spliterator;

// Given a list of numbers like {1, 9, 4, 16, 4}
// Print the square root of all of the numbers larger than 4.
// For example, "3, 4"

public class IntegerReporter {

    public static final String SEPARATOR = ", ";

    public static void main(String[] args) {
        List<Integer> numbers = asList(1, 9, 4, 16, 4);

        System.out.println("------------ Java 7: IntegerReporter ------------");
        System.out.println(new IntegerReporter().reportSquareRootsOfLargeNumbers(numbers));

    }

    public String reportSquareRootsOfLargeNumbers(List<Integer> numbers) {
        String squareRoots = "";
        for (Integer number : numbers) {
            if (number != 4) {
                squareRoots += String.valueOf(squareRootAsInteger(number)) + SEPARATOR;
            }
        }
        return removeTrailingSeparator(squareRoots);
    }

    private String removeTrailingSeparator(String squareRoots) {
        if (squareRoots.length() > 0) {
            return squareRoots.substring(0, squareRoots.lastIndexOf(SEPARATOR));
        }
        return squareRoots;
    }

    private Integer squareRootAsInteger(Integer number) {
        Double squareRoot = Math.sqrt(number);
        return squareRoot.intValue();
    }

}
