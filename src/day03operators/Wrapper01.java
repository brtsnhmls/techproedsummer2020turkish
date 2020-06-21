package day03operators;

import java.util.Scanner;

public class Wrapper01 {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Lutfen Adinizi yaziniz");
		
		String isim=scan.next();// String kaydetmek icin iki yontem var 
		System.out.println(isim);   //Next ve NextLine Nextline Satirin tamamini alir
		System.out.println("Lutfen Soyadinizi girin");
		String soyisim=scan.nextLine();
		System.out.println(soyisim);
	}

}
