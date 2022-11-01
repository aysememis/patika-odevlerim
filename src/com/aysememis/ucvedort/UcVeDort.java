
import java.util.Scanner;

public class UcVeDort {
    
    public static void main(String[] args) {
        
        int number;
        int sayi = 0;
        int total = 0;
        
        Scanner inp = new Scanner(System.in);
        System.out.print("Sayı giriniz:");
        number = inp.nextInt();

        for (int a = 1; a <= number; a++) {
            if (a % 12 == 0) {
                System.out.println(a);
                
                sayi++;
                total += a;
            }
        }
        
        double ort = total / sayi;
        
        System.out.println("ortalama: " + ort);

    }
}
