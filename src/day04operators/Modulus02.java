package day04operators;

import java.util.Scanner;

public class Modulus02 {

	public static void main(String[] args) {

		//Kullanicinin girdigi 4 basamakli sayinin ilk ve son rakaminin toplamini veren program yaziniz.

		Scanner scan=new Scanner(System.in);
		
		System.out.println("Lutfen Bir Dort bsamakli bir sayi yazi");
		
		int sayi1=scan.nextInt();
		int sonRakam=sayi1%10; // Bir sayinin birler basamagini bolmek icin 10 boluyoruz
		int ilkRakam=sayi1/1000;
		
		
		System.out.println(sonRakam+ilkRakam);
		
		
	}

}
