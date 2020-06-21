package day14dowhileloop;

import java.util.Scanner;

public class DoWhile03 {

	public static void main(String[] args) {
		// 
Scanner scan=new Scanner(System.in);
int num=0;

do
{
	System.out.println("Bir Sayi Giriniz");
	num=scan.nextInt();
		
}while(num>=10);
		
System.out.println("Kazandiniz");
		
		
	}

}
