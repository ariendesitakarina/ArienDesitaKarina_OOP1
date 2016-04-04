package arien_coba1;

import java.util.Scanner;

public class Arien_coba1 {


    public static void main(String[] args) {
        int x, y, z;
        
        System.out.println("Masukan angka yang ingin dijumlahkan");
        Scanner in = new Scanner(System.in);
        
        x = in.nextInt();
        y = in.nextInt();
        z = x + y;
        System.out.println("Sum of entered integers = "+z);
    }
    
}
