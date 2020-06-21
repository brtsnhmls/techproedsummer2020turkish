package day20arrays;

import java.util.Arrays;

public class Arrays03 {

	public static void main(String[] args) {
		//iki array olusturun bir birine esit olup olmadigini kontrol ediniz
		// Not: iki Array'in esit  olabilmesi 
		//	1) Elemanlar Ayni olmali
		//  2) Esit elemanlarin indexleride esit olmali
		//{1,2,3}ve {1,2,3} esittir. {1,3,2}ve {1,2,3} esit degildir.
		
		int arr1[]= {1,2,3};
		int arr2[]= {1,2,3};
		
		System.out.println(Arrays.equals(arr1, arr2));

	}

}
