
import java.util.Scanner;

public class Arien_scanner1 {

    public static void main(String[] args) {
        int N, bil1, bil2, i, nilaiMin = 1000, nilaiMax = 2000, jml = 1;
        char pil;

        Scanner input = new Scanner(System.in);

        N = input.nextInt();
        pil = input.next().charAt(0);

        if (pil == 'A') {
            for (i = 0; i < N; i++) {
                bil1 = input.nextInt();
                if (bil1 <= nilaiMin) {
                    if (bil1 == nilaiMin) {
                        jml++;
                    }
                    nilaiMin = bil1;
                }
            }
            System.out.println(nilaiMin);
            System.out.println(jml);
        } else if (pil == 'B') {
            for (i = 0; i < N; i++) {
                bil2 = input.nextInt();
                if (bil2 >= nilaiMax) {
                    if (bil2 == nilaiMax) {
                        jml++;
                    }
                    nilaiMax = bil2;
                }
                System.out.println(nilaiMax);
                System.out.println(jml);
            }
        }
    }
}
