package day20arrays;

public class OdevSorusu01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int arr[]= {1,2,3,4,5};
int count=0;
for(int i=0;i<5;i++) {
	for(int j=i+1;j<5;j++) {
		if(arr[i]==arr[j]) {
			count++;
			
		}
	}
}
if (count>0) {
	System.out.println(count+"Ayni Eleman Var");
}else {
	System.out.println("Ayni Eleman yok");
}
	
	}

}
