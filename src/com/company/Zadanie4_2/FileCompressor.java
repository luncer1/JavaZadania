package com.company.Zadanie4_2;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.GZIPOutputStream;

public class FileCompressor {
    public static void compressFile(String sourceFilePath, String compressedFilePath) {
        try (FileInputStream fis = new FileInputStream(sourceFilePath);
             GZIPOutputStream gzipOS = new GZIPOutputStream(new FileOutputStream(compressedFilePath))) {

            byte[] buffer = new byte[1024];
            int bytesRead;
            while ((bytesRead = fis.read(buffer)) != -1) {
                gzipOS.write(buffer, 0, bytesRead);
            }

            System.out.println("Dodano plik do GZIP");
        } catch (IOException e) {
            System.out.println("Błąd " + e.getMessage());
        }
    }
}

