package org.example;

public class StringUtilities {
    // Refer to Java Basics 1 for common string methods

    // Add a static function called shortString that takes a String parameter and returns true if the string has fewer than 5
    // characters
    public static boolean shortString(String measuredString) {
        if (measuredString.length() < 5) {
            return true;
        } else {
            return false;
        }
    }

    // Add a static function called firstLetter that takes a String parameter and returns the first character of the string
    public static char firstLetter (String input) {
        return input.charAt(0);
    }

    // Add a static function called censorAsparagus that takes a String parameter and returns the string with all instances of
    // "asparagus" (lowercase only) replaced with 4 stars: "****"
    public static String censorAsparagus (String input) {
        return input.replaceAll("asparagus","****");
        /*
            I found this "replaceAll" method on w3schools.
            For my own learning I want to note here that it does not simply take two strings as input, but it takes a regular expression.
            I want to dive further into regular expressions in the future, but this is an adequate solution for now.
         */
    }

    // Add a static function called bigger that takes two String parameters and returns the longer of the two strings. If the
    // strings are the same length, return the first string.
    public static String bigger (String input1, String input2) {
        if (input1.length() >= input2.length()) {
            return input1;
        } else {
            return input2;
        }
    }
}
