package queue.queuechallange;

import queue.ArrayQueue;

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


        ArrayQueue stringQueue = new ArrayQueue<Character>(testString.length());
        LinkedList stringStack = new LinkedList<Character>();


        for(int i = 0; i < testString.length();i++){
            stringQueue.add(testString.charAt(i));
            stringStack.push(testString.charAt(i));
        }


        while(stringQueue.size() != 0 && !stringStack.isEmpty()){
            Character topCharacter = (Character) stringQueue.remove();
            Character topReversedCharacter = (Character) stringStack.pop();

            if (topCharacter != topReversedCharacter) {
                return false;
            }
        }
        return true;
    }
}
