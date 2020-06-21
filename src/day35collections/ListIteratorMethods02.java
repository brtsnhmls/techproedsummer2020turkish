package day35collections;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorMethods02 {

	public static void main(String[] args) {
		// Elemanlari A,B,C olan bir list olustrunuz LisIterator kullanarak
		
		List<String>list=new ArrayList<>();
		list.add("A");
		list.add("B");
		list.add("C");
		
		ListIterator<String>listIterator=list.listIterator();
		
		while(listIterator.hasNext()) {
			Object element=listIterator.next();
			listIterator.set(element+"W");
			
		}
		System.out.println(list);//[AW, BW, CW]
		list.add("Kemal");
		list.add("Can");
		System.out.println(list);//[AW, BW, CW, Kemal, Can]
		
	}

}
