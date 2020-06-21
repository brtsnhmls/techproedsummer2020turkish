package day13whiledowhileloops;

import java.util.Scanner;

public class FoorLoopInterview02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// while loop kullanarak
		Scanner scan=new Scanner(System.in);
		System.out.println("isminizi  girin");
		String nam=scan.nextLine();
		int i=nam.length()-1;
	
		while(i>=0) {
			System.out.print(nam.charAt(i));
			i--;
		}
	scan.close();
	
	}

}
