package day06ifstatement;

import java.util.Scanner;

public class IfElseIfStatement01 {

	public static void main(String[] args) {
		
		//Kullanicidan Yasini Alin
		// Yas 13 Den Az ise "Calisamaz" Mesaji verin
		//Yas 13 den 65 e kadar ise calisabilir
		// Yas 65 den Buyukse Emekli Yazdirin
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Lutfen Yasinizi Girin");
		int yas=scan.nextInt();
		
		if(yas<0) {
			System.out.println("Yas Negatif olamaz");
		}else if(yas<13) {
			System.out.println("Calisamaz");
		}else if(yas<=65) {
			System.out.println("Calisabilir");
		}else {
			System.out.println("Emekli");
		}
		
		
		
		
	}

}
