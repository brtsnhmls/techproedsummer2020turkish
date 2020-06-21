package day13whiledowhileloops;

import java.util.Scanner;

public class FoorLoopInterview01 {

	public static void main(String[] args) {
		// Kullanicidan Bir Sitrin Alin ve stringi ekrana tersyen yazdirin
		// for loop kullarak
		Scanner scan=new Scanner(System.in);
		System.out.println("isminizi  girin");
		String nam=scan.nextLine();
	
	
		for( int i=nam.length()-1; i>=0;i-- ){
			
			System.out.print(nam.charAt(i));			
						
		}
		
scan.close();
	}

}
