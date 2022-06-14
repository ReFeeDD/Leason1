package Lesson4;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        String[] words = {
                "One",
                "Two",
                "One",
                "One",
                "Three",
                "Four",
                "Five",
                "Six",
                "Seven",
                "Five",
                "Eight",
                "Eight",
                "Two",
                "Nine",
                "Ten",
                "One",
                "Six",
                "Five",
                "Four",
                "Three",
                "Two"
        };

        System.out.println("Word : How many word in list:");
        countUnique(words);



        Phonebook phonebook = new Phonebook();
        phonebook.add("Ivanov", "+7 953 123-45-67");
        phonebook.add("Ivanov", "+7 953 123-45-68");
        phonebook.add("Ivanov", "+7 953 123-45-69");
        phonebook.add("Ivanov", "+7 953 123-45-70");
        phonebook.add("Petrov", "+7 953 123-45-71");
        phonebook.add("Petrov", "+7 953 123-45-71");
        phonebook.add("Petrov", "+7 953 123-45-72");
        phonebook.add("Sidorov", "+7 953 123-45-72");
        phonebook.add("Sidorov", "+7 953 123-45-74");

        System.out.println("\n\nPhonebook.");
        System.out.println("Second name : Number:");
        phonebook.show();
    }

    private static void countUnique(String[] words) {
        Map<String, Integer> numberOfWords = new LinkedHashMap<>();
        for (String word : words) {
            countWord(numberOfWords, word);
        }
        for (String word: numberOfWords.keySet()) {
            System.out.println(word + " : " + numberOfWords.get(word) + ".");
        }
    }

    private static void countWord(Map<String, Integer> numberOfWords, String word) {
        if (numberOfWords.containsKey(word)) {
            numberOfWords.put(word, numberOfWords.get(word) + 1);
        }
        else {
            numberOfWords.put(word,1);
        }
    }
}