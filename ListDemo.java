package tamilnadu;

import java.util.LinkedListt;

public class ListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ListDemo ld = new ListDemo();
ld.learn_LinkedListt();
	}

	private void learn_LinkedListt() {
		// TODO Auto-generated method stub
	LinkedList al = new LinkedList();


	al.add("AJAY");
	al.add("AJAY");
	al.add(85);
	al.add(8.55);
	al.add(true);
	al.add(5.5);
	al.add("AJAY");
	System.out.println(al);
	al.remove("AJAY");
	System.out.println(al);
	System.out.println(al.get(4));
	al.add(3 , "ABCD");
	System.out.println(al);
	System.out.println(al.contains(8.55));
	System.out.println(al.indexOf("ABCD"));
	System.out.println(al.size());
	al.set(4 , "Vim");
	System.out.println(al);
	
	LinkedList al2 = new LinkedList();
	al2.add(500);
	al2.add(700);
	al2.add(300);
	al.addAll(al2);
	System.out.println(al);
	
	//al.retainAll(al2);
	al.removeAll(al2);
	System.out.println(al);
	
	}

}
