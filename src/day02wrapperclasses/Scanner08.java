package day02wrapperclasses;

import java.util.Scanner;

public class Scanner08 {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Lutfen ucgenin kenar uzunliklarini sirasi ile giriniz");		
		
		Byte a=scan.nextByte();
		Byte b=scan.nextByte();
		Byte c=scan.nextByte();
		
		System.out.println("Kenar uzunluklarini Girmis oldugunuz Ucgenin Cevresi");
		System.out.println(a+b+c);
	}

}
