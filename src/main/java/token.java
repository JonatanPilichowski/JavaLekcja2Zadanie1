import com.sun.jdi.connect.Connector;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class token {
    static void tokenGenerator() {
        System.out.println("Siema");

    }


    public static void main(String[] args) {

        tokenGenerator();
        Scanner scanner = new Scanner(System.in);
        boolean result;
        char genRandom;
        int tokenSize = 0;
        String inputString;

        boolean resultCheck;

        do {
            System.out.println("Dostępne rozmiary tokenów to 5, 10, 15. Podaj cyfrę dla interesującego Cię rozmiaru tokenu.");

            inputString = scanner.nextLine();
            try {
                Integer.parseInt(inputString);
                resultCheck = true;
            } catch (NumberFormatException ex) {
                resultCheck = false;
            }
            if (resultCheck) {
                tokenSize = Integer.parseInt(inputString);
                if (tokenSize == 5) {
                    result = true;
                } else if (tokenSize == 10) {
                    result = true;
                } else if (tokenSize == 15) {
                    result = true;
                } else {
                    result = false;
                    System.out.println("Wybrałeś złą cyfrę. Dostępne cyfry to: 5, 10, 15. Spróbuj jeszcze raz.");
                }
            } else {
                result = false;
                System.out.println("Akceptowane są tylko cyfry. Spróbuj jeszcze raz.");
            }


        } while (!result);


        System.out.println("Wybrałeś token o rozmiarze: " + tokenSize + ".");

        List<String> tokenValue = new ArrayList<>();

        for (int i = 0; i < tokenSize; i++) {
            Random r = new Random();
            genRandom = (char) (r.nextInt(93) + '!');
            tokenValue.add(String.valueOf(genRandom));

        }
        String listString = String.join("", tokenValue);
        System.out.println("Wygenerowano token: " + listString);
    }

}
