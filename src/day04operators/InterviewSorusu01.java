package day04operators;

import java.util.Scanner;

public class InterviewSorusu01 {

	public static void main(String[] args) {
	
		// Iki tane Variablein degerlerini yer degistiriniz
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Yerlerini Degistirmek icin iki sayi girin");
		
		double sayi1=scan.nextDouble();
		double sayi2=scan.nextDouble();
		
		//1. Yol
		System.out.println("Yer degistirdokten once");
		System.out.println(sayi1);
		System.out.println(sayi2);
		
				
		double gecici=0.0;
		gecici = sayi1;
		sayi1=sayi2;
		sayi2=gecici;
		System.out.println("Yer degistirdokten sonra");
		System.out.println(sayi1);
		System.out.println(sayi2);
		
		
		
		System.out.println("Yer degistirmek icin 2 sayi daha giriniz");
		double sayi3=scan.nextDouble();
		double sayi4=scan.nextDouble();
		
		sayi3=sayi3+sayi4;
		sayi4=sayi3-sayi4;
		sayi3=sayi3-sayi4;
		System.out.println(sayi3);
		System.out.println(sayi4);
	
	}

}
