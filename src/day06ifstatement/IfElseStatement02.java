package day06ifstatement;

import java.util.Scanner;

public class IfElseStatement02 {

	public static void main(String[] args) {
		//Kullanicidan Bir Tam Sayi Isteyin ve O tamsayinin 
		//Mutlak Degerini Ekrana yazdirin
		//Mutlak Deger Bir Sayinin Kendi Isareti ile Carpilmasi Demektir
	
		Scanner scan=new Scanner(System.in);
		System.out.println("Lutfen Bir Sayi Girin");
		int num=scan.nextInt();
		
		if(num>0) {
			
			System.out.println(num*(+1));
		}else {
			System.out.println(num*(-1));
		}
		
		
		
		
	}

}
