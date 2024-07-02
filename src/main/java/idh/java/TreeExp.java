package idh.java;
import org.apache.commons.collections4.list.TreeList;
import java.util.LinkedList;
import java.util.ArrayList;

public class TreeExp {
	public static void main(String[] args) {		
		long trTime1;
		long trTime2;
		long liTime1;
		long liTime2;
		long arTime1;
		long arTime2;
		
		TreeList<Integer> tl = new TreeList<Integer>();
		LinkedList<Integer> ll = new LinkedList<Integer>();
		ArrayList<Integer> al = new ArrayList<Integer>();
		
		for(int i = 0; i < 100000; i++) {
			tl.add((int)Math.random()*100);
			ll.add((int)Math.random()*100);
			al.add((int)Math.random()*100);
		}
		
		//Experiment für TreeList
		trTime1 = System.currentTimeMillis();
		for(int i = 0; i < 10000; i++) {
			tl.add((int)Math.random()*100000, (int)(Math.random()*100));
		}
		trTime2 = System.currentTimeMillis();
		System.out.println("Zeit TreeList in ms: " + "\t" + (trTime2 - trTime1));
		
		//Experiment für LinkedList
		liTime1 = System.currentTimeMillis();
		for(int i = 0; i < 10000; i++) {
			ll.add((int)Math.random()*100000, (int)(Math.random()*100));
		}
		liTime2 = System.currentTimeMillis();
		System.out.println("Zeit LinkedList in ms: " + "\t" + (liTime2 - liTime1));
		
		//Experiment für ArryList
		arTime1 = System.currentTimeMillis();
		for(int i = 0; i < 10000; i++) {
			al.add((int)Math.random()*100000, (int)(Math.random()*100));
		}
		arTime2 = System.currentTimeMillis();
		System.out.println("Zeit ArrayList in ms: " + "\t" + (arTime2 - arTime1));
		
	}
}
