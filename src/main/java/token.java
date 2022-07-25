import java.util.*;

public class token {
    static void tokenGenerator(int tokenSize) {

        /*This method generates the token values from 72 characters pool. Token size is specified by tokenSize parameter */
        System.out.println("You have chosen token size: " + tokenSize + ".");
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
        System.out.println("Generated token: " + listString);
    }

    static boolean stringToIntValidator(String inputString) {
        /* returns true if values is int */
        try {
            Integer.parseInt(inputString);
            return true;
        } catch (NumberFormatException ex) {
            return false;
        }

    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        boolean result;
        String inputString;
        int tokenSize = 0;
        int size1 = 5;
        int size2 = 10;
        int size3 = 15;
        String infoText = "Available numbers are: " + size1 + ", " + size2 + ", " + size3 + ".";
        String please = " Please try again.";
        System.out.println("There are three acceptable token sizes. "+ infoText);
        do {

            inputString = scanner.nextLine();

            if (stringToIntValidator(inputString)) {
                tokenSize = Integer.parseInt(inputString);
                if (tokenSize == size1) {
                    result = true;
                } else if (tokenSize == size2) {
                    result = true;
                } else if (tokenSize == size3) {
                    result = true;
                } else {
                    result = false;
                    System.out.println("Wrong number. "+ infoText + please);
                }
            } else {
                result = false;
                System.out.println("Wrong character. "+ infoText + please);
            }
        } while (!result);
        tokenGenerator(tokenSize);


    }
}