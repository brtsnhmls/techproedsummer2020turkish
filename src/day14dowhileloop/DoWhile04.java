package day14dowhileloop;

import java.util.Scanner;

public class DoWhile04 {

	public static void main(String[] args) {
		//Kullanicidan bir String Alin bu Stringin indexi tek sayi olan karakterlerini elrana yazdirin
		Scanner scan=new Scanner(System.in);
		System.out.println("Bir String Girin");
		String str=scan.nextLine();
		int length=str.length();
		int i=1;
		
		do {
			if(i%2==1) {
				System.out.print(str.charAt(i)+" ");
			}
				
			i++;
		}while(i<length);
		
		
		
		
		
	}

}
