package day33interface;

public class LuxHonda extends Araba implements IcAraba, DisAraba{

	public static void main(String[] args) {
		
		LuxHonda luxHonda=new LuxHonda();
		luxHonda.benzin();
		luxHonda.direksiyon();
		luxHonda.kapi();
		luxHonda.klima();
		luxHonda.move();
	System.out.println("Ic Arabanin Fiyati : "+IcAraba.price);
	System.out.println("Dis Arabanin Fiyati : "+DisAraba.price);
	System.out.println(old);
	

	}
public void move() {
	System.out.println("3 saniyede 100km'lik hiza ulasir");
}
@Override
public void kapi() {
	System.out.println("Parmak izi ayarli kapi");
	
}
@Override
public void direksiyon() {
	System.out.println("Deri Direksiyon");
	
}
@Override
public void koltuk() {
	System.out.println("Klimali Deri Koltuklar");
	
}
@Override
public void klima() {
	System.out.println("Cok Bolgeli Digital Klima");
	
}
	
}
