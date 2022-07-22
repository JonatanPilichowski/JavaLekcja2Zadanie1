
import java.util.Scanner;

public class tokenGenerator {
    public static void tokenGenerator(String[] args) {

        Scanner scanner= new Scanner(System.in);
        int income=0;
        char genRandom;

        do {
            System.out.println("Dostępne rozmiary tokenów to 5, 10, 15. Podaj wielkość z rozmiarów ");
            income = scanner.nextInt();


        }while (income != 5 || income !=10 || income !=15);

        System.out.println("Wybrałeś rozmiar: " + income);



    }

}
