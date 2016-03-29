/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihanmethodfungsi;

/**
 *
 * @author ARIEN
 */
import javax.swing.JOptionPane;
public class LatihanMethodFungsi {

    public static void main(String[] argas) {

        String nilai1String, nilai2String;
        int nilai1Int, nilai2Int;

        nilai1String = JOptionPane.showInputDialog("Masukan Bilangan Pertama : ");
        nilai1Int = Integer.parseInt(nilai1String);
        nilai2String = JOptionPane.showInputDialog("Masukan Bilangan Kedua : ");
        nilai2Int = Integer.parseInt(nilai2String);


        int hasil = perkalian(nilai1Int, nilai2Int);
        System.out.println("Hasil : " + hasil);

    }

    public static int perkalian(int nilaiPadaParameter1, int nilaiPadaParameter2) {
        return nilaiPadaParameter1 * nilaiPadaParameter2;
    }
    
}


