package Chapter3;


/*
IF Statement.
All salespeople get a payment of 1000 a week
Salespeople who exceed 10 sales get an additional bonus of 250.
 */

import java.util.Scanner;

public class SalaryCalculator {

    public static void main(String[] args) {

        int salary = 1000;
        int bonus = 250;

        System.out.println("How many sales did you do?");
        Scanner scanner = new Scanner(System.in);
        int sales = scanner.nextInt();
        scanner.close();

        int numberOfSallesToGetTheBonuss = 10;
        if (sales > numberOfSallesToGetTheBonuss){
            salary = salary + bonus;
        }
        System.out.println("your salary is " + salary);
    }

}
