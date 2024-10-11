package ch15.sec03.exam01;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class HashSetExample {

	public static void main(String[] args) {
		Set<String> set = new TreeSet<String>();

		set.add("apple");
		set.add("bananar");
		set.add("orange");
		set.add("apple");
		set.add("mango");
		
		System.out.println(set.size());
		
		Iterator<String> iter = set.iterator();
		while(iter.hasNext()) {
			String element = iter.next();
			System.out.println(element);
		}
		System.out.println();
		for(String element : set) {
			System.out.println(element);
		}
		System.out.println();
		Iterator<String> riter = ((TreeSet<String>)set).descendingIterator();
		while(riter.hasNext()) {
			String element = riter.next();
			System.out.println(element);
		}

	}

}
