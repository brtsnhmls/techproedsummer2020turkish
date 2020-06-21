package day04operators;

import java.util.Scanner;

public class Modulus04 {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Lutfen 4 Basamakli Bir Sayi Giriniz");
		
		int sayi=scan.nextInt();
		
		int ilkRakam=sayi%10;
		
		int x=sayi/10;
		int ikinciRakam=x%10;
		
		int y=x/10;
		int ucuncuRakam=y%10;
		
		int sonRakam=sayi/1000;
		
		
		System.out.println(ilkRakam+ikinciRakam+ucuncuRakam+sonRakam);
		
	}

}
