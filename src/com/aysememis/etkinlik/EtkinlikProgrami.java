package com.aysememis.etkinlik;

/**
 * @author Ayşe Memiş
 * @since 1.0.0
 */

import java.util.Scanner;

public class EtkinlikProgrami {
    public static void main(String[] args) {
        int sicaklik;

        Scanner input = new Scanner(System.in);
        System.out.println("Sıcaklık giriniz:");
        sicaklik = input.nextInt();

         /*  if(sicaklik<5){
            System.out.println("Kayak yapabilirsiniz.");


        }else if(sicaklik>=5&&sicaklik<=25){
            if(sicaklik<=15){
                System.out.println("sinemya gidebilirsiniz.");
            }
            if(sicaklik>10){
                System.out.println("pikniğe gidebilirsiniz.");
            }

        }else{
            System.out.println("yüzmeye gidebillirsin.");
        }
*/


        if (sicaklik < 5) {
            System.out.println("Kayak yapabilirsiniz.");
        } else if (sicaklik >= 25) {
            System.out.println("Yüzmeye gidebilirsiniz.");
        }
        if (sicaklik >= 5 && sicaklik <= 15) {
            System.out.println("Sinemaya gidebilirsiniz.");
        }
        if (sicaklik >= 10 && sicaklik <= 25) {
            System.out.println("Pikniğe gidebilirsiniz.");
        }
    }
}


