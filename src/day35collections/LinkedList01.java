package day35collections;

import java.util.LinkedList;

public class LinkedList01 {

	public static void main(String[] args) {
		// Linked list' head haric her eleman icin bir data bir de pointer var.
		// head' de sadece pointer var.
		// Her elemanin pointer'i bir sonraki elemani gosterir, son eleman'in (tail)
		//pointer'i Null Gosterir.
		// Data ve pointer iceren her elemanin diger adi"Node" dur.
		//Linked list eleman ekleme ve cikarma durumlarinda basarilidir.
		
		
		
		// LinkedList Objesi olusturunuz
		
		LinkedList<String>linkList=new LinkedList<>();
		
		linkList.add("Mark");
		linkList.add("Amanda");
		linkList.add("John");
		linkList.add("Ann");
		linkList.add("Pamela");
		
		System.out.println(linkList);
		
		linkList.remove(2);
		System.out.println(linkList);
		
		linkList.removeFirst();
		System.out.println(linkList);
		
		linkList.removeLast();
		System.out.println(linkList);
		
		linkList.add(1,"Ali");
		System.out.println(linkList);
		
		linkList.addFirst("Kemal");
		System.out.println(linkList);
		
		linkList.addLast("Zeynep");
		System.out.println(linkList);
		
		linkList.set(1, "Ajanda");
		System.out.println(linkList);
		
		
		LinkedList<String>linkList2=new LinkedList<>();
		linkList.add("X");
		linkList.add("Y");
		
		linkList2.addAll(linkList);
		System.out.println(linkList2);
		
		linkList.addAll(3, linkList2);
		System.out.println(linkList);
		
		System.out.println(linkList2.contains("Can"));
		System.out.println(linkList2.contains("Ali"));
		
		linkList2.clear();
		System.out.println(linkList2);

	}

}
