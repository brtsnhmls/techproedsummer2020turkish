package day06ifstatement;

import java.util.Scanner;

public class IfElseIfStatement02 {

	public static void main(String[] args) {
		// Kullanicidan Sinav notunu tam sayi olarak Girmesini isteyin
		//Negatif Girerse yanlis deger girdiniz desin
		//50 den kucuk girerse ekrana kaldiniz yazdirin
		//80 kucuk ise "Gectiniz" yazdirin
		//100 kucuk ise tebrikler desin

		
		Scanner scan=new Scanner(System.in);
		System.out.println("Lutfen Sinav Notunuzu Griniz");
		int not=scan.nextInt();
		
		if(not<0) {
			System.out.println("Negatif Deger Giremezsiniz");
		}else if(not<50) {
			System.out.println("Kaldiniz");
		}else if(not<80) {
			System.out.println("Gectiniz");
		}else if (not<=100){
			System.out.println("Tebrikler");
		}else {
			System.out.println("100 den Buyuk Bir Deger Giremezsiniz");
		}
		
	}

}
