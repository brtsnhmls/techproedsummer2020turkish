package day33interface;

public interface IcAraba {

	public abstract void direksiyon();
	void koltuk();
	abstract void klima();
	
int price=2000;
boolean old=true;
	
//default keyword'unu kullanirsak metoda body eklemek zorundayiz.
//Aksi takdirde Compile Time Error aliriz.
	public default void doseme() {
		System.out.println("Interface de default keyword ile doseme yaptim");
	}
	
}
