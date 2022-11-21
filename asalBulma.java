import java.util.Scanner;

public class AsalSayiProgrami {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Sayı giriniz:");
        int a = input.nextInt();
        
        asalBulma(a);
    }
    
    static void asalBulma(int a) {

        int sayac = 0;
        for (int i = 2; i < a; i++) {

            if (a % i == 0) {
                sayac++;
            }
        }

        if (sayac > 0) {
            System.out.println("Asal değildir!");
        } else {
            System.out.println("Asal sayıdır.");
        }
    }
}
