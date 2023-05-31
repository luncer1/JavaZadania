package com.company.Zadanie4_2;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.GZIPInputStream;

public class FileDecompressor {
    public static void decompressFile(String compressedFilePath, String decompressedFilePath) {
        try (GZIPInputStream gzipIS = new GZIPInputStream(new FileInputStream(compressedFilePath));
             FileOutputStream fos = new FileOutputStream(decompressedFilePath)) {

            byte[] buffer = new byte[1024];
            int bytesRead;
            while ((bytesRead = gzipIS.read(buffer)) != -1) {
                fos.write(buffer, 0, bytesRead);
            }

            System.out.println("Rozapkowano GZIP");
        } catch (IOException e) {
            System.out.println("Błąd " + e.getMessage());
        }
    }
}

