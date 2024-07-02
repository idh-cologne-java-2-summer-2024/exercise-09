package idh.java;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Random;
import org.apache.commons.collections4.list.TreeList;

public class HundredThousandTree {

	public static void main(String[] args) {
		System.out.println("TEST: Dauer von Operation mit TreeList: "+testTreeList());
		System.out.println("TEST: Dauer von Operation mit LinkedList: "+testLinkedList());
		System.out.println("TEST: Dauer von Operation mit ArrayList: "+testArrayList());
	}
	
	/*Die Methode um eine TreeList zu erstellen und 
	 * die Zeit für die durchgeführten Operationen berechnen.
	 * Und hier das Prozedere für die LinkedList.
	 * **/
	protected static long testTreeList(){
		Random random = new Random();
		TreeList<Integer> tl = new TreeList<Integer>();
		long testTime = System.currentTimeMillis();
		
		
		for (int i = 0; i<100000;i++) {
			tl.add(random.nextInt());
		}
		for (int l = 0; l<10000;l++) {
			tl.add(random.nextInt(100000), random.nextInt());
		}
		testTime = System.currentTimeMillis() - testTime;
		return testTime;
	}
	
	/*Die Methode um eine LinkedList zu erstellen und 
	 * die Zeit für die durchgeführten Operationen berechnen.
	 * Und hier das Prozedere für die LinkedList.
	 * **/
	protected static long testLinkedList(){
		Random random = new Random();
		LinkedList<Integer> ll = new LinkedList<Integer>();
		long testTime = System.currentTimeMillis();
		
		for (int i = 0; i<100000;i++) {
			ll.add(random.nextInt());
		}
		for (int l = 0; l<10000;l++) {
			ll.add(random.nextInt(100000), random.nextInt());
		}
		testTime = System.currentTimeMillis() - testTime;
		return testTime;
	}
	
	/*Die Methode um eine ArrayList zu erstellen und 
	 * die Zeit für die durchgeführten Operationen berechnen.
	 * Und hier das Prozedere für die LinkedList.
	 * **/
	protected static long testArrayList(){
		Random random = new Random();
		ArrayList<Integer> al = new ArrayList<Integer>();
		long SuperTime = System.currentTimeMillis();
		
		for (int i = 0; i<100000;i++) {
			al.add(random.nextInt());
		}
		
		for (int l = 0; l<10000;l++) {
			al.add(random.nextInt(100000), random.nextInt());
		}
		long testTime = System.currentTimeMillis() - SuperTime;
		return testTime;
	}

}
