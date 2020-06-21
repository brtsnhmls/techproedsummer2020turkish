package day18statickeyword;

public class Static01 {

	static int en=12;
	static int boy=10;
	static int alan;
	static double pi ;
	
	//Eger bir variable'in degerini olustururken hesaplama yapmamiz gerekirse
		//"static block" olusturmak iyidir. Yani; "int alan = en*boy;" demek yerine 
		//"static block" olusturup bu islemleri static block'un icine yazmak daha iyidir.
		//"static block" variable'lara deger atamak icin de kullanilabilir.
		
		//"static block" class'in icinde butun method'larin(main dahil) ve constructorlarin 
		//disinda olusturulmalidir.
		
		//static block class olusturuldugu zaman olusturulur.
		
		//"static block" tum methodlardan(main method dahil) ve constructorlardan once calistirilir.
		
		//Birden fazla static block varsa ustteki once calisir.

	
	static {
		alan = en*boy;
	}
	
	static {
		pi = 3.14;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub


	//Static class olusturulabilir alt class lar (inner class) static class olabilir
	//ust class(outer class) static olamazlar	
	
	
	}
static class AltClass{
		
	}
}
