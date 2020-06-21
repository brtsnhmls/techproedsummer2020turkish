package day02wrapperclasses;

import java.util.Scanner;

public class Scanner02 {

	public static void main(String[] args) {
		
		
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Lutfen Karenin Bir Kenar Uzunlugunu Girin");
		
		int kenar=scan.nextInt();
		
		System.out.println("Girmis oldugunuz degerlere gore Karenin Cevresi");
		System.out.println(kenar*4);
		
		System.out.println("Girmis oldugunuz degerlere gore Karenin Alani");
		System.out.println(kenar*kenar);
		
		
		
	}

}
