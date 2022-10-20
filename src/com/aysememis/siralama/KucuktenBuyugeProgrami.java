package com.aysememis.siralama;

/**
 * @author Ayşe Memiş
 * @since 1.0.0
 */

import java.util.Scanner;

public class KucuktenBuyugeProgrami {
    public static void main(String[] args) {

        int x, y, z;
        Scanner input = new Scanner(System.in);

        System.out.println("Birinci sayıyı giriniz:");
        x = input.nextInt();

        System.out.println("İkinci sayıyı giriniz:");
        y = input.nextInt();

        System.out.println("Üçüncü sayıyı giriniz:");
        z = input.nextInt();

        if ((x < y) && (x < z)) {
            if (y < z) {
                System.out.println("x<y<z");
            } else {
                System.out.println("x<z<y");
            }
        } else if ((y < x) && (y < z)) {
            if (x < z) {
                System.out.println("y<x<z");
            } else {
                System.out.println("y<z<x");
            }
        } else {
            if (x < y) {
                System.out.println("z<x<y");
            } else {
                System.out.println("z<y<x");
            }
        }


    }
}
