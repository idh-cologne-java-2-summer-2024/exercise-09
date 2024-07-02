package idh.java;

import org.apache.commons.collections4.list.TreeList;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;


public class test {

	TreeList <Integer>tl;
	LinkedList <Integer>ll;
	ArrayList <Integer>al;
	
	public test() {
	
		ll = new LinkedList<Integer>();
		al = new ArrayList<Integer>();
		tl = new TreeList<Integer>(); 
	}

	
	public void linkedListSpeed() {
		Random r= new Random();

		double start = System.currentTimeMillis();
				
			for (int i=0; i<100000; i++) {
				this.ll.add(i, r.nextInt(100000));
			}
			for (int i=0; i<10000; i++) {
				this.ll.add(r.nextInt(10000), r.nextInt(100000));
			}
		double end = System.currentTimeMillis();
		System.out.println("The speed of this linked List is "+ (end-start)+" ms");
	}
	
	public void arrayListSpeed() {
		Random r= new Random();

		double start = System.currentTimeMillis();
				
			for (int i=0; i<100000; i++) {
				this.al.add(i, r.nextInt(100000));
			}
			for (int i=0; i<10000; i++) {
				this.al.add(r.nextInt(10000), r.nextInt(100000));
			}
		double end = System.currentTimeMillis();
		System.out.println("The speed of this Array List is "+(end-start)+" ms");
	}
	public void treeListSpeed(){
		Random r= new Random();

		long start = System.currentTimeMillis();
				
			for (int i=0; i<100000; i++) {
				
				this.tl.add(i, r.nextInt(100000));
			}
			for (int i=0; i<=10000; i++) {
				this.tl.add(r.nextInt(100000), r.nextInt(10000));
			}
		long end = System.currentTimeMillis();
		System.out.println("The speed of this Tree List is "+ (end-start) +" ms");
	}
	

	public static void main(String[] args) {
	 test listspeed = new test(); 
	 listspeed.treeListSpeed();
	 listspeed.linkedListSpeed();
	 listspeed.arrayListSpeed();
	}
}
