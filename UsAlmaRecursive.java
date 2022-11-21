import java.util.Scanner;

public class RecursiveUsHesabi {

    static int usAlma(int sonuc, int taban, int kuvvet) {
       sonuc *=taban;
        kuvvet --;

        if (kuvvet >= 1) {
            sonuc =usAlma(sonuc,taban,kuvvet);

        }
        return sonuc;
    }
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("tabanı giriniz:");
        int taban= input.nextInt();
        System.out.print("kuvveti giriniz:");
        int kuvvet= input.nextInt();

       int case1=usAlma(1,taban,kuvvet);
        System.out.println(case1);


    }
}
