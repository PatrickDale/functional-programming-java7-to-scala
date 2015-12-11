package com.thoughtworks.jcprogram.functional.solution;

import java.util.List;

import static java.util.Arrays.asList;

// Given a list of strings like {"Bill", "Archer", "Lana"}
// Print the first letter of each of the string that has a length of 4.
// For example, "BL"

public class StringReducer {

    public static void main(String[] args) {
        List<String> strings = asList("Bill", "Archer", "Lana");
        System.out.println(new StringReducer().reduceToFirstLetterOfLengthFourStrings(strings));
    }

    public String reduceToFirstLetterOfLengthFourStrings(List<String> strings) {
        String result = "";
        for (String string : strings) {
            if (string.length() == 4){
                Character c = string.charAt(0);
                result += c.toString();
            }
        }
        return result;
    }
}
