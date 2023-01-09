/* Program Details:
Author: Caitlyn Smith
Course: CISS 111-300
Email: c-smith54@hvcc.edu

Program Description:
This program takes string input from
the user and does the following:
- Counts the vowels
- Counts the consonants
- Reverses the string
- Counts the whitespaces
- Counts the digits
- Returns explanation of binary joke
*/

import java.util.Scanner;

public class Program04 {
    public static void main(String[] args) {
        String userInput;
        Scanner scan = new Scanner(System.in);

        System.out.print("Please input a string of text: ");
        userInput = scan.nextLine();
        System.out.println("");

        // Returns each method
        getVowelCount(userInput);
        getConsonantCount(userInput);
        backwards(userInput);
        getWhiteSpace(userInput);
        getDigits(userInput);
        binaryJoke(userInput);
    }

    // Returns the number of vowels in string
    public static int getVowelCount(String userInput) {
        int vowels = 0;

        for (int i = 0; i < userInput.length(); i++) {
            // Counting the vowels
            if (userInput.charAt(i) == 'a'
                    || userInput.charAt(i) == 'e'
                    || userInput.charAt(i) == 'i'
                    || userInput.charAt(i) == 'o'
                    || userInput.charAt(i) == 'u') {
                vowels++;
            }
        }

        System.out.println("• There are " + vowels + " vowels in your string.");
        return vowels;
    }

    // Returns the number of consonants in string
    public static int getConsonantCount(String userInput) {
        int consonants = 0;

        for (int i = 0; i < userInput.length(); i++) {
            // Removing vowels from search
            if (userInput.charAt(i) == 'a'
                    || userInput.charAt(i) == 'e'
                    || userInput.charAt(i) == 'i'
                    || userInput.charAt(i) == 'o'
                    || userInput.charAt(i) == 'u') {
            }
            // Counting the remaining consonants
            else {
                    consonants++;
            }
        }

        System.out.println("• There are " + consonants + " consonants in your string.");
        return consonants;
    }

    // Returns a reference variable to a String
    // object with the inputs string reversed.
    public static String backwards(String userInput) {
        String backwards = "";

        // Reversing the input string
        for (int i = userInput.length() - 1; i >= 0; i--) {
            backwards = backwards + userInput.charAt(i);
        }

        System.out.println("• Your string backwards is: " + backwards);
        return backwards;
    }

    // Returns the number of whitespace characters
    public static int getWhiteSpace(String userInput) {
        int whitespace = 0;

        // Counting the whitespaces
        for (int i = 0; i < userInput.length(); i++) {
            char ch = userInput.charAt(i);

            if (ch == ' ') {
                whitespace++;
            }
        }

        System.out.println("• There are " + whitespace + " whitespace characters in your string.");
        return whitespace;
    }

    // Returns the number of digits (0-9) in string
    public static int getDigits(String userInput) {
        int digits = 0;

        // Counting digits
        for (int i = 0; i < userInput.length(); i++) {
            char ch = userInput.charAt(i);

            if (ch >= '0' && ch <= '9') {
                digits++;
            }
        }

        System.out.println("• There are " + digits + " digits in your string.");
        return digits;
    }

    // Returns the explanation of the binary joke if inputted
    public static void binaryJoke(String userInput) {
        if (userInput.equals("There are 10 types of people in the world, " +
                "those who understand binary and those who don’t")) {
            System.out.println("• Binary Joke Explanation: " +
                    "\n\tThere are only two digits in binary – 0s and 1s." +
                    "\n\tThe binary number 10 converted to decimal is 2." +
                    "\n\t128 | 64 | 32 | 16 | 8 | 4 | 2 | 1" +
                    "\n\t  0 |  0 |  0 |  0 | 0 | 0 | 1 | 0" +
                    "\n\t\"There are only 2 types of people in the world, " +
                    "\n\tthose who understand binary and those who don’t\"");
        }
    }
}