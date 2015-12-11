package com.thoughtworks.jcprogram.functional.solution

// Given a list of strings like {"Bill", "Archer", "Lana"}
// Print the first letter of each of the strings that has a length of 4.
// For example, "BL"

Set strings = ["Bill", "Archer", "Lana"]
println new StringReducer().reduceToFirstLetterOfLengthFourStrings(strings)


def reduceToFirstLetterOfLengthFourStrings(strings){
    strings.findAll{it.length() == 4}.collect {it[0]}.join("")
}