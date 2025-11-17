package exceptionhandling;

import java.util.Scanner;

public class SimpleWordMatcher {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String sentence = scanner.nextLine();

        try {
            String[] words = sentence.split("\\s+"); 
            boolean found = false; 
            System.out.print("Words with the same first and last letter: ");
            for (String word : words) {
                if (word.length() > 0 && word.charAt(0) == word.charAt(word.length() - 1)) {
                    System.out.print(word + " ");
                    found = true; 
                }
            }

            if (!found) {
                throw new Exception("No words found with the same first and last letter.");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}