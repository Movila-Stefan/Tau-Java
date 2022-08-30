import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String str = scanner.nextLine();
        String[] strArray = str.split(" ");

        for (String temp: strArray){
            System.out.println(temp);
        }

        for(int i=0; i< strArray.length; i++){
            char[] s1 = strArray[i].toCharArray();
            for (int j = s1.length-1; j>=0; j--)
        {System.out.print(s1[j]);}
            System.out.print(" ");
        }
    }
}
