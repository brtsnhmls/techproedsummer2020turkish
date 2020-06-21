package day11stringmethods;

public class ForLoop01 {

	public static void main(String[] args) {
		// 
/*
	
	for(int i=4;i>-2;i--) {
		System.out.println(i);
	}
*/
	
		//3,4,5,6,7 sayilarini ekrana yazan for loop yazin
	
	for(int i=3;i<8;i++) {
		System.out.println(i);
	}
	/*
	// il yuz sayma sayisini ekrana yan yana yazdiran ve aralarinia bosluk olan programi yazin
	
	for(int i=1;i<101;i++) {
		System.out.print(" "+i);
	}
*/
	// il yuz sayma sayisini 100 den baslayarak ekrana yan yana yazdiran ve aralarinia bosluk olan programi yazin
	
	for(int i=100;i>0;i--) {
		System.out.print(" "+i);
	}
	System.out.println();
	
	// ilk elli Cift Sayma sayisini ekrana yazdiran program yazin
	for(int i=2;i<101;i+=2) {
		
		System.out.print(" "+i);
	}
	
	System.out.println();
	
	// ilk elli tek Sayma sayisini ekrana yazdiran program yazin
	for(int i=1;i<100;i+=2) {
		
		System.out.print(" "+i);
	}
	
	
	}

}
