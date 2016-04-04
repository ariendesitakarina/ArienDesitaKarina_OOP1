package arien_coba2;

import java.util.Scanner;

public class Arien_coba2 {

    public static void main(String[] args) {
        int marksObtained, passingMarks;
        
        passingMarks = 65;
        Scanner input = new Scanner(System.in);
        System.out.println("Masukan nilai ujian anda");
        marksObtained = input.nextInt();
        if (marksObtained >= passingMarks) {
            System.out.println("Kamu Lulus Ujian");
        }
        else {
            System.out.println("Kamu Tidak Lulus Ujian");
        }
    }
    
}
