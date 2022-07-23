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
        int tokenSize = 0;
        boolean result;
        char genRandom;

        do {
            System.out.println("Dostępne rozmiary tokenów to 5, 10, 15. Podaj wielkość z rozmiarów ");


            tokenSize = scanner.nextInt();


            if (tokenSize == 5) {
                result = true;
            } else if (tokenSize == 10) {
                result = true;
            } else if (tokenSize == 15) {
                result = true;
            } else {
                result = false;
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
