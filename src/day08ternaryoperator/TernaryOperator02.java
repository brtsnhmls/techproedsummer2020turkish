package day08ternaryoperator;

import java.util.Scanner;

public class TernaryOperator02 {

	public static void main(String[] args) {
		// Kullanicidan iki sayi alin
		//Bu Sayilar Bir birine esit ise Toplamlarini Ekrana Yazdirin
		//Farkli ise Carpimlarini ekrana yazdirn
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Lutfen 1. Sayi Girin");
		int num1=scan.nextInt();
		System.out.println("Lutfen 2. Sayi Girin");
		int num2=scan.nextInt();
		
		int sonuc=num1==num2 ? (num1+num2):(num1*num2);
		System.out.println(sonuc);
	scan.close();
	}

}
