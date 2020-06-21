package day11stringmethods;

public class ForLoop03 {

	public static void main(String[] args) {
		//ilk dort sayma sayisinin carpimini veren sayi verin
		
		int product=1;
		for(int i=1;i<5;i++) {
			product=product*i;
		}
        System.out.println(product);
	


      int product1=1;
      for(int i=2;i<13;i=i+2) {
	  product1=product1*i;
       }
      System.out.println(product1);
	
      //9! Faktoriyeli hesaplayan programi yazin
      int product2=1;
		for(int i=9;i>0;i--) {
			product2=product2*i;
		}
       System.out.println("Faktoriel 9! :"+product2);
	
	
	
	}
}
