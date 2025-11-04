package org.example;
import java.io.*;
import java.util.*;
import java.io.*;
import java.util.*;

public class TempAverageCalc {
    public static void run() {
        System.out.println("\n[Задание 2.2] Расчёт средней температуры");
        String filename = "temps.txt";

        double sum = 0.0;
        int count = 0;

        try (BufferedReader br = new BufferedReader(new FileReader(filename))) {
            for (String line; (line = br.readLine()) != null; ) {
                line = line.trim();
                if (line.isEmpty()) continue;

                line = line.replace(',', '.');
                try {
                    double x = Double.parseDouble(line);
                    sum += x;
                    count++;
                } catch (NumberFormatException ignore) {

                }
            }
            if (count > 0) {
                System.out.println("Средняя температура = " + (sum / count));
            } else {
                System.out.println("Файл пуст или данные не распознаны.");
            }
        } catch (IOException e) {
            System.out.println("Ошибка чтения файла: " + e.getMessage());
        }
    }
}
