package day04operators;

import java.util.Scanner;

public class Modulus03 {

	public static void main(String[] args) {
		
		
		// Kullanicidan Sayi 3 basamakli tam sayi alin butun basamkalrin rakamlari toplamini bulun
		
	Scanner scan=new Scanner(System.in);
	
	System.out.println("uc basamakli bir sayi girin");
	
	int s=scan.nextInt();
	int sonRakam=s%10;
	
	int v=s/10;
	int ortaRakam=v%10;
	
	int ilkRakam=s/100;
	
	System.out.println(sonRakam+ortaRakam+ilkRakam);

	}

}
