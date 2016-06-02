package latihanarien;

public class Persegi extends BangunDatar {

    public int getS() {
        return s;
    }

    public void setS(int s) {
        this.s = s;
    }

    int s = 15;

    @Override

    int hitungLuas() {
        int luas;
        luas = s * s;
        return luas;

    }

    @Override
    int hitungKeliling() {
        int keliling;
        keliling = 4 * s;
        return keliling;
    }
}
