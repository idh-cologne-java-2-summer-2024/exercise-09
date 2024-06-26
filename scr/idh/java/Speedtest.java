package idh.java;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Random;
import org.apache.commons.collections4.list.TreeList;

public class Speedtest {
	TreeList<Integer> tl;
	LinkedList <Integer> ll; 
	ArrayList <Integer> al; 
	
	public Speedtest() {
	
	tl = new TreeList<Integer>(); 
	ll = new LinkedList<Integer>();
	al = new ArrayList<Integer>();
	}
	
	
	public void treeListSpeedTest() {
		Random r= new Random();

		long start = System.currentTimeMillis();
				
			for (int i=0; i<100000; i++) {
				
				this.tl.add(i, r.nextInt(100000));
			}
			for (int i=0; i<=10000; i++) {
				this.tl.add(r.nextInt(10000), r.nextInt(100000));
			}
		long end = System.currentTimeMillis();
		System.out.println("This TreelistList has a speed of: "+ (end-start) +" ms");
	}
	
	public void linkedListSpeedTest() {
		Random r= new Random();

		double start = System.currentTimeMillis();
				
			for (int i=0; i<100000; i++) {
				this.ll.add(i, r.nextInt(100000));
			}
			for (int i=0; i<10000; i++) {
				this.ll.add(r.nextInt(100000), r.nextInt(10000));
			}
		double end = System.currentTimeMillis();
		System.out.println("This LinkedList has a speed of: "+ (end-start)+" ms");
	}
	
	public void arrayListSpeedTest() {
		Random r= new Random();

		double start = System.currentTimeMillis();
				
			for (int i=0; i<100000; i++) {
				this.al.add(i, r.nextInt(100000));
			}
			for (int i=0; i<10000; i++) {
				this.al.add(r.nextInt(100000), r.nextInt(10000));
			}
		double end = System.currentTimeMillis();
		System.out.println("This ArrayList has a speed of: "+(end-start)+" ms");
	}
	

	public static void main(String[] args) {
	 Speedtest listspeed = new Speedtest(); 
	 listspeed.treeListSpeedTest();
	 listspeed.linkedListSpeedTest();
	 listspeed.arrayListSpeedTest();
	}

}
