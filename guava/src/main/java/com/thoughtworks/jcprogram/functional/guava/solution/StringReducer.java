package com.thoughtworks.jcprogram.functional.guava.solution;

import com.google.common.base.Function;
import com.google.common.base.Joiner;
import com.google.common.base.Predicate;

import java.util.Collection;
import java.util.List;

import static com.google.common.collect.Collections2.filter;
import static com.google.common.collect.Collections2.transform;
import static com.google.common.collect.Lists.newArrayList;

// Given a list of strings like {"Bill", "Archer", "Lana"}
// Print the first letter of each of the strings that has a length of 4.
// For example, "BL"

public class StringReducer {

    public static void main(String[] args) {
        List<String> strings = newArrayList("Bill", "Archer", "Lana");
        System.out.println(new StringReducer().reduceToFirstLetterOfLengthFourStrings(strings));
    }

    public String reduceToFirstLetterOfLengthFourStrings(List<String> strings) {
        Collection<String> stringsWithLengthOf4 = filter(strings, new Predicate<String>() {
            public boolean apply(String name) {
                return name.length() == 4;
            }
        });

        Collection<String> firstLetters = transform(stringsWithLengthOf4, new Function<String, String>() {
            public String apply(String string) {
                Character firstCharacter = string.charAt(0);
                return firstCharacter.toString();
            }
        });


        String result = Joiner.on("").join(firstLetters);

        return result;
    }
}
