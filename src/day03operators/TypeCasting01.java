package day03operators;

public class TypeCasting01 {

	public static void main(String[] args) {

		byte by=101;
		int sayi1=by;// Kucuk Data Tipini Buyuk Data Tipine cevirmek icin extra bir kod yazmaya gerek yok 
					// java bunu otomatik olarak yapar
	
		
		
		System.out.println(sayi1);
	
		int sayi2=53;
		byte by2=(byte)sayi2;
		System.out.println(by2);
	
		double sayi3=23.5;
		int by3=(int)sayi3;
		System.out.println(by3);
	
		float sayi4=-23.9f;
		short by4=(short)sayi4;
		System.out.println(by4);
	
		double sayi5=4.8;
		double sayi6=1.4;
		double sonuc=sayi5/sayi6;
		int sonuc2=(int)sonuc;
		System.out.println(sonuc2);
		
		int sayi7=5;
		int sayi8=3;
		int sonuc3=sayi7/sayi8;
		System.out.println(sonuc3);
		
		int sayi9=255;
		byte by5=(byte)sayi9;
		System.out.println(by5);
		
		
	
	}
	

}
