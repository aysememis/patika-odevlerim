package com.aysememis.bilet;

/**
 * @author Ayşe Memiş
 * @since 1.0.0
 */

import java.util.Scanner;

public class UcakBiletFiyati {
    public static void main(String[] args) {
        int mesafe, yas;
        double kmBasiPara = 0.1;

        Scanner input = new Scanner(System.in);

        System.out.println("Kaç km yolculuk yapacağınızı giriniz:");
        mesafe = input.nextInt();

        System.out.println("Kaç yaşında olduğunuzu giriniz:");
        yas = input.nextInt();

        System.out.println("Yolculuk tipinizi seçiniz:");
        System.out.println("1-tek yön/2-çift yön");
        int yolculukTipi = input.nextInt();

        if (yas < 12) {
            if (mesafe > 0 && yas > 0) {
                if (yolculukTipi == 2) {
                    double indirimsizTutar = mesafe * kmBasiPara;
                    double yasIndirimi = indirimsizTutar * 0.50;
                    double yasIndirimliTutar = indirimsizTutar - yasIndirimi;
                    double ciftYonIndirimi = yasIndirimliTutar * 0.20;
                    double ciftYonIndirimliTutar = yasIndirimliTutar - ciftYonIndirimi;

                    System.out.println("Toplam tutar:" + ciftYonIndirimliTutar);

                } else if (yolculukTipi == 1) {
                    double indirimsizTutar = mesafe * kmBasiPara;
                    double yasIndirimi = indirimsizTutar * 0.50;
                    double yasIndirimliTutar = indirimsizTutar - yasIndirimi;

                    System.out.println("Toplam tutar:" + yasIndirimliTutar);
                } else {
                    System.out.println("Hatalı sayı girdiniz!");
                }
            } else {
                System.out.println("Hatalı sayı girdiniz!");
            }

        } else if (yas >= 12 && yas < 25) {
            if (mesafe > 0) {
                if (yolculukTipi == 2) {
                    double indirimsizTutar = mesafe * kmBasiPara;
                    double yasIndirimi = indirimsizTutar * 0.10;
                    double yasIndirimliTutar = indirimsizTutar - yasIndirimi;
                    double ciftYonIndirimi = yasIndirimliTutar * 0.20;
                    double ciftYonIndirimliTutar = yasIndirimliTutar - ciftYonIndirimi;

                    System.out.println("Toplam tutar:" + ciftYonIndirimliTutar);

                } else if (yolculukTipi == 1) {
                    double indirimsizTutar = mesafe * kmBasiPara;
                    double yasIndirimi = indirimsizTutar * 0.10;
                    double yasIndirimliTutar = indirimsizTutar - yasIndirimi;

                    System.out.println("Toplam tutar:" + yasIndirimliTutar);

                } else {
                    System.out.println("Hatalı sayı girdiniz!");
                }

            } else {
                System.out.println("Hatalı sayı girdiniz!");
            }
        } else if (yas >= 25 && yas < 65) {
            if (mesafe > 0) {
                if (yolculukTipi == 2) {
                    double indirimsizTutar = mesafe * kmBasiPara;
                    double ciftYonIndirimi = indirimsizTutar * 0.20;
                    double ciftYonIndirimliTutar = indirimsizTutar - ciftYonIndirimi;

                    System.out.println("Toplam tutar:" + ciftYonIndirimliTutar);


                } else if (yolculukTipi == 1) {
                    double indirimsizTutar = mesafe * kmBasiPara;

                    System.out.println("toplam tutar:" + indirimsizTutar);

                } else {
                    System.out.println("Hatalı giriş yaptınız!");
                }
            } else {
                System.out.println("Hatalı giriş yaptınız!");
            }
        } else if (yas >= 65) {
            if (mesafe > 0) {
                if (yolculukTipi == 2) {
                    double indirimsizTutar = mesafe * kmBasiPara;
                    double yasIndirimi = indirimsizTutar * 0.30;
                    double yasIndirimliTutar = indirimsizTutar - yasIndirimi;
                    double ciftYonIndirimi = yasIndirimliTutar * 0.20;
                    double ciftYonIndirimliTutar = yasIndirimliTutar - ciftYonIndirimi;

                    System.out.println("Toplam tutar:" + ciftYonIndirimliTutar);

                } else if (yolculukTipi == 1) {
                    double indirimsizTutar = mesafe * kmBasiPara;
                    double yasIndirimi = indirimsizTutar * 0.30;
                    double yasIndirimliTutar = indirimsizTutar - yasIndirimi;

                    System.out.println("Toplam tutar:"+yasIndirimliTutar);


                }else{
                    System.out.println("Hatalı giriş yaptınız!");
                }
            }else{
                System.out.println("Hatalı giriş yaptınız!");
            }
        }


    }
}
