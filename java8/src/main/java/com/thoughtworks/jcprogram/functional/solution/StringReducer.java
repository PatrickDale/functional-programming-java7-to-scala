package com.thoughtworks.jcprogram.functional.solution;

import java.util.List;
import java.util.stream.Collectors;

import static java.util.Arrays.asList;

// Given a list of strings like {"Bill", "Archer", "Lana"}
// Print the first letter of each of the strings that has a length of 4.
// For example, "BL"

public class StringReducer {

    public static void main(String[] args) {
        List<String> strings = asList("Bill", "Archer", "Lana");
        System.out.println(new StringReducer().reduceToFirstLetterOfLengthFourStrings(strings));
    }

    public String reduceToFirstLetterOfLengthFourStrings(List<String> strings) {
        String firstLetters = strings.stream()
                .filter(name -> name.length() == 4)
                .map(name -> name.charAt(0))
                .map(character -> character.toString())
                .collect(Collectors.<String>joining());

        return firstLetters;
    }
}
