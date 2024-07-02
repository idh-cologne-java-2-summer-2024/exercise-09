package idh.java;

import java.util.ArrayList;
import java.util.LinkedList;
import org.apache.commons.collections4.list.TreeList;
// ich weiß nicht, wieso das oben rot angestrichen ist, eiegntlich müsste es laut Demmer so richtig sein.
public class Application {

	public static void main(String[] args) {
		
		System.out.println("ArrayList: " + ListTest.getTime(new ArrayList<Integer>()) + "ms");
		System.out.println("TreeList: " + ListTest.getTime(new TreeList()) + "ms");
		System.out.println("LinkedList: " + ListTest.getTime(new LinkedList<Integer>()) + "ms");
	}
	
}