package Chapter3;

import java.util.Scanner;

public class QuotaCalculator {
    public static void main(String[] args) {

        int quota = 10;

        System.out.println("ENTER THE NUMBER OF SALES YOU MADE");
        Scanner scanner = new Scanner(System.in);
        int sales = scanner.nextInt();
        scanner.close();

        if (sales >= quota){
            System.out.println("Congrats! You've met your quota");
        }else {
            int salesShort = quota - sales;
            System.out.println("You did not make your quota. Yo were" + salesShort + " sales short ");
        }

    }
}
