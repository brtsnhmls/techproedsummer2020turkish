package day02wrapperclasses;

import java.util.Scanner;

public class Scanner03 {

	public static void main(String[] args) {
		
		//Kullanicidan alinan sayinin kupunu hesaplayan bir program
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Lutfen Bir Sayi Giriniz");
		
		int sayi1=scan.nextInt();
		
		
		System.out.println("Girmis Oldugunuz Sayinin Kupu");
		System.out.println(sayi1*sayi1*sayi1);
		
		
		
		
	}

}
