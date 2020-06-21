package day02wrapperclasses;

import java.util.Scanner;

public class Scanner07 {

	public static void main(String[] args) {
	
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Lutfen bir Mil Degeri Giriniz");
		
		Double mile=scan.nextDouble();
		
		System.out.println("Girmis oldugunuz Mil Degerinin KM Karsiligi Asagidaki gibidir");
	
		System.out.println(mile*1.6);
	
	
	
	}

}
