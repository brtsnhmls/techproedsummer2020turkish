package day07nestedif;

import java.util.Scanner;

public class OdevCharSorusu {

	public static void main(String[] args) {
		
		
		Scanner scan=new Scanner(System.in);
		 
		System.out.println("Bir character ");
		char harf=scan.next().charAt(0);
		
		if((harf>=97 && harf<=122)||(harf<=90 && harf>=65)) {
			System.out.println("Bu Bir harftir");
		
		}else {
			System.out.println("Harf Degildir");
		}
	}

}
