package day08ternaryoperator;

import java.util.Scanner;

public class TernaryOperator01 {

	public static void main(String[] args) {
		// Kullanicidan bir sayi aliniz sayi pozitif ise ekrana Pozitif yazdirin
		//Kullanicidan bir sayi aliniz sayi Negatif ise ekrana Negatif yazdirin
	
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Lutfen Bir Sayi Girin");
		int num=scan.nextInt();
		/*
		if(num>=0) {
			System.out.println("Pozitif veya 0");
		}else  {
			System.out.println("Negatif");
		}
		*/
		//Ternary Operator (if Else)
	String sonuc=	(num>=0) ?    "Pozitif veya 0"  : "Negatif";
	System.out.println(sonuc);
	
	scan.close();
	}

}
