package day27constructorcagirma;

public class Mammal extends Animal {

	public boolean dogum = true;
	public Mammal(int age) {
		super();
		System.out.println("Child Constructor called by this");
	}
	public Mammal() {
		this(11);
		System.out.println("Child Constructor ");
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
  Mammal mammal=new Mammal(15);
	
	}
	
	public void feed() {
		System.out.println("Cocuklarini besler");

	}
	
	

}
