package day13whiledowhileloops;

import java.util.Scanner;

public class FoorLoopInterview03 {

	public static void main(String[] args) {
		//Kullanicidan Bir sayi alin Bu Sayinin Dersini ekrana yazdirin
		
		Scanner scan=new Scanner(System.in);
		System.out.println("bir rakam girn");
		String num=scan.nextLine();
		String ters="";
		for(int i=num.length()-1;i>=0;i--) {
			ters=ters+num.charAt(i)+"";
		
		}
System.out.println(Integer.valueOf(ters)+2);
	}

}
