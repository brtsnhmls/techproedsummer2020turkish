package day32abstraction;

public class KralDairesi extends Otel{

	public static void main(String[] args) {
	
		KralDairesi musteri3=new KralDairesi();
		musteri3.kahvalti();
		System.out.println(musteri3.tv("international", 8));
		System.out.println("Wifi Ucreti :"+ musteri3.wifi(5));

	}

	@Override
	public void kahvalti() {
	System.out.println("Kahvaltiniz teras kat kral restaurant' dadir");
		
	}

	public int tv(String international,int saat) {
		if(international.contentEquals(international)) {
			return saat*5;
		}else {
			return 0;
		}
	}
}
