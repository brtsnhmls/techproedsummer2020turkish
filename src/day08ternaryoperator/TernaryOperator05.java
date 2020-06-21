package day08ternaryoperator;

import java.util.Scanner;

public class TernaryOperator05 {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Bir Karakter Girin");
		char harf=scan.next().charAt(0);
		
		String result= (harf>64 && harf<90)||(harf>96&&harf<123) ?(harf>96&&harf<123 ?"Kucuk Harf":"Buyuk Harf"): "Harf Degil";
		System.out.println(result);
	
	
	
	
	
	}

}
