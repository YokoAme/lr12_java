package org.example;
import java.io.*;
import java.util.*;
import java.io.*;
import java.util.*;

public class TempWriter15 {
    public static void run() {
        System.out.println("\n[Задание 2.1] Введите 15 температур (разделитель . или ,)");
        Scanner sc = new Scanner(System.in);
        String filename = "temps.txt";

        try (PrintWriter pw = new PrintWriter(new FileWriter(filename))) {
            for (int i = 1; i <= 15; i++) {
                while (true) {
                    System.out.print("Температура #" + i + ": ");
                    String raw = sc.nextLine().trim();
                    if (raw.isEmpty()) continue;
                    try {
                        // принимаем и запятую, и точку
                        double t = Double.parseDouble(raw.replace(',', '.'));
                        // пишем в единообразном формате с точкой
                        pw.printf(Locale.US, "%.6f%n", t);
                        break;
                    } catch (NumberFormatException ex) {
                        System.out.println("Некорректное число, попробуй ещё раз.");
                    }
                }
            }
            System.out.println("Температуры сохранены в файл: " + filename);
        } catch (IOException e) {
            System.out.println("Ошибка при записи: " + e.getMessage());
        }
    }
}
