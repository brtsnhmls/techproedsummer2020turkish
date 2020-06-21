package day35collections;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorMethods01 {

	public static void main(String[] args) {
		// Elemanlari A,B,ve  C olan birl list olusturunuz
		
		List<String> list=new ArrayList<>();
		
		list.add("A");
		list.add("B");
		list.add("C");
		
		System.out.println(list);
		
		ListIterator<String> listIterator=list.listIterator();
		
		while(listIterator.hasNext()) {
			
		
			Object element =listIterator.next();
			System.out.print(element+" ");
		
		}
		
		
		
		
	}

}
