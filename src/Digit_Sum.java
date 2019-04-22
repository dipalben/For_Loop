import java.util.Scanner;

public class Digit_Sum {

    public static void main(String args[])
    {
        int m, n,o,p,q, sum = 0;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter 1st number:");
        m = s.nextInt();
        System.out.println(" Enter 2nd number: ");
        n = s.nextInt();
        System.out.println("Enter 3rd number:");
        o = s.nextInt();
        System.out.println("Enter 4th number:");
        p = s.nextInt();
        System.out.println("Enter 5th number:");
        q = s.nextInt();

        while(m > 0)
        {
            n = m % 10;
            sum = sum + n + o +p +q ;
            m = m / 10;
        }
        System.out.println("Sum of Digits:"+sum);
    }




}
