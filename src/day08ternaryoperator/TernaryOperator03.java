package day08ternaryoperator;

import java.util.Scanner;

public class TernaryOperator03 {

	public static void main(String[] args) {
		//  Kullanicidan  iki sayi aliniz 
		//Kucuk Sayiyi Ekrana Yazdirin

		Scanner scan=new Scanner(System.in);
		System.out.println("Lutfen Iki sayi girin");
		double num1=scan.nextDouble();
		double num2=scan.nextDouble();
		
		double sonuc= (num1<=num2)? num1 : num2;
		System.out.println("Girmis Oldugunuz Sayilardan Kucuk olan : "+sonuc);
	
	scan.close();
	}

}
