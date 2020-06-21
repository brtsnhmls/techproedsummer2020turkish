package day11stringmethods;

public class StringMethods04 {

	public static void main(String[] args) {
		// valueOf() rakamlarla olusturulan stringleri sayi gibi sayiya donusturur
		// boylece rakamlarla olusturulan stringlerler matematiksel islemler yapabilmemizi saglar
		// valueOf hem Integer wrapper classin icinde hemde Stringin icinde var
		// integer wrapper classinin icinde olan valueOf() Stringi intgere cevirir
		//String in icindeki valueOf() integeri Stringe Cevirir 
		
		
		String paraErkek="1900";
		String paraKadin="2000";
		
		// Bu ailenin toplam gelirini bulunuz
	
		System.out.println(Integer.valueOf(paraErkek)+Integer.valueOf(paraKadin));

		int maasErkek=1900;
		int maasKadin=2000;
		
		//Maas Erkek ve Maas Kadin sayilarini Stringe Donusturen ve concodation yapin
		
		System.out.println(String.valueOf(maasErkek)+String.valueOf(maasKadin));
		
		
		
	}

}
