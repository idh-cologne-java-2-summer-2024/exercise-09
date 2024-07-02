package idh.java;

public class TreeList {
	

	import java.uitl.ArrayList;
import java.util.Random;

import com.sun.tools.javac.util.List;

		public static long getTime (List<Integer> listToTest) {
			
			long startTime = System.currentTimeMillis();
			
			Random random = new Random (); 
			
			for (int i = 0; i < 100000; i++) {
				listToTest.add(random.nextInt()); 
				
				
			random = new Random (); 
				
			for (int i = 0; i < 100000; i++) {
					listToTest.add(random.nextInt(99999),random.nextInt() ); 
			}
					
				
			return System.currentTimeMillis()- startTime; 
		}

	}



