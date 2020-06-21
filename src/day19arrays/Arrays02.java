package day19arrays;

public class Arrays02 {

	public static void main(String[] args) {
		//char bir array olusturun 4 elemanli 
		// bu array elemanlar yerlestitin tum 
		//elemanlari for dongusu ile ekrana yazdirin
	
	char arr1[]=new char[4];
	arr1[0]='e';
	arr1[1]='l';
	arr1[2]='i';
	arr1[3]='f';
	
	for(char i=0;i<arr1.length;i++) {
		
		System.out.println(arr1[i]);
	}
	
	System.out.println(arr1.length-1);
//Array'in Length' ini bulmak icin "ArrayIsmi.lenght"	yazmak yeterlidir.
	System.out.println(arr1.length);
	
	
	}

}
