package day14dowhileloop;

import java.util.Scanner;

public class OdevSorusu02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("Lutfen bir sayi girin");
		int next=scan.nextInt();
		
		for(int i=1;i<=next;i++) {
			if(next%i==0) {
				System.out.print(i+" ");
			}
		}
	
		System.out.println();
		
		int i=1;
	while(i<=next) {
		if(next%i==0) {
			System.out.print(i+" ");
					
		}
	i++;
	}
	
	scan.close();
	
	}

}
