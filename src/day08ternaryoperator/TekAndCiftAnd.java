package day08ternaryoperator;

public class TekAndCiftAnd {

	public static void main(String[] args) {
		
		System.out.println(3<2 && 5>4);// && Kullanildiginda Java ilk degeri kontrol eder  ve deger false ise  geri kalanina bakmaz
		
		
		System.out.println(3<2 & 5>4);// & Tek Olarak Kullanildiginda Diger kontroleri yapar ondan sonra sonucu yazar
									  // Buda fazla islem yapmasina neden olacaktir.

	}

}
