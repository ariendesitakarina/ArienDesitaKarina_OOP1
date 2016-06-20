package tugasbesar;

import java.util.Scanner;

public class TugasBesar {

    public static void main(String[] args) {
        System.out.println("Menentukan Jumlah Bilangan Bulat dan Bilangan Pecahan");
        int n = 0;
        int bilbulat = 0; 
        int bilpecahan = 0;
        
        Scanner masuk = new Scanner(System.in);
        
        System.out.print("Jumlah bilangan yang akan dimasukkan : ");
        n = masuk.nextInt();
        double bilangan[] = new double[n];
        for(int i = 0;i < n;i++)
        {
            System.out.print("Bilangan ke -" + (i + 1) + " : ");
            bilangan[i] = masuk.nextDouble();
        }
        
        Proses select = new Proses() {};
       
        bilbulat = select.bulat(bilangan);
        bilpecahan = select.pecahan(bilangan);
        System.out.println("\n");
        System.out.println("Jumlah bilangan bulat   : " + bilbulat);
        System.out.println("Jumlah bilangan pecahan : " + bilpecahan);
       
    }
}
    