package Lesson_9;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PhoneBook {
    private Map<String, List<String>> phoneBook;

    public PhoneBook() {
        this.phoneBook = new HashMap<>();
    }

    public void add(String lastName, String phoneNumber) {
        phoneBook.putIfAbsent(lastName, new ArrayList<>());
        phoneBook.get(lastName).add(phoneNumber);
    }

    public List<String> get(String lastName) {
        return phoneBook.getOrDefault(lastName, new ArrayList<>());
    }

    public static void main(String[] args) {
        PhoneBook phoneBook = new PhoneBook();
        phoneBook.add("Ivanov", "1234567890");
        phoneBook.add("Petrov", "0987654321");
        phoneBook.add("Ivanov", "1112223333");
        phoneBook.add("Sidorov", "2223334444");
        phoneBook.add("Petrov", "+79165682502");

        System.out.println("Телефоны Иванова: " + phoneBook.get("Ivanov"));
        System.out.println("Телефоны Петрова: " + phoneBook.get("Petrov"));
        System.out.println("Телефоны Сидорова: " + phoneBook.get("Sidorov"));
        System.out.println("Телефоны неизвестного: " + phoneBook.get("Unknown"));
    }
}
