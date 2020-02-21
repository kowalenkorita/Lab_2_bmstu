package com.company;

import java.util.ArrayList;
import java.util.Scanner;

//Ввести n слов с консоли. Найти слово, состоящее только из различных символов.
// Если таких слов несколько, найти первое из них.

public class Lab_2_1 {
    public static void main(String[] args) {

        Scanner scan;

        String text;
        String[] textArray;

        System.out.println("Введите слова:");

        scan = new Scanner(System.in);
        text = scan.nextLine();

        textArray = text.split(" ");

        for(int i = 0; i < textArray.length; i++) {
            textArray[i] = textArray[i].replaceAll("[“:”,\"'`;()?_-]", "");
            if(findUniqueSymbols(textArray[i])) {
                System.out.print("Первое слово из различных символов:\n" + textArray[i]);
                break;
            }
        }
    }

    private static boolean findUniqueSymbols(String word) {
        boolean result = false;

        ArrayList<Character> list = new ArrayList<>();
        char[] chars = word.toCharArray();

        for(char c : chars) {
            if (list.contains(c)) {
                result = false;
                return result;
            }
            else {
                list.add(c);
                result = true;
            }
        }
        return result;
    }
}
