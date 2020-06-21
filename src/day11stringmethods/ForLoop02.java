package day11stringmethods;

public class ForLoop02 {

	public static void main(String[] args) {
		// 100 den kucuk 3 un kati olan sayma sayilarini ekrana yan yana yazdiran for loop yazdirin

		for(int i=3;i<100;i+=3) {
			System.out.print(" "+i);
		}
		
		System.out.println();
	
		//Ilk bes Sayma sayisinin toplamini veren programini yazin for loop ile
		
		int sum=0;
		for(int i=1;i<6;i++) {
			sum=sum+i;
		}
		System.out.println("Toplam :"+sum);
		
		
		//10 dan buyuk ilk uc sayma sayisinin forloop yazin

		int sum1=0;
		for(int i=11;i<14;i++) {
			sum1=sum1+i;
		}
		System.out.println("Toplam :"+sum1);
	
		//20 den buyuk ilk 5 sayma sayisinin toplamini veren forloop olusturun

		int sum2=0;
		for(int i=21;i<26;i++) {
			sum2=sum2+i;
		}
		System.out.println("Toplam :"+sum2);
	
		//ilk 50 sayma sayisinin toplamini veren foloop olusturunuz
		
		int sum3=0;
		for(int i=1;i<51;i++) {
			sum3=sum3+i;
		}
	    System.out.println("Toplam :"+sum3);
	
		// 5 ile bolunebilen 10 kucuk sayma sayilari
		

	    int sum4=0;
	    for(int i=5;i<100;i+=5) {
		sum4=sum4+i;
	       }
	     System.out.println("Toplam :"+sum4);

	
	
	
	
	}

}
