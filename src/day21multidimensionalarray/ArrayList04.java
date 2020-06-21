package day21multidimensionalarray;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayList04 {

	public static void main(String[] args) {
		// ["A","C","B","C" listesini olusturun
		
		List<String> list=new ArrayList<>();
		list.add("A");
		list.add("C");
		list.add("B");
		list.add("C");
		System.out.println(list);
		// list'de eleman olarak B var mi?
		list.contains("B");//Eger Eleman olarak B Var sa true, yoksa false return eder.
		System.out.println(	list.contains("B"));
			
		System.out.println(	list.contains("Z"));
		
		// Liste'deki elemanlari alfabetik siraya koyunuz
		// Collection --> Bir araya getirilmis parcalar
		Collections.sort(list);
		System.out.println(list);//[A,B,C,C]
		
	}

}
