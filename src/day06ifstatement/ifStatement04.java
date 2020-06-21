package day06ifstatement;

public class ifStatement04 {

	public static void main(String[] args) {
		//Bir tane String Variable  Bir gun ismini kucuk harflerler atayin 
		//Eger atadiginiz deger Hafta ici Gunlerinden birinin ilk harfi ise 
		//Ekrana Hafta ici Yazdirin Eger hafta sonu Gunlerin 

		String gun="pazartesi";
		
		if(gun.equals("pazartesi")|| gun.equals("sali")||gun.equals("carsamba")|| gun.equals("persembe")||gun.equals("cuma")) {
			System.out.println("Hafta ici");
		}
		

		if(gun.equals("cumartesi")|| gun.equals("pazar") ) {
			System.out.println("Hafta sonu");
		}
	}

}
