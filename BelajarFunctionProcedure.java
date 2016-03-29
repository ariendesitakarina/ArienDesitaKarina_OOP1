public class BelajarFunctionProcedure {

	public static void main(String[] args) {
		BelajarFunctionProcedure belajar = new BelajarFunctionProcedure();
		belajar.tambah(1, 2);
		belajar.kurang(5, 4);

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