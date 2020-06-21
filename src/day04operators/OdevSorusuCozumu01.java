package day04operators;

import java.util.Scanner;

public class OdevSorusuCozumu01 {

	public static void main(String[] args) {
	
		//Kullanicidan integer aldiktan sonra String alamiyoruz.
		
		Scanner scan=new Scanner(System.in);
		
		//Java'da nextInt() kullandiktan sonra nextLine() kullanirsak kod calismiyor.
        //nextInt() yerine nextLine() kullan sonra elde ettigin String'i
        //Integer.parseInt()kullanarak integer'a cevir.

		
		System.out.println("Yasinizi giriniz");
		String yas =scan.nextLine();
		int yeniYas=Integer.parseInt(yas);
		System.out.println(yeniYas);
		
		
		System.out.println("Adinizi ve soyadinizi giriniz");
		String isim=scan.nextLine();
		System.out.println(isim);
		
		
		
		
		
		
		
		
	}

}
