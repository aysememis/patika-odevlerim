package com.aysememis.artikyil;

/**
 * @author Ayşe Memiş
 * @since 1.0.0
 */
import java.util.Scanner;

public class ArtikYil {
    public static void main(String[] args) {
        int yil;

        Scanner input=new Scanner(System.in);
        System.out.println("yıl giriniz");
        yil= input.nextInt();

        int mod4 =yil%4;
        int mod100=yil%100;
        int mod400=yil%400;

        if(mod100==0){
            if(mod400==0){
                System.out.println("Artık yıl!");
            }else{
                System.out.println("Artık yıl değildir!");
            }
        }else if(mod4==0){
            System.out.println("Artık yıl!");
        }else{
            System.out.println("Artık yıl değil!");
        }


    }
}
