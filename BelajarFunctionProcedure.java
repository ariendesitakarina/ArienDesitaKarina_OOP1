/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package belajarfunctionprocedure;

/**
 *
 * @author ARIEN
 */
public class BelajarFunctionProcedure {


	public static void main(String[] args) {
		BelajarFunctionProcedure belajar = new BelajarFunctionProcedure();
		belajar.tambah(3, 5);
		belajar.kurang(21, 1);

	}

	private void tambah(int a, int b) {
		int hasil;
		hasil = a + b;
		System.out.println(hasil);

		
	}

	private void kurang(int a, int b) {
		int hasil;
		hasil = a - b;
		System.out.println(hasil);

		
	}

}
