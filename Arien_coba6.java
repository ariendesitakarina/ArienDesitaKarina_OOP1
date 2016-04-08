package arien_coba6;

import java.util.Scanner;

public class Arien_coba6 {

    public static void main(String[] args) {
       int x, y, z;
       System.out.println("Masukan 3 angka");
       Scanner in = new Scanner(System.in);
       
       x = in.nextInt();
       y = in.nextInt();
       z = in.nextInt();
    
       if ( x > y && x > z )
       System.out.println("Angka pertama adalah angka paling besar");
       else if ( y > x && y > z )
       System.out.println("Angka kedua adalah angka paling besar");
       else if ( z > x && z > y )
       System.out.println("Angka ketiga adalah angka paling besar");
       else
       System.out.println("Masuka ");
    }
    
}
