package Chapter3;

import java.util.Scanner;

public class LoanQualifier {
    public static void main(String[] args) {

        int requierdSalary = 30000;
        int requierdYearsEmployed = 2;

        System.out.println("Enter your salary");
        Scanner scanner = new Scanner(System.in);
        double salary = scanner.nextDouble();

        System.out.println("Enter the number of years with your current employer:");
        double years = scanner.nextDouble();

        scanner.close();

        if (salary >= requierdSalary){
            if (years >= requierdYearsEmployed){
                System.out.println("Congrats! you qualify for the loan");
            }else {
                System.out.println("Sorry, you mast have worked at youe curent job" + requierdYearsEmployed + "years ");
            }
        }else {
            System.out.println("Sorry your must earn at least " + requierdSalary);
        }


    }
}
