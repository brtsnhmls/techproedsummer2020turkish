package day11stringmethods;

public class StringMethods01 {

	public static void main(String[] args) {
		//1-) startWith() metodu bir sitringin istene har ile baslayip baslamadigini
		//kontrol eder. Istenen hafle basliyorsa true Istenen harfle baslamiyorsa False return eder.
		
		String str1="Ali Can";
		str1.startsWith("A");
		System.out.println(str1.startsWith("A"));
		System.out.println(str1.startsWith("B"));
		System.out.println(str1.startsWith("a"));
	
		System.out.println(str1.startsWith("Ali"));
		
		
		//2-)startWith 
		str1.startsWith("a",3);
		System.out.println(str1.startsWith("Ca",4));
		
				
		// endsWith() Bir Stringin istene harfle bitip bitmedigini kontrol eder bitiyorsa "True"
		// Bitmiyorsa "False" Return eder
		
		String str2="Ayse Canan";
		System.out.println(str2.endsWith("n"));
		System.out.println(str2.endsWith("CANAN"));
		System.out.println(str2.endsWith("Canan"));
		
		
		String str3="Ali ";
		System.out.println(str2.endsWith(" "));//true
		System.out.println(str2.endsWith(""));//true
		
	}

}
