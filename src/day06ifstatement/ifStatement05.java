package day06ifstatement;

import java.util.Scanner;

public class ifStatement05 {

	public static void main(String[] args) {
		// Kullanicidan  Bir Dkdortgenin en ve Boyunu Alin
		//En Ve Boy Esit ise Bu bir karedir yazdirin
		// En ve Boy Farkli ise Bu Bir Dikdortgendir Yazdirin
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Lutfen Dikdortgenin En girin");
		int en=scan.nextInt();
		
		System.out.println("Lutfen Dikdortgenin Boy Girin");
		int boy=scan.nextInt();
		/*
		if(en==boy) {
			System.out.println(" Bu Bir Karedir");
		}
		if(en!=boy) {
			System.out.println(" Bu Bir Dikdortgendir");
		*/
		
			
			
			
			if(en==boy) {
			System.out.println("Bu Bir karedir");
		}else {
			System.out.println("Bu Bir Dikdortgendir");
		}
		
		
	
	}

}
