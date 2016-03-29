/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihanmethodprosedur;

/**
 *
 * @author ARIEN
 */


    import javax.swing.JOptionPane;

public class LatihanMethodProsedur {
    
    public static void main(String[] argas) {
        
        String nilai1String, nilai2String;
        int nilai1Int, nilai2Int;
        
        nilai1String = JOptionPane.showInputDialog("Masukan Bilangan Pertama : ");
        nilai1Int = Integer.parseInt(nilai1String);
        nilai2String = JOptionPane.showInputDialog("Masukan Bilangan Kedua : ");
        nilai2Int = Integer.parseInt(nilai2String);

        //memanggil method prosedur penjumlahan
        perkalian(nilai1Int, nilai2Int);
        
    }
    
    public static void perkalian(int nilaiPadaParameter1, int nilaiPadaParameter2) {
        int hasil = 0;
        hasil = nilaiPadaParameter1 * nilaiPadaParameter2;
        System.out.println("Hasil  perkalian : " + hasil);
        
    }
}
