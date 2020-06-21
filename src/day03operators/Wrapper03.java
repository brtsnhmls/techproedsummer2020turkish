package day03operators;

import java.util.Scanner;

public class Wrapper03 {

	public static void main(String[] args) {
	
		//Kullanicidan Ad soyad alip Ekrana yazdiralim
		//Kullanicidan Adres alalim Ekrana yazdiralim
		//Kullanicidan Yasini Alalim ekrana yazdiralaim
		//Kullaniciya Turkiyede  yasiyorum Dogru /Yanlis
		
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Lutfen Adinizi ve soyadinizi yaziniz");
		System.out.println("Lutfen Adresinizi Yazin");
		System.out.println("Lutfen yasinizi yazin");
		System.out.println("Turkiyede Yasiyorum evet/hayir");
		
	String ad=scan.nextLine();
	String adres=scan.nextLine();
	byte yas=scan.nextByte();
	boolean ulke=scan.nextBoolean();

	
	System.out.println(ad);
	System.out.println(adres);
	System.out.println(yas);
	System.out.println(ulke);

	
	
	
	
	}

}
