import java.util.Scanner;

public class Random_Num_10 {
    public static void main(String [] args){
        double randomDouble = Math.random();
        randomDouble = randomDouble* 40 + 1;
        int randomInt = (int)randomDouble;
        System.out.println("Random number generated by system is: "+randomInt);

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        while(num!=randomInt){
            if(num<randomInt){
            }
            if(num>randomInt) {
                System.out.println(" Number is too big");
            }
            num=sc.nextInt();
            System.out.println("Number is too small");
        }
        System.out.println("Number is same");
    }
}


