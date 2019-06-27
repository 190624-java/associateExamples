package PepeAndZev;

import java.util.ArrayList;
import java.util.TreeSet;

public class TreeSets {
	
	public static void main(String[] args) {
		String name1 = "Pepe";
		String name2 = "Zev";
		ArrayList<String> names = new ArrayList<String>();
		names.add(name1);
		names.add(name2);
		names.add(name2); // repeated element for ArrayList OK!
		
		TreeSet<String> ts = new TreeSet<String>();
		
		// void add(Object o)
		// adds an element to the TreeSet
		ts.add(name1);
		ts.add(name1); // won't be added, Set doesn't add duplicates
		
		// boolean contains(Object o)
		// Returns true if element is present in TreeSet otherwise returns false
		System.out.println(ts.contains("Pepe")); // prints true
		System.out.println(ts.contains("Zev")); // prints false
		System.out.println("-------------------");
		
		// void clear()
		// removes all elements in the TreeSet
		ts.clear();
		System.out.println(ts.contains("Pepe")); // prints false
		System.out.println("-------------------");
		
		// void addAll(Collection c)
		// adds all homogeneous non-repeated elements of a collection to the TreeSet
		ts.addAll(names); // name2 is repeated, won't add twice
		
		for(String s : ts) {
			System.out.println(s); // will print only "Pepe" and "Zev"
		}
	}
}
