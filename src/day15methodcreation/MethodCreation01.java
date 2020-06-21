package day15methodcreation;

public class MethodCreation01 {

	public static void main(String[] args) {
	
		System.out.println(toplama(5,3));
		System.out.println(carpma(3,5));
		
		
		
		
	}
// Bir metodu main metodun icinden cagirmak icin mutlaka static kelimesini kullanmalisiniz
// Method parantezinin icinde olusturlan variable lara "parametre" denir.
// Methodu cagiriken method parantezinin icine yazilan degerlere "argument" denir
	public static int toplama(int num1,int num2) {
		return num1+num2;
	}
	public static int carpma(int num1,int num2) {
	return	num1*num2;
	}
	
	
	
}
