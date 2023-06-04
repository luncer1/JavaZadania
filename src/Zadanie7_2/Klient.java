package Zadanie7_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class Klient {
    public static void main(String[] args) {
        try {
            Socket polaczenie = new Socket("localhost", 9696);
            PrintWriter out = new PrintWriter(polaczenie.getOutputStream(), true);
            BufferedReader in = new BufferedReader(new InputStreamReader(polaczenie.getInputStream()));
            String response = in.readLine();
            System.out.println(response);

            boolean koniec = false;
            int odkryte = 0;

            while (!koniec && odkryte < 71) {
                BufferedReader userInput = new BufferedReader(new InputStreamReader(System.in));
                System.out.print("Wybierz pole: ");
                String input = userInput.readLine();
                out.println(input);
                String result = in.readLine();
                System.out.println("Odpowiedź: " + result);

                if (result.equals("bum")) {
                    koniec = true;
                } else {
                    odkryte++;
                }
            }

            polaczenie.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}