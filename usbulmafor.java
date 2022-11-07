import java.util.Scanner;
public class UsluSayi {
    public static void main(String[] args) {
        int n, k;

        Scanner input= new Scanner(System.in);
        System.out.println("Taban sayısını giriniz:");
        n=input.nextInt();

        System.out.println("Kuvvet sayısını giriniz:");
        k= input.nextInt();

      /*  // 3^4=3*3*3*3

        int i=1;
        int total=1;

        while (i<=k){
           total*=n;
            i++;
        }
        System.out.println("Cevap:"+total);

       */
        int total=1;

        for(int i=1; i<=k; i++){
            total *=n;
        }
        System.out.println("Cevap:"+total);
    }
}
