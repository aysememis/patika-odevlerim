import java.util.Scanner;

public class PolindromSayi {

    static boolean isPalindrom(int sayi) {
        int geciciSayi = sayi, tersSayi = 0, sonBasamak;

        while (geciciSayi != 0) {

            System.out.println("----------------");

            System.out.println("Geçici sayı:" + geciciSayi);

            sonBasamak = geciciSayi % 10;
            System.out.println("Son basamak:" + sonBasamak);

            tersSayi = (tersSayi * 10) + sonBasamak;
            System.out.println("Sayının tersi:" + tersSayi);

            geciciSayi /= 10;    // basamak sayısını bulma
            System.out.println("Yeni geçici sayı:" + geciciSayi);
        }

        if (sayi == tersSayi) {
            return true;
        } else {
            return false;
        }
    }

        public static void main (String[]args){

           // Scanner inp = new Scanner(System.in);
            //System.out.println("Please enter a number:");
            //int number = inp.nextInt();

            System.out.println(isPalindrom(512));

        }

    }
