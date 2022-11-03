import java.util.Scanner;

public class DortVeBesinKuvvetleri {
    public static void main(String[] args) {
        int number;
        int deger4 = 1;
        int deger5 = 1;

        Scanner input = new Scanner(System.in);
        
        System.out.print("Sayı giriniz:");
        number = input.nextInt();
        
        System.out.println("Dördün kuvvetleri:");
        
        while (deger4 < number) {

            System.out.println(deger4);
            deger4 *= 4;

        }
        System.out.println("-----------");
        
        System.out.println("Beşin kuvvetleri:");
        
        while (deger5 < number) {
            System.out.println(deger5);
            deger5 *= 5;
        }

    }
}
