package idh.java;

import java.util.AbstractList;
import java.util.ListIterator;
import java.util.Random;

public class TreeList  extends AbstractList{

	

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Object get(int index) {
		// TODO Auto-generated method stub
		return null;
	}
	
	public static void main(String args) {
               final TreeList<Integer> list = new TreeList<Integer>(3);
               
               for (int i = 0; i < 100; ++i) {
                   list.add(i);
                }
              for (int i = 0; i < 100; ++i) {
                 System.out.println(i + ": " + list.get(i));
        }
	}
	
	/**
     * Loads a list with random integers and returns the duration of loading in
     * milliseconds.
     * 
     * @param list the list to load.
     * @param rnd  the random number generator.
     * @return     the duration for loading in milliseconds.
     */
    private static long load(final AbstractList<Integer> list, final Random rnd) {
        final long ta = System.currentTimeMillis();

        for (int i = 0; i < LOAD; ++i) {
            final int index = rnd.nextInt(list.size() + 1);
            list.add(index, rnd.nextInt());
        }
            return System.currentTimeMillis() - ta;
        }
}
