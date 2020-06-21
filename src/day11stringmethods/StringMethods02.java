package day11stringmethods;

public class StringMethods02 {

	public static void main(String[] args) {
		//substring() metodu bir stringin belli bir bolumunu kesip almak icin kullanilir
		//1.Versiyon
		String str1="Java calisana kolaydir";
		
		
		//substring() 1. versiyon
		/*
		System.out.println(str1.substring(5));//calisana kolaydir. 5 indexi gosterir
		System.out.println(str1.substring(8));//isana kolaydir. index 8 dahildir(inclusive)
		System.out.println(str1.substring(22));//ekranda hic bir sey goremezsiniz
		System.out.println(str1.substring(23));// index 23 yok ama ben olmayan yerden kesmek istiyorum
										       // Bu bir hatali istektir. java beni uyarir hata yapiyorsun der
		System.out.println(str1.substring(0));// str1.substring() = str1 oldundan dolayi substring(0) hic kullanilmaz
	
	*/
		//2. substring() 2. Versiyonu
		str1.substring(5,13);
		System.out.println(str1.substring(5,13));// ilk indexi ekranda gorursunu ikinci indexi ekranda goremezsiniz
		System.out.println(str1.substring(6, 12));//alisan
		System.out.println(str1.substring(6,6)); // Son sozu sondaki soyledigi icin ekrana hic bir sey cikmaz
		//System.out.println(str1.subSequence(7,6));// Boyle kullanilmaz hata verir cunku ilk index her zaman kucuk olmalidir
		
		
	
	
	
	}

}
