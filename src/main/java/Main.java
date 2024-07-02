import org.apache.commons.collections4.list.TreeList;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Random;


public class Main {
    public static void main(String[] args) {

        TreeList treeList = new TreeList();
        LinkedList linkedList = new LinkedList();
        ArrayList arrayList = new ArrayList();


        int listSize = 100000;
        int addElements = 10000;
        Random random = new Random();

        for (int i = 0; i < listSize; i++) {
            int randomInt = random.nextInt(listSize);
            arrayList.add(randomInt);
            linkedList.add(randomInt);
            treeList.add(randomInt);
        }

        // TreeList
        double startTime = System.currentTimeMillis();
        for (int i = 0; i < addElements; i++) {
            arrayList.add(random.nextInt(listSize + i), random.nextInt());
        }
        double endTime = System.currentTimeMillis();
        double totalTimeArray = endTime - startTime;

        // linkedList
        startTime = System.currentTimeMillis();
        for (int i = 0; i < addElements; i++) {
            linkedList.add(random.nextInt(listSize + i), random.nextInt());
        }
        endTime = System.currentTimeMillis();
        double totalTimeLinked = endTime - startTime;

        startTime = System.currentTimeMillis();
        for (int i = 0; i < addElements; i++) {
            treeList.add(random.nextInt(listSize + i), random.nextInt());
        }
        endTime = System.currentTimeMillis();
        double totalTimeTree = endTime - startTime;

        // Results
        System.out.println("ArrayList time: " + totalTimeArray);
        System.out.println("LinkedList time: " + totalTimeLinked);
        System.out.println("TreeList time: " + totalTimeTree);
    }


}
