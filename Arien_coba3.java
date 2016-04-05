package arien_coba3;

import java.util.Scanner;

public class Arien_coba3 {

    public static void main(String[] args) {
        int n;
        
        Scanner input = new Scanner(System.in);
        System.out.println("Masukan Nilai");
        
        while ((n = input.nextInt()) !=0) {
            System.out.println("Kamu memasukan" +n);
            System.out.println("Masukan Nilai");
        }
        System.out.println("Keluar dari pengulangan");
    }
    
}
