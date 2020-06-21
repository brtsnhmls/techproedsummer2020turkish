package day33interface;

public class BasicHonda extends Araba implements IcAraba,DisAraba{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BasicHonda basicHonda=new BasicHonda();
		basicHonda.diesel();
		basicHonda.kapi();
		basicHonda.direksiyon();
		basicHonda.move();
		basicHonda.klima();
		basicHonda.koltuk();
	}

	@Override
	public void kapi() {
		System.out.println("Kumanda ile Acilana Kapi");
		
	}

	@Override
	public void direksiyon() {
		System.out.println("Kaucuk Deri ");
		
	}

	@Override
	public void koltuk() {
		System.out.println("Standart Koltuk ");
		
	}

	@Override
	public void klima() {
		System.out.println("Manuel Klima");
		
	}

	@Override
	public void move() {
		System.out.println("0-100 hiza 12 saniyede ulasir");
		
	}

		public void diesel() {
			System.out.println("2.0 Dizel Motor");
		}
}