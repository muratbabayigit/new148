package P02;

import java.util.Scanner;

public class p01 {
    public static void main(String[] args) {
        int a=128;
        int b=17;
        System.out.println("c="+(a+b));

        Scanner scan=new Scanner(System.in);
        System.out.println("Bir sayı giriniz");
        int sayi= scan.nextInt();
        if (sayi%2==0){
            System.out.println("Girdiğiniz sayı çift sayıdır");
        }else{
            System.out.println("Girdiğiniz sayı çift sayı değildir");
        }
    }
}
