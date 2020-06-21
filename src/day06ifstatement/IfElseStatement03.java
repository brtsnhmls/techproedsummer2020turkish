package day06ifstatement;

import java.util.Scanner;

public class IfElseStatement03 {

	public static void main(String[] args) {
		// Kullanicidan alacagi urun miktarini ve fiyatini alalim
		// Eger kullanici 1000 den fazla urun alirsa %20 indirim yapin
		// ve kullanicinin odeyecegi toplam fiyati ekrana yazdirin
		// Eger kullanici 1000 den az veya 1000 urun alirsa indirim yapmayin
		// ve kullanicinin odeyecegi toplam fiyati ekrana yazdirin
		// Para Konularinda Double Kullanin
		//Ornek: 80 tl ye %20 Indirim==>60*80/100
	
		Scanner scan=new Scanner(System.in);
		System.out.println("Lutfen Alacaginiz Urun Miktari");
		double miktar=scan.nextDouble();
		System.out.println("Lutfen Alacaginiz urunu Fiyatini girin");
		double fiyat=scan.nextDouble();
		
		if(miktar>1000) {
			System.out.println("Alacaginiz Urun="+miktar);
			System.out.println("Toplam="+(fiyat*80/100)*(miktar));
		}else {
			System.out.println("Toplam="+miktar);
			System.out.println("Toplam="+(fiyat*miktar));
		}
	}

}
