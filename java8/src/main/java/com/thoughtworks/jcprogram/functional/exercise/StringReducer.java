package com.thoughtworks.jcprogram.functional.exercise;

import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import static java.util.Arrays.asList;

// Given a list of strings like {"Bill", "Archer", "Lana"}
// Print the first letter of each of the strings that has a length of 4.
// For example, "BL"

public class StringReducer {

    public static final String DELIMITER = "";

    public static void main(String[] args) {
        List<String> strings = asList("Bill", "Archer", "Lana");

        System.out.println("------------ Java 8: StringReducer ------------");
        System.out.println(new StringReducer().reduceToFirstLetterOfLengthFourStrings(strings));
    }

    public String reduceToFirstLetterOfLengthFourStrings(List<String> strings) {
        Predicate<String> lengthOf4 = s -> s.length() == 4;
        Function<String, Character> getFirstCharacter = s -> s.charAt(0);

        return strings.stream()
                .filter(lengthOf4)
                .map(getFirstCharacter)
                .map(String::valueOf)
                .collect(Collectors.joining(DELIMITER));
    }
}
