package org.example;
import java.io.*;
import java.util.*;
import java.io.*;
import java.util.*;

public class RandomSplitFloats {
    public static void run() {
        System.out.println("\n[Задание 3] Генерация и разделение дробных чисел");

        Random rnd = new Random();
        String all = "numbers.txt";
        String positives = "positive.txt";
        String nonPositives = "non_positive.txt";


        try (PrintWriter pw = new PrintWriter(new FileWriter(all))) {
            for (int i = 0; i < 20; i++) {
                double x = -5 + 10 * rnd.nextDouble();
                pw.printf(Locale.US, "%.6f%n", x);
            }
            System.out.println("Файл " + all + " успешно создан.");
        } catch (IOException e) {
            System.out.println("Ошибка генерации: " + e.getMessage());
        }

        int cntPos = 0, cntNonPos = 0;
        try (Scanner sc = new Scanner(new File(all));
             PrintWriter pwPos = new PrintWriter(new FileWriter(positives));
             PrintWriter pwNonPos = new PrintWriter(new FileWriter(nonPositives))) {

            sc.useLocale(Locale.US);

            while (sc.hasNext()) {
                String token = sc.next().trim();
                if (token.isEmpty()) continue;

                token = token.replace(',', '.');

                try {
                    double x = Double.parseDouble(token);
                    if (x > 0) {
                        pwPos.printf(Locale.US, "%.6f%n", x);
                        cntPos++;
                    } else {
                        pwNonPos.printf(Locale.US, "%.6f%n", x);
                        cntNonPos++;
                    }
                } catch (NumberFormatException ignore) {
                }
            }

            System.out.println("Положительные записаны в " + positives + " (шт: " + cntPos + ")");
            System.out.println("Неположительные записаны в " + nonPositives + " (шт: " + cntNonPos + ")");
        } catch (IOException e) {
            System.out.println("Ошибка разделения: " + e.getMessage());
        }
    }
}
