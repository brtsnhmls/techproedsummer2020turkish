package day02wrapperclasses;

import java.util.Scanner;

public class Scanner06 {

	public static void main(String[] args) {
	
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Merhaba Saati Saniyeye Ceviren uygulama icin bir deger sayi girin lutfen");
		
		Long saat=scan.nextLong();
		
		System.out.println(saat*60*60);
		
	}

}
