package com.aysememis.cin;

/**
 * @author Ayşe Memiş
 * @since 1.0.0
 */
import java.util.Scanner;

public class CinZodyagi {
    public static void main(String[] args) {

        int dogumYili;

        Scanner input= new Scanner(System.in);

        System.out.println("Doğum yılınız:");
        dogumYili= input.nextInt();

        int kalan=dogumYili%12;

        if(kalan==0){
            System.out.println("Çin zodyağınız MAYMUN!");
        }else if(kalan==1){
            System.out.println("Çin zodyağınız HOROZ!");
        }else if(kalan==2){
            System.out.println("Çin zodyağınız KÖPEK!");
        }else if(kalan==3){
            System.out.println("Çin zodyağınız DOMUZ!");
        }else if(kalan==4){
            System.out.println("Çin zodyağınız FARE!");
        }else if(kalan==5){
            System.out.println("Çin zodyağınız ÖKÜZ!");
        }else if(kalan==6){
            System.out.println("Çin zodyağınız KAPLAN!");
        }else if(kalan==7){
            System.out.println("Çin zodyağınız TAVŞAN!");
        }else if(kalan==8){
            System.out.println("Çin zodyağınız EJDERHA!");
        }else if(kalan==9){
            System.out.println("Çin zodyağınız YILAN!");
        }else if(kalan==10){
            System.out.println("Çin zodyağınız AT!");
        }else if(kalan==11){
            System.out.println("Çin zodyağınız KOYUN!");
        }else{
            System.out.println("Hatalı sayı girdiniz!");
        }

    }
}
