package com.thoughtworks.jcprogram.functional.exercises

// Given a list of strings like {"Bill", "Archer", "Lana"}
// Print the first letter of each of the strings that has a length of 4.
// For example, "BL"

object StringReducer {

  def reduceToFirstLetterOfLengthFourStrings(strings: Set[String]){

  }

  def main(args: Array[String]) {
    val strings = Set("Bill", "Archer", "Lana")

    val reducer = StringReducer
    reducer.reduceToFirstLetterOfLengthFourStrings(strings)
  }
}
