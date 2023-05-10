package tamilnadu;

import java.util.HashSet;

public class LinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
HashSet al2 = new HashSet(); 
		al2.add(110); 
		al2.add(200);
		al2.add(300);
		al.addAll(al2);
		System.out.println(al);
		al.add(100);
		//al.retainAll(al2);
		al.removeAll(al2);
		System.out.println(al);

HashSet al = new HashSet(); 
		short s = 5;
		al.add(s); 
		al.add("Shirt");
		al.add(50);
		al.add(true);
		al.add(5.5f);
		al.add(56.23);
		al.add("Shirt");
		System.out.println(al);
		al.remove("Shirt");
		System.out.println(al);
		System.out.println(al.get(2)); 
		al.add(3, "Abcd");
		System.out.println(al);
		System.out.println(al.contains(5.5f)); 
		System.out.println(al.indexOf("Abcd")); 
		System.out.println(al.size()); 
		al.set(4, "Karthik");
		System.out.println(al);
		
		HashSet al2
HashSet al2 = new HashSet(); 
		al2.add(110); 
		al2.add(200);
		al2.add(300);
		al.addAll(al2);
		System.out.println(al);
		al.add(100);
		//al.retainAll(al2);
		al.removeAll(al2);
		System.out.println(al);
	}

}
