package stack.stackchallange;

import stack.LinkedStack;

import java.util.LinkedList;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        // should return true
        System.out.println(checkForPalindrome("abccba"));
        // should return true
        System.out.println(checkForPalindrome("Was it a car or a cat I saw?"));
        // should return true
        System.out.println(checkForPalindrome("I did, did I?"));
        // should return false
        System.out.println(checkForPalindrome("hello"));
        // should return true
        System.out.println(checkForPalindrome("Don't nod"));
        System.out.println(checkForPalindrome("racecar"));
        System.out.println(checkForPalindrome("ana"));
        System.out.println(checkForPalindrome("adasdadsafge4t4&&&...   "));
    }

    public static boolean checkForPalindrome(String string) {
        String inputString = string.toLowerCase();
        String testString = inputString.chars() //Remove spaces and punctuation
                .filter(Character::isLetter)
                .mapToObj(c -> String.valueOf((char) c))
                .collect(Collectors.joining());
        String reversedTestString = new StringBuilder(testString).reverse().toString(); //Reverse the string

        LinkedList stringStack = new LinkedList<Character>();
        LinkedList reversedStringStack = new LinkedList<Character>();

        for(int i = 0; i < testString.length();i++){ //Push the string characters to the stacks
            stringStack.push(testString.charAt(i));
            reversedStringStack.push(reversedTestString.charAt(i));
        }

        while(!stringStack.isEmpty() && !reversedStringStack.isEmpty()){ //check if the top from both normal and reversed strings are equal to each other, if one pair is not, then it's not a palindrome
            Character topCharacter = (Character) stringStack.pop();
            Character topReversedCharacter = (Character) reversedStringStack.pop();

            if (topCharacter != topReversedCharacter) {
                return false;
            }
        }
        return true;
    }
}
