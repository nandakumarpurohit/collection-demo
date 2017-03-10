/**
 * 
 */
package com.demo;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * @author Nanda
 *
 */
public class ArrayListDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> a1 = new ArrayList<String>();
		a1.add("one");
		a1.add("two");
		a1.add("three");
		System.out.println(a1 + ":" + a1.size());
		
		Iterator it = a1.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		for(int i=0;i<a1.size();i++)
			System.out.println(a1.get(i));
		
		for(String str : a1) {
			System.out.println(str);
		}
		
		a1.forEach(System.out::println);
	}

}
