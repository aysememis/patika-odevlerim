import java.util.Scanner;

public class GelismisHesapMakinesi {

    static int toplam(int sayi1, int sayi2) {
        int sonuc = sayi1 + sayi2;
        System.out.println("Sonuç değeri:" + sonuc);
        return sonuc;

    }

    static int cikarma(int sayi1, int sayi2) {
        int sonuc = sayi1 - sayi2;
        System.out.println("Sonuç değeri:" + sonuc);
        return sonuc;
    }

    static int carpma(int sayi1, int sayi2) {

        int sonuc = sayi1 * sayi2;
        System.out.println("Sonuç değeri:" + sonuc);
        return sonuc;

    }

    static int bolme(int sayi1, int sayi2) {
        if(sayi2==0){
            return 0;
        }
        int sonuc = sayi1 / sayi2;
        System.out.println("Sonuç değeri:" + sonuc);
        return sonuc;
    }
    static int kuvvet(int sayi1, int sayi2) {
        int sonuc=1;

        for(int i=1; i<=sayi2; i++){
            sonuc *=sayi1;
        }

        System.out.println("Sonuç değeri:" + sonuc);
        return sonuc;
    }
    static int mod(int sayi1, int sayi2) {
        if (sayi2 == 0) {
            System.out.println("payda sıfır olamaz!");
            return 0;
        }
        int sonuc = sayi1 % sayi2;
        System.out.println("Sonuç değeri:" + sonuc);
        return sonuc;
    }

    static void dikdortgen(int sayi1, int sayi2){
        int alan=(sayi1*sayi2);
        int cevre=2*(sayi1+sayi2);
        System.out.println("alan:\n"+alan+"çevre:\n"+cevre);

    }


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int secim;

        String menu = "1-toplama işlemi\n"
                + "2-çıkarma işlemi\n"
                + "3-çarpma işlemi\n"
                + "4-bölme işlemi\n"
                + "5-üslü sayı hesaplama\n"
                + "6-mod alma\n"
                + "7-dikdötgen alan ve çevre hesabı\n"
                + "0-çıkış yap";

        System.out.println(menu);


        while (true) { // true verdiğimiz için bu döngü her zaman başlayacak.
            System.out.println("-----------------------");
            System.out.print("bir işlem seçimi yapınız:");
            secim = input.nextInt();

            if (secim == 0) {
                break;
            }
            System.out.print("Birinci sayıyı giriniz:");
            int sayi1 = input.nextInt();
            System.out.print("İkinci sayıyı giriniz:");
            int sayi2 = input.nextInt();

            if (secim == 1) {
                toplam(sayi1, sayi2);
            } else if (secim == 2) {
                cikarma(sayi1, sayi2);
            } else if (secim == 3) {
                carpma(sayi1, sayi2);

            }else if(secim==4){
                if(sayi2==0){
                    System.out.println("payda sıfır olamaz!");
                }else{
                    bolme(sayi1,sayi2);
                }
            }else if(secim==5){
                kuvvet(sayi1,sayi2);
            }else if(secim==6){
                mod(sayi1,sayi2);
            }else if(secim==7){
                dikdortgen(sayi1,sayi2);
            }else{
                System.out.println("hatalı sayı girdiniz!");
            }



            System.out.println("güle güle");



        }
    }
}
