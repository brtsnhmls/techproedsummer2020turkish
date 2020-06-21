package day20arrays;

import java.util.Arrays;

public class Arrays02 {

	public static void main(String[] args) {
		// Bir integerin array’in elemanlarini kucukten buyuge diziniz 
		// ve ekrana iki durumu da yazdiriniz
		
		int arr[]= {2,11,0,23,7};
		System.out.println(Arrays.toString(arr));
		//Arrays.sort() metoduna parametre olarak array'in ismi yazilirsa
		//o array'in elemanlari kucukten buyuge siralanmis olur, 
		
		Arrays.sort(arr);	
		System.out.println(Arrays.toString(arr));

	// charlardan olusan bir array olusturun ve "ascending order " yapiniz
	
	char arrCh[]= {'a','k','d','b'};
	System.out.println(Arrays.toString(arrCh));
	
	Arrays.sort(arrCh);
	System.out.println(Arrays.toString(arrCh));
	
	//Soru; Strin'lerden olusan bir array olusturun ve ascending yapin
	
	String arrstr[]= {"ali","yasar","kemal","bekir"};
	System.out.println(Arrays.toString(arrstr));
	Arrays.sort(arrstr);
	System.out.println(Arrays.toString(arrstr));
	
	}

}
