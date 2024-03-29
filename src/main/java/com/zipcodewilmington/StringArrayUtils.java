package com.zipcodewilmington;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by leon on 1/29/18.
 */
public class StringArrayUtils {
    /**
     * @param array array of String objects
     * @return first element of specified array
     */ // TODO
    public static String getFirstElement(String[] array) {

        return array[0];
    }

    /**
     * @param array array of String objects
     * @return second element in specified array
     */
    public static String getSecondElement(String[] array) {

        return array[1];
    }

    /**
     * @param array array of String objects
     * @return last element in specified array
     */ // TODO
    public static String getLastElement(String[] array) {

        return array[array.length - 1];
    }

    /**
     * @param array array of String objects
     * @return second to last element in specified array
     */ // TODO
    public static String getSecondToLastElement(String[] array) {

        return array[array.length - 2];
    }

    /**
     * @param array array of String object
     * @param value value to check array for
     * @return true if the array contains the specified `value`
     */ // TODO
    public static boolean contains(String[] array, String value) {
        //  String[] == {"word1", "word2", "word3",}; vs String = "word";
        // we check the index of the array which contains the whole word to see if it equals the value/ word argument
        // in a String literal, contains checks through the letters of the word to see if characters are in the word
        boolean result = false;
        for (int i = 0; i < array.length; i++) {
            if (array[i].equals(value)) {
                result = true;
            }
        }

        return result;

    }

    /**
     * @param array of String objects
     * @return an array with identical contents in reverse order
     */ // TODO
    public static String[] reverse(String[] array) {
        int length = array.length;
        // length of the array
        for (int i = 0; i < length / 2; i++) {
            // iterate through each element of the array - account for odd number of elements
            String temp = array[i];
            // temporary value to store current location of iterator
            array[i] = array[length - 1 - i];
            // current position of iterator is last element of array
            array[length - 1 - i] = temp;
            // reverse order of array elements
        }
        return array;

    }


    /**
     * @param array array of String objects
     * @return true if the order of the array is the same backwards and forwards
     */ // TODO
    public static boolean isPalindromic(String[] array) {
        int length = array.length;
        for (int i = 0; i < length / 2; i++) {
            String temp = array[length - 1 - i];
            if (temp.equals(array[i])) {
                return true;
            }

        }

        return false;
    }

    /**
     * @param array array of String objects
     * @return true if each letter in the alphabet has been used in the array
     */ // TODO
    public static boolean isPangramic(String[] array) {
        // String[] ≈ (char[])[]
        ArrayList<Character> charsSeen = new ArrayList<>();
        for (String s : array) {
            for (char ch : s.toLowerCase().toCharArray()) {
                if (Character.isLetter(ch) && !charsSeen.contains(ch)) {
                    charsSeen.add(ch);
                }
            }
        }
        return charsSeen.size() == 26;
    }

    /**
     * @param array array of String objects
     * @param value value to check array for
     * @return number of occurrences the specified `value` has occurred
     */ // TODO
    public static int getNumberOfOccurrences(String[] array, String value) {
        int counter = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i].equals(value)) {
                counter++;
            }
        }
        return counter;
    }

    /**
     * @param array         array of String objects
     * @param valueToRemove value to remove from array
     * @return array with identical contents excluding values of `value`
     */ // TODO
    public static String[] removeValue(String[] array, String valueToRemove) {
        // create new String array to hold result after removing value - array lengths cannot be changed
        String[] result = new String[array.length - 1];
        // iterate through original array with counter for new array
        for (int i = 0, j = 0; i < array.length; i++) {
            // check if current value equals value to be removed
            if (array[i] != valueToRemove) {
                // if not - add current value to new array
                result[j] = array[i];
                // increment new array counter / position
                j++;
            }
        }

        return result;
    }

    /**
     * @param array array of chars
     * @return array of Strings with consecutive duplicates removes
     */ // TODO
    public static String[] removeConsecutiveDuplicates(String[] array) {
        ArrayList<String> result = new ArrayList<>();
        for (int i = 0; i < array.length - 1; i++) {
            if (!array[i].equals(array[i + 1])) {
                result.add(array[i]);

            }
        }
        result.add(array[array.length - 1]);
        return result.toArray(new String[0]);
    }

    /**
     * @param array array of chars
     * @return array of Strings with each consecutive duplicate occurrence concatenated as a single string in an array of Strings
     */ // TODO
    public static String[] packConsecutiveDuplicates(String[] array) {
        ArrayList<String> result = new ArrayList<>();
        for (int i = 0; i < array.length-1; i++) {
            if(array[i].equals(array[i+1])) {
                result.add(array[i].join(",",array[i+1]));
            } else if
            (!array[i].equals(array[i+1])) {
                result.add(array[i]);
            }

        }
        result.add(array[array.length - 1]);
        return result.toArray(new String[0]);
    }
}
