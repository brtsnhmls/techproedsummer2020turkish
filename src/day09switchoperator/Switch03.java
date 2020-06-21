package day09switchoperator;

import java.util.Scanner;

public class Switch03 {

	public static void main(String[] args) {
		// Kullanici ay ismini girsin
		// Program kacinci ay oldugunu ekrana yazsin
		// Buyuk harf kucuk harf hepsi icin calissin
		// Yanlis ay ismi girerse “Gecerli ay ismi giriniz”

	Scanner scan=new Scanner(System.in);
	System.out.println("Ay ismini Giriniz");
	String ay=scan.nextLine();
	ay=ay.toLowerCase();// toLowerCase() ==> Bu Method String'lerin Kucuk Harfe Donusturulmesinde Kullanilir
	                    // toUpperCase() ==> Bu Method String'lerin Buyuk Harfe Donusturulmesinde Kullanilir
	switch(ay){
		
	case "ocak":
		System.out.println("1 Ay");
	    break;
	case "subat":
		System.out.println("2 Ay");
		break;
	case "mart":
		System.out.println("3 Ay");
		break;
	case "nisan":
		System.out.println("4 Ay");
		break;
	case "mayis":
		System.out.println("5 Ay");
		break;
	case "haziran":
		System.out.println("6 Ay");
		break;
	case "temmuz":
		System.out.println("7 Ay");
		break;
	case "agustos":
		System.out.println("8 Ay");
		break;
	case "eylul":
		System.out.println("9 Ay");
		break;
	case "ekim":
		System.out.println("10 Ay");
		break;
	case "kasim":
		System.out.println("11 Ay");
		break;
	case "aralik":
		System.out.println("12 Ay");
	    break;
		
	default:
		System.out.println("Gerecerli Bir Ay ismi Giriniz");
	
	
	}
scan.close();	
		
	}
}
