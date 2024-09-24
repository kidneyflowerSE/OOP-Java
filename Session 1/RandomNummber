import java.util.Random;
import java.util.Scanner;


public class RandomNumber {
    public static void main(String[] args) {
        Random rand = new Random();

        int number_1 = rand.nextInt(10);
        int number_2 = rand.nextInt(10);

        System.out.println(number_1);
        System.out.println(number_2);
        int c;
        if (number_1 < number_2) {
            c = number_1;
            number_1 = number_2;
            number_2 = c;
        }
        System.out.println("What is " + number_1 +  " - "  + number_2);
        Scanner sc = new Scanner(System.in);
        int result = sc.nextInt();
        if (number_1 - number_2 == result) {
            System.out.println("True");
        }
        else System.out.println("False");
    }
}
