import java.util.Scanner;

public class N22DCCI018_EX22 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            double h = sc.nextDouble();
            double w = sc.nextDouble();
            if (w <= 0 || h <= 0) {
                System.out.println("Chieu dai hoac rong khong hop le");
            }
            else {
                System.out.println("Chu vi = " + ((h + w) * 2));
                System.out.println("Dien tich = " + (h * w));
            }
        }
    }    
}
