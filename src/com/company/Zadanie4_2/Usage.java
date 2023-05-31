package com.company.Zadanie4_2;

public class Usage {
    public static void main(String[] args) {
        FileCompressor.compressFile("/Users/krzysztof/Programming/Java/JavaZadania/tekst.txt","/Users/krzysztof/Programming/Java/JavaZadania/file.gz");
        FileDecompressor.decompressFile("/Users/krzysztof/Programming/Java/JavaZadania/file.gz", "/Users/krzysztof/Programming/Java/JavaZadania/tekst_rozpakowany.txt");
    }
}
