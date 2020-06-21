package day04operators;

import java.util.Scanner;

public class Modulus05 {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Lutfen 4 Basamakli bir sayi giriniz");
		
		int sayi=scan.nextInt();
		int ilkBasamak=sayi%10;
		int sonBasamak=sayi/1000;
		
		System.out.println(ilkBasamak+sonBasamak);
	
	}

}
