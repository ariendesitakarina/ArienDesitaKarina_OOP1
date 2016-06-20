package tugasbesar;

class Proses {
    public int bulat(double bil[]){
        int a;
        int hasil = 0;
            for(int i = 0;i < bil.length;i++) {
            if(bil[i] % 1 == 0) hasil = hasil + 1;
        }
            return hasil;
        }

    public int pecahan(double bil[]) {
        int hasil = 0;
        for(int i = 0;i < bil.length;i++){
            if(bil[i] % 1 != 0) hasil = hasil + 1;
        }
       return hasil;
    }
}
