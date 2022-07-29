import java.util.*;

public class token {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int size1 = 5;
        int size2 = 10;
        int size3 = 15;
        String infoText = "Available numbers are: " + size1 + ", " + size2 + ", " + size3 + ".";
        String please = " Please try again.";
        System.out.println("There are three acceptable token sizes. " + infoText);
        int tokenSize = getTokenSize(scanner, size1, size2, size3, infoText, please);
        tokenGenerator(tokenSize);


    }

    private static int getTokenSize(Scanner scanner, int size1, int size2, int size3, String infoText, String please) {
        String inputString;
        boolean result;
        int tokenSize = 0;
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
                    System.out.println("Wrong number. " + infoText + please);
                }
            } else {
                result = false;
                System.out.println("Wrong character. " + infoText + please);
            }
        } while (!result);
        return tokenSize;
    }

    static boolean stringToIntValidator(String inputString) {
        /* returns true if value is int */
        try {
            Integer.parseInt(inputString);
            return true;
        } catch (NumberFormatException ex) {
            return false;
        }

    }

    static List<Integer> ListOfCharactersToDraw() {

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

        return charactersToDraw;

    }

    static List<String> generateToken(int tokenSize) {

        /*This method generates the token values from 72 characters pool. Token size is specified by tokenSize parameter */
        List<String> tokenValueList = new ArrayList<>();
        char genRandom;
        Random random = new Random();

        List<Integer> ListOfCharactersToDraw = ListOfCharactersToDraw();
        for (int k = 0; k < tokenSize; k++) {
            int randomNumber = ListOfCharactersToDraw.get(random.nextInt(ListOfCharactersToDraw.size()));
            genRandom = (char) randomNumber;
            tokenValueList.add(String.valueOf(genRandom));
        }
        return tokenValueList;

    }

    static void tokenGenerator(int tokenSize) {


        System.out.println("You have chosen token size: " + tokenSize + ".");

        List<String> tokenValueList = generateToken(tokenSize);
        String tokenString = String.join("", tokenValueList);

        System.out.println("Generated token: " + tokenString);
    }
}