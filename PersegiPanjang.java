package latihanarien;

public class PersegiPanjang extends BangunDatar {

    public int getP() {
        return p;
    }

    public void setP(int p) {
        this.p = p;
    }

    public int getL() {
        return l;
    }

    public void setL(int l) {
        this.l = l;
    }

    int p = 15;
    int l = 10;

    @Override
    int hitungLuas() {
        int luas;
        luas = p * l;
        return luas;
    }

    @Override
    int hitungKeliling() {
        int keliling;
        keliling = (p + l) * 2;
        return keliling;
    }

}
