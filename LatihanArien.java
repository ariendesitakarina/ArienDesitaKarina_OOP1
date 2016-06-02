package latihanarien;

public class LatihanArien {

    public static void main(String[] args) {
        BangunDatar hitung = new Persegi();
        System.out.println(hitung.hitungKeliling());
        System.out.println(hitung.hitungLuas());

        BangunDatar hitung1 = new PersegiPanjang();
        System.out.println(hitung1.hitungKeliling());
        System.out.println(hitung1.hitungLuas());

        BangunDatar hitung2 = new SegiTiga();
        System.out.println(hitung2.hitungKeliling());
        System.out.println(hitung2.hitungLuas());
    }

}
