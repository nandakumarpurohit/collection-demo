/**
 * 
 */
package com.demo;

import java.util.Enumeration;
import java.util.Hashtable;

/**
 * @author Nanda
 *
 */
public class HTDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Hashtable table = new Hashtable();
		table.put("one", new Integer(234));
		table.put("two", new Double(34.56));
		table.put("three", "Hello");
		table.put("four", "Happy Sunday");;
		System.out.println(table);
		
		Enumeration e = table.keys();
		while(e.hasMoreElements()) {
			System.out.println(table.get(e.nextElement()));
		}
		

	}

}
