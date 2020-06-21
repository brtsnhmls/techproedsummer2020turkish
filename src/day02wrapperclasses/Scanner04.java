package day02wrapperclasses;

import java.util.Scanner;

public class Scanner04 {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Lutfen Dikdortgenin uzun Kenar uzunlugunu girin");

		
		int uzunKenar=scan.nextInt();
		int kisaKenar=scan.nextInt();
		
		System.out.println("girdiginiz sayilara gore dikdortgenin alani");
		System.out.println(uzunKenar*kisaKenar);
		
		System.out.println("girdiginiz sayilara gore dikdortgenin alani");
		System.out.println(2*(kisaKenar+uzunKenar));
		
	}

}
