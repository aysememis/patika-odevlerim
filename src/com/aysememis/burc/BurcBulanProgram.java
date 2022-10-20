package com.aysememis.burc;

/**
 * @author Ayşe Memiş
 * @since 1.0.0
 */

import java.util.Scanner;

public class BurcBulanProgram {
    public static void main(String[] args) {

        int ay, gun;

        Scanner input = new Scanner(System.in);

        System.out.println("Doğum ayınız:");
        ay = input.nextInt();

        System.out.println("Doğum gününüz:");
        gun = input.nextInt();


        if (ay == 1) {
            if (gun > 21 && gun < 31) {
                System.out.println("Burcunuz kova");
            } else if (gun < 22) {
                System.out.println("Burcunuz oğlak");
            } else {
                System.out.println("Hatalı giriş yaptınız!");
            }
        } else if (ay == 2) {
            if (gun < 20) {
                System.out.println("Burcunuz kova");
            } else if (gun > 19 && gun < 28) {
                System.out.println("Burcunuz balık");
            } else {
                System.out.println("Hatalı giriş yaptınız!");
            }

        } else if (ay == 3) {
            if (gun < 21) {
                System.out.println("Burcunuz balık");
            } else if (gun > 20 && gun < 31) {
                System.out.println("Burcunuz koç");
            } else {
                System.out.println("Hatalı giriş yaptınız!");

            }
        } else if (ay == 4) {
            if (gun < 21) {
                System.out.println("Burcunuz koç");
            } else if (gun > 20 && gun < 30) {
                System.out.println("Burcunuz boğa");
            } else {
                System.out.println("Hatalı giriş yaptınız!");
            }
        } else if (ay == 5) {
            if (gun < 22) {
                System.out.println("Burcunuz boğa");
            } else if (gun > 21 && gun < 31) {
                System.out.println("Burcunuz ikizler");
            } else {
                System.out.println("Hatalı giriş yaptınız!");
            }
        } else if (ay == 6) {
            if (gun < 23) {
                System.out.println("Burcunuz ikizler");
            } else if (gun > 22 && gun < 30) {
                System.out.println("Burcunuz yengeç");
            } else {
                System.out.println("Hatalı giriş yaptınız!");
            }

        } else if (ay == 7) {
            if (gun < 23) {
                System.out.println("Burcunuz yengeç");
            } else if (gun > 22 && gun < 31) {
                System.out.println("Burcunuz aslan");
            }else{
                System.out.println("Hatalı giriş yaptınız!");

            }
        }else if(ay==8){
            if(gun<23){
                System.out.println("Burcunuz aslan");
            }else if(gun>22&&gun<31){
                System.out.println("Burcunuz başak");
            }else{
                System.out.println("Hatalı giriş yaptınız!");
            }
        }else if(ay==9){
            if(gun<23){
                System.out.println("Burcunuz başak");
            }else if(gun>22&&gun<30){
                System.out.println("Burcunuz terazi");
            }else{
                System.out.println("Hatalı giriş yaptınız!");
            }
        }else if(ay==10){
            if(gun<22){
                System.out.println("Burcunuz terazi");
            }else if(gun>22&&gun<31){
                System.out.println("Burcunuz akrep");
            }else{
                System.out.println("Hatalı giriş yaptınız!");
            }
        }else if(ay==11){
            if(gun<22){
                System.out.println("Burcunuz akrep");
            }else if(gun>21&&gun<30){
                System.out.println("Burcunuz yay");
            }else{
                System.out.println("Hatalı giriş yaptınız!");
            }
        }else if(ay==12){
            if(gun<22){
                System.out.println("Burcunuz yay");
            }else if(gun>21&&gun<31){
                System.out.println("Burcunuz oğlak");
            }else{
                System.out.println("Hatalı giriş yaptınız!");
            }
        }
    }
}
