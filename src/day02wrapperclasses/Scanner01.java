package day02wrapperclasses;

import java.util.Scanner;

public class Scanner01 {

	public static void main(String[] args) {
	
		//Kullanici Iki Tam sayi Versin
		// Program Bu tam Sayilarin Toplamini ve carpimini Versin
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Lutfen iki tam Sayi giriniz");
		
		int sayi1=scan.nextInt();
		int sayi2=scan.nextInt();
		
		
		System.out.println("Girmis oldugunuz Sayilarin Toplami");
		System.out.println(sayi1+sayi2);
		

		System.out.println("Girmis oldugunuz Sayilarin Carpimi");
		System.out.println(sayi1*sayi2);
		
		// Karenin Bir kenar uzunlugunu girsin.Biz karenin Cevresini ve alanini hesaplayalim
		
	
		

	}

}
