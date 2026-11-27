package org.example;


import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        System.out.println("Привет, AQA");
        ;

        for (int i = -1; i < 5; i++) {
            System.out.println( "Попытка № " + (i + 1));
        }

        int[] numbers = {1,2,3,4,5};
        String[] names = {"Stas", "Sacha", "Lexa"};

        System.out.println(numbers.length);
        System.out.println(names[2]);

        names[2] = "Vasya";
        for (String n : names) {
            System.out.println(n);
        }



        int number = 26;
        System.out.println(EvenNumber.evenNumbers(number));


        int result = MaxNumber.max(4, 10, 1);
        System.out.println(result);

    }
}