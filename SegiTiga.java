package latihanarien;

public class SegiTiga extends BangunDatar {

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getT() {
        return t;
    }

    public void setT(int t) {
        this.t = t;
    }

    int a = 10;
    int t = 20;

    @Override
    int hitungLuas() {
        int luas;
        luas = (a * t) / 2;
        return luas;
    }

    @Override
    int hitungKeliling() {
        int keliling;
        keliling = (a + t) * 2;
        return keliling;
    }

}
