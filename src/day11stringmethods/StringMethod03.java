package day11stringmethods;

public class StringMethod03 {

	public static void main(String[] args) {
		//concat() // method concatenation yapmanin yani iki stringi birlestirmenin diger yontemidir.
		
		String str1="Ali";
		String str2="Veli";
		
		System.out.println(str1+str2);
		System.out.println(	str1.concat(str2));
		System.out.println(	str1.concat(str2).concat(str1));//concat() i istediginiz kadar pes pese kullanabilirsiniz.

	
		//replace() metodu Bir Karakterin butun gorunumlerinin yerina baska karakter yazmaya yarar
		//1. Versiyon
		String str3="ata";
		str3.replace("t","n");
		System.out.println(	str3.replace("t","n"));//ana
		System.out.println(	str3.replace("a","u"));//Bu Sekilde kullanilirsa birinci karakterin tamamini bulup degistiriyor
		System.out.println(	str3.replace("x","t"));// Olmayan Bir karakter verince oldugu gibi verir degisiklik yapmaz
		System.out.println(	str3.replace("t",""));//t yi siler biz bu yontemi bir karakteri silmek icin kullaniriz
		System.out.println(	str3.replace("at","Mustaf"));//mustafa
		System.out.println(	str3.replace("at","y"));//ya
	
		//2. Versiyon
		//replaceFirst() metodu degistirmek istedigimiz karakterin sadece ilk gorunumunu degistirir
		String str4="karakartal";
		System.out.println(str4.replaceFirst("k", "K"));// Karakartal
		System.out.println(str4.replaceFirst("a", "e"));
		System.out.println(str4.replaceFirst("ka", "A"));
		System.out.println(str4.replaceFirst("kar", ""));
		System.out.println(str4.replaceFirst("kar", "").replaceFirst("a","A"));
		
		//Soru
		String text="Ali okula gitti. Ali Otobuse Bindi. Ali yemek yedi Ali uyudu";
	
	    System.out.println(text.replace("Ali", "Veli"));
	
	    //replaceAll() ve replace() Metodlari tamamen ayni seyi yapar
	    //replace metodunda isterseneiz characterler icin tek tirnak kullanabilirsiniz
	    
	    
	
	}

}
