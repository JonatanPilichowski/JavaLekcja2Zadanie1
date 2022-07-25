import java.util.*;

public class token {
    static void tokenGenerator(int tokenSize) {

        //This method generates the token from 72 characters pool. Token size is specified by tokenSize parameter;
        System.out.println("Wybrałeś token o rozmiarze: " + tokenSize + ".");
        char genRandom;
        Random r = new Random();
        List<String> tokenValue = new ArrayList<>();
        List<Integer> charactersToDraw = new ArrayList<>();
        //ASCII: a-z = 97-122 ; A-Z 65-90 ; 0-9 = 48-57 ; [!@#$%^&*()] = 33, 35, 36, 37, 38, 40, 41, 42, 64, 94 ;
        for (int i = 0; i <= 25; i++) {
            charactersToDraw.add(65 + i);
            charactersToDraw.add(97 + i);
        }
        for (int j = 0; j <= 9; j++) {
            charactersToDraw.add(48 + j);
        }
        charactersToDraw.addAll(Arrays.asList(33, 35, 36, 37, 38, 40, 41, 42, 64, 94));

        for (int k = 0; k < tokenSize; k++) {
            int randomNumber = charactersToDraw.get(r.nextInt(charactersToDraw.size()));
            genRandom = (char) randomNumber;
            tokenValue.add(String.valueOf(genRandom));
        }
        String listString = String.join("", tokenValue);
        System.out.println("Wygenerowano token: " + listString);
    }

    static void Validator(String inputString, boolean resultCheck){
        Scanner scanner = new Scanner(System.in);
        inputString = scanner.nextLine();
        try {
            Integer.parseInt(inputString);
            resultCheck = true;
        } catch (NumberFormatException ex) {
            resultCheck = false;
        }

    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        boolean result;
        String inputString;
        boolean resultCheck;
        int tokenSize = 0;

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
        tokenGenerator(tokenSize);


    }
}