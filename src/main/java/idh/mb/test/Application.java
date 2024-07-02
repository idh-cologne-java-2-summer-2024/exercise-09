package idh.mb.test;
import java.util.ArrayList;
import java.util.LinkedList;

import org.apache.commons.collections.list.TreeList;


public class Application {

	public static void main(String[] args) {
		
		System.out.println("TreeList: " + Lists.timer(new TreeList()) + " ms.");
		System.out.println("ArrayList: " + Lists.timer(new ArrayList<Integer>()) + " ms");
		System.out.println("LinkedList: " + Lists.timer(new LinkedList<Integer>())+ " ms");
		
		System.out.println("Working as intended.(*u*)b");
	}

}
