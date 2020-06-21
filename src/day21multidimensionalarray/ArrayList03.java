package day21multidimensionalarray;

import java.util.ArrayList;
import java.util.List;

public class ArrayList03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	List<String> list=new ArrayList<>();
	
	list.add("Ali");
	list.add("Can");
	list.add("Ayse");
	list.add("Ali");
	
	System.out.println(list);
	
	list.remove("Ali");//Birden Fazla ayni eleman varsa ilkini siler
	System.out.println(list);
	list.remove("Ali");
	System.out.println(list);
	list.remove("Kemal");// Remove Metodu Listede olmayan elemanlar icin hata vermez.
	System.out.println(list);
	System.out.println(list);
	list.indexOf("Ayse");
	System.out.println(list.indexOf("Ayse"));
	System.out.println(list.remove(0));
	System.out.println(list);
	//Ayse Elemanini "Guzel Ayse" yapin set() metodu kullanilir.
	list.set(0, "Aysegul");
	System.out.println(list);
	
	list.add("Kenan");
	list.add("Zeynep");
	System.out.println(list);
	list.clear();
	System.out.println(list);
	
	
	
	}

}
