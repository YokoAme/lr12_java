package org.example.task1;

import java.util.HashMap;
import java.util.Map;

public class MainPetDemo {

    public static void printPetNames(Map<String, Pet> petsMap) {
        for (Pet key : petsMap.values()) {
            System.out.println(key);
        }
    }

    public static void main(String[] args) {
        Map<String, Pet> pets = new HashMap<>();
        pets.put("Барсик", new Cat("cat"));
        pets.put("Шарик", new Dog("dog"));
        pets.put("Кеша", new Parrot("parrot"));
        pets.put("Мурзик", new Cat("cat"));

        System.out.println("Имена всех животных:");
        printPetNames(pets);
    }
}
