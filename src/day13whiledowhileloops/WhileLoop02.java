package day13whiledowhileloops;

public class WhileLoop02 {

	public static void main(String[] args) {
		//ilk 5 sayma sayinisinn capimini ekrana yazdiran programi yazdirin
		
		int i=1,product=1;
		while(i<6) {
			product=product*i;
			i++;
		}
        System.out.println(product);
	}

}
