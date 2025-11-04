package org.example;
import java.io.*;

public class AboutMeIO {
    public static void run() {
        System.out.println("\n[Задание 1] Создание и чтение файла 'О себе'");

        String filename = "about_me.txt";
        String info = "Имя: Машенька\nГруппа: т-318\nХобби: рисовать и шить игрушки";

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filename))) {
            writer.write(info);
            System.out.println("Файл успешно создан: " + filename);
        } catch (IOException e) {
            System.out.println("Ошибка записи: " + e.getMessage());
        }

        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            System.out.println("Содержимое файла:");
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("Ошибка чтения: " + e.getMessage());
        }
    }
}
