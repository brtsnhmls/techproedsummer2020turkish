package day04operators;

import java.util.Scanner;

public class Modulus01 {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		//12835 sayisinin 23 e bolumunden kalni bulun
		System.out.println("Lutfen Modulus Hesaplanmasi icin 2 adet sayi girin");
		
		int sayi1=scan.nextInt();
		int sayi2=scan.nextInt();
		System.out.println(sayi1%sayi2);

	}

}
