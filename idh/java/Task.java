package idh.java;

import java.util.List;
import java.util.Random;
import java.util.TreeList;
import java.util.LinkedList;
import java.util.ArrayList;

public class Task {
	

    public static void main(String[] args) {

    	// bf = before ; af = after
    	// This is probably no working, I´ve got issues with the package which I don´t understand
    	
    	long bf = 0;
    	long af = 0;
    	
        Random random = new Random();
        
        TreeList<Integer> treeList = new TreeList<>();
    	ArrayList<Integer> arrayList = new ArrayList<>();
    	LinkedList<Integer> linkedList = new LinkedList<>();
        
//------- TreeList -----
        
        bf = System.nanoTime();
        for (int i = 0; i < 100000(); i++) 
        {
            treeList.add(random.nextInt());
        }
        
        af = System.nanoTime();
        System.out.println("TreeList time: " + (af - bf)/1000000 + "s");
        
//-------- LinkedList -----
       
        af = System.nanoTime();
        for (int i = 0; i < 100000; i++) 
        {
            linkedList.add(random.nextInt());
        }
        bf = System.nanoTime();
        System.out.println("LinkedList time: " + (af - bf)/1000000 + " ms");

        
//-------- ArrayList --------
        
        bf = System.nanoTime();
        for (int i = 0; i < 100000; i++) 
        {
            arrayList.add(random.nextInt());
        }
        af = System.nanoTime();
        System.out.println("ArrayList time: " + (af - bf)/1000000 + " ms");
    }

}
