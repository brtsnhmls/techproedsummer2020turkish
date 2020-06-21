package day07nestedif;

import java.util.Scanner;

public class ArtikYilSorusuInterview {

	public static void main(String[] args) {
		// Kullanicidan yil girmesini isteyin 
		//Girilen artik Yil ise artik yil yazdirin
		//Girilen artik yil degilse artik yil degil yazdirin
		
		//Artik yil 1-) Yil Yuze Bolunurse 400 e de bolunmeli
		//			2-) Yil Yuze Bolunmese 4 e bolunmeli
		
		Scanner scan=new Scanner (System.in);
		System.out.println("Lutfen Bir Yil Girin");
		int yil=scan.nextInt();
		
		if(yil%100==0&&yil%400==0) {
			
			System.out.println(yil+" Yil Artik Yildir");
		}else if(yil%100!=0 && yil%4==0) {
			System.out.println(yil+" Yil Artik Yildir");
		}else {
			System.out.println(yil+" Yil Artik Yil Degildir");
		}

	}

}
