import java.util.Scanner;

public class Multiplication_Table {
    public static void main(String[] args) {

        int result, num;
        System.out.println("Please enter a number of multiple multiplication table: ");

        Scanner scanner = new Scanner(System.in);
        num = scanner.nextInt();

        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= num; j++) {

                result = j * i;

                System.out.println("\t\t" + j + "*" + i + "=" + result);}
                System.out.println(" ");

            }
        }
    }
