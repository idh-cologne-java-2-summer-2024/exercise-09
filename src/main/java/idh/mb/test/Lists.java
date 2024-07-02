package idh.mb.test;

import java.util.List;
import java.util.Random;

public class Lists {
	/**
	 * fills a given List with 100000 random Integer values, before inserting another 10000 at random indices and 
	 * returns time spent on these operations in ms.
	 * @param testList - any given List Object (of type AL,LL,TL)
	 * @return time in ms
	 */
	 public static long timer(List<Integer>testList) {
		 Random rand = new Random();
		 long startTime = System.currentTimeMillis();
		 
		 for(int i = 0; i < 100000; i++) {
			 testList.add(rand.nextInt());
		 }
		 
//		 Random randomIn = new Random(9999);
		 for(int j = 0; j < 9999; j++) {
			 testList.add(rand.nextInt(9999), rand.nextInt());
		 }
		 
		 
		return System.currentTimeMillis() - startTime;	
	 }
}
