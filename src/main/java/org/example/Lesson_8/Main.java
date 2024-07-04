package org.example.Lesson_8;

public class Main {
    public static void main(String[] args) {
        String[][] validArray = {
                {"1", "2", "3", "4"},
                {"5", "6", "7", "8"},
                {"9", "10", "11", "12"},
                {"13", "14", "15", "16"}
        };

        String[][] invalidSizeArray = {
                {"1", "2", "3"},
                {"4", "5", "6"},
                {"7", "8", "9"}
        };

        String[][] invalidDataArray = {
                {"1", "2", "3", "4"},
                {"5", "6", "seven", "8"},
                {"9", "10", "11", "12"},
                {"13", "14", "15", "16"}
        };

        try {
            int sum = ArrayProcessor.processArray(validArray);
            System.out.println("Сумма элементов: " + sum);
        } catch (MyArraySizeException | MyArrayDataException e) {
            System.err.println(e.getMessage());
        }

        try {
            int sum = ArrayProcessor.processArray(invalidSizeArray);
            System.out.println("Сумма элементов: " + sum);
        } catch (MyArraySizeException | MyArrayDataException e) {
            System.err.println(e.getMessage());
        }

        try {
            int sum = ArrayProcessor.processArray(invalidDataArray);
            System.out.println("Сумма элементов: " + sum);
        } catch (MyArraySizeException | MyArrayDataException e) {
            System.err.println(e.getMessage());
        }
    }
}