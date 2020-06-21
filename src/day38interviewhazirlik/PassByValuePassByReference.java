package day38interviewhazirlik;

public class PassByValuePassByReference {

	public static void main(String[] args) {
		//Bir Metoda variable yollandiginda java o variable'in kobyasini olusturur ve metod'a kopyayi 
		// yollar bu yuzden variable'in orjinal degeri method calistiktan sonra ayni kalir.

		int x=12;
		System.out.println(increment(x));
		System.out.println(x);
		
		
		
	}

	public static int increment(int a) {
		a= a+1;
		return a;
	}
	
}
