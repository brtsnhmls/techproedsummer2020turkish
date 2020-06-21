package day08ternaryoperator;

import java.util.Scanner;

public class TernaryOperator04 {

	public static void main(String[] args) {
		//Kullanicidan bir sayi aliniz
		//Sayi 0 dan buyuk esit ise 10 dan kucuk olup olmadigini kontrol ediniz.
		//10 dan kucuk ise ekrana "Rakam" yazdiriniz degilse "Pozitif Sayi" yazdiriniz.
		//Sayi o dan kucuk ise ekrana "Negatif Sayi" yazdiriniz.
		        
		        Scanner scan = new Scanner(System.in);
		        
		        System.out.println("Bir sayi giriniz");
		        int num = scan.nextInt();
		        
		        String result= num>=0 ?(num<10 ?"Rakam":"Pozitif Sayi"):"Negatif Sayi";
		        System.out.println(result);
	scan.close();
	}

}
