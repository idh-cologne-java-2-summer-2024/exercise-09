package idh.java;
import org.apache.commons.collections4.list.TreeList;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Random;

public class Test {
	
	public static void main (String[] args) {
	TreeList<Integer> treeList = new TreeList<>();
	ArrayList<Integer> arrayList = new ArrayList<>();
	LinkedList<Integer> linkedList = new LinkedList<>();
	 int anzahlZusatzZahlen = 10000;
	Random random = new Random();
	 

	for (int i = 0; i < 100000; i++) {
        int zufallsZahl = random.nextInt();  
        treeList.add(zufallsZahl);
        }
	
	for (int i = 0; i < anzahlZusatzZahlen; i++) {
        int zufallsZahl = random.nextInt();
        int zufallsIndex = random.nextInt(treeList.size());
        treeList.add(zufallsIndex, zufallsZahl);
    }
	System.out.println(treeList);
//3ms
	
	
//	for (int i = 0; i < 100000; i++) {
//        int zufallsZahl = random.nextInt();  
//        linkedList.add(zufallsZahl);
//        }
//	
//	for (int i = 0; i < anzahlZusatzZahlen; i++) {
//        int zufallsZahl = random.nextInt();
//        int zufallsIndex = random.nextInt(linkedList.size());
//        linkedList.add(zufallsIndex, zufallsZahl);
//    }
//			System.out.println(linkedList);
// 3ms
	
	

//for (int i = 0; i < 100000; i++) {
//       int zufallsZahl = random.nextInt();  
//       arrayList.add(zufallsZahl);
//       }
//	
//	for (int i = 0; i < anzahlZusatzZahlen; i++) {
//        int zufallsZahl = random.nextInt();
//        int zufallsIndex = random.nextInt(arrayList.size());
//        arrayList.add(zufallsIndex, zufallsZahl);
//    }
//	
//	System.out.println(arrayList);
//2ms
	

	
	
	

	}
}
