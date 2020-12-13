package com.example.countalphabet;

import java.util.HashMap;
import java.util.Locale;
import java.util.Scanner;

public class CountEachAlphabet {
    public static void main(String[] args) {
        String stringInput;
        Scanner Input = new Scanner(System.in);

        System.out.print("Enter you string: ");
        stringInput = Input.nextLine();
        stringInput = stringInput.toLowerCase();

        CountAlphabet(stringInput);
    }

    private static void CountAlphabet(String stringUserInput) {
        HashMap<Character, Integer> charCount = new HashMap<>();
        char[] stringToChar = stringUserInput.toCharArray();

        for (char character : stringToChar){
            if (charCount.containsKey(character))
                charCount.put(character, charCount.get(character)+1);
            else
                charCount.put(character, 1);
        }

        System.out.println("Total each alphabet in a string: ");
        System.out.print(charCount);
    }
}
