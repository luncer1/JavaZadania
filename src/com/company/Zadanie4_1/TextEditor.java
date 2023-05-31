package com.company.Zadanie4_1;

import java.io.*;

public class TextEditor {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.print("Wprowadź text: ");
            String text = reader.readLine();
            String codingStandard = "UTF-8"; // wybór coding standardu
            String filePath = "text.txt";
            try (OutputStreamWriter writer = new OutputStreamWriter(new FileOutputStream(filePath), codingStandard)) {
                writer.write(text);
                System.out.println("Zapisano!");
            } catch (IOException e) {
                System.out.println("Błąd zapisu." + e.getMessage());
            }
        } catch (IOException e) {
            System.out.println("Wystąpił błąd odczytu z konsoli: " + e.getMessage());
        }
    }
}
