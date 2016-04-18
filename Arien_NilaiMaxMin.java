package arien_nilaimaxmin;
import java.util.Scanner;
public class Arien_NilaiMaxMin {

    public static void main(String[] args) {
        int Nilai, bil1, i, NilaiMin = 1000, jml = 1, NilaiMax = 1;
        char pil;

        Scanner input = new Scanner(System.in);
        System.out.println("Masukan jumlah nilai :");
        Nilai = input.nextInt();
        System.out.println("Masukan pilihan A atau B :");
        pil = input.next().charAt(0);

        if (pil == 'A') {
            for (i = 0; i < Nilai; i++) {
                bil1 = input.nextInt();
                if (bil1 <= NilaiMin) {
                    if (bil1 == NilaiMin) {
                        jml++;
                    }
                    NilaiMin = bil1;
                }
            }

            System.out.println("Nilai minimal dari deretan angka di atas yaitu : " + NilaiMin);
            System.out.println("Jumlah nilai minimalnya yaitu : " + jml);

        } else if (pil == 'B') {
            for (i = 0; i < Nilai; i++) {
                bil1 = input.nextInt();
                if (bil1 >= NilaiMax) {
                    if (bil1 == NilaiMax) {
                        jml++;
                    }
                    NilaiMax = bil1;
                }

            }
            System.out.println("Nilai maksimal dari deretan anggka di atas adalah : " + NilaiMax);
            System.out.println("Jumlah nilai minimalnya : " + jml);
        }
    }

}
