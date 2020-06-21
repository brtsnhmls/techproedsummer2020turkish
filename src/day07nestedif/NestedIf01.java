package day07nestedif;

import java.util.Scanner;

public class NestedIf01 {

	public static void main(String[] args) {
		// Kullanicidan Bir Sayi Alin Bu sayi pozitif ise 9 dan buyukmu Kontrol edin
		// Acorn sayi Yazdirin
		//9 Kucuk ve Sifirdan Buyuk ise Ekrana Rakam Yazdirin
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Lutfen Bir Tam Sayi giriniz");
		int num=scan.nextInt();
		
		if(num>=0) {
			if(num>9) {
				System.out.println("Sayi");
			}else if(num<=9 && num>=0) {
				System.out.println("Rakam");
			}
		}else {
			System.out.println("Negati Sayi");
		}
		
		scan.close();// Scanner Kullandiktan sonra En alt kisimda main Method un icerisinde
					//scan.close(); Seklinde Kapatmamiz gerekiyor
		
		
		
		
		
	}

}
