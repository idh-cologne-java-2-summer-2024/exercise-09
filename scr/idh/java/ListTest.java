package idh.java;


import java.util.Random;

import org.apache.commons.collections4.list.TreeList;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;




public class ListTest {

	
	public static long getTime(List<Integer> list) {
		
		long startTime = System.currentTimeMillis();
		
		Random r = new Random();
		for( int i = 0; i < 100000;i++){
			list.add(r.nextInt());
		}
	
		for( int i = 0; i < 10000;i++){
			list.add(r.nextInt(99999),r.nextInt());
		}
		return System.currentTimeMillis() - startTime;
	}
	
	
	public static void main(String[] args) {
		
		System.out.println("ArrayList: " + ListTest.getTime(new ArrayList<Integer>()) + "ms");
		System.out.println("TreeList: " + ListTest.getTime(new TreeList<Integer>())+ "ms");
		System.out.println("LinkedList: " + ListTest.getTime(new LinkedList<Integer>())+ "ms");
		
	}
	

}
