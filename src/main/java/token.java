import com.sun.jdi.connect.Connector;

import java.util.*;

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

        Random r = new Random();
      //  List<Integer> charactersToDraw =  Arrays.asList(33,35,36,37,38,40,41,42,64,94);
        List<Integer> charactersToDraw=new ArrayList<>();
        // a-z = 97-122 ; A-Z 65-90 ; 0-9 = 48-57 ; [!@#$%^&*()] = 33, 35, 36, 37, 38, 40, 41, 42, 64, 94 ;
        for (int i=0; i<=25; i++){
            charactersToDraw.add(65+i);
            charactersToDraw.add(97+i);
        }

      //  List<String> charactersToDrawChar = new ArrayList<>();


        for (int j = 0; j < tokenSize; j++) {

         //   genRandom = (char) (r.nextInt(93) + '!');
         //   tokenValue.add(String.valueOf(genRandom));

            int randomNumber=  charactersToDraw.get(r.nextInt(charactersToDraw.size()));
            genRandom= (char) randomNumber;
            tokenValue.add(String.valueOf(genRandom));
        }
        String listString = String.join("", tokenValue);
        System.out.println("Wygenerowano token: " + listString);
        System.out.println("lista: " + charactersToDraw);
    }

}
