package idh.java;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;
import org.apache.commons.collections4.list.TreeList;

public class Experimentklasse {

    public static void main(String[] args) {
        // Anzahl der Zufallszahlen
        int initialSize = 100000;
        int additionalSize = 10000;

        // Erzeugung der Zufallszahlengenerator
        Random random = new Random();

        // ArrayList
        List<Integer> arrayList = new ArrayList<>(initialSize);
        for (int i = 0; i < initialSize; i++) {
            arrayList.add(random.nextInt());
        }
        long startTime = System.nanoTime();
        for (int i = 0; i < additionalSize; i++) {
            arrayList.add(random.nextInt(arrayList.size()), random.nextInt());
        }
        long endTime = System.nanoTime();
        System.out.println("ArrayList Dauer: " + (endTime - startTime) / 1_000_000 + " ms");

        // LinkedList
        List<Integer> linkedList = new LinkedList<>();
        for (int i = 0; i < initialSize; i++) {
            linkedList.add(random.nextInt());
        }
        startTime = System.nanoTime();
        for (int i = 0; i < additionalSize; i++) {
            linkedList.add(random.nextInt(linkedList.size()), random.nextInt());
        }
        endTime = System.nanoTime();
        System.out.println("LinkedList Dauer: " + (endTime - startTime) / 1_000_000 + " ms");

        // TreeList
        List<Integer> treeList = (List<Integer>) new TreeList();
        for (int i = 0; i < initialSize; i++) {
            treeList.add(random.nextInt());
        }
        startTime = System.nanoTime();
        for (int i = 0; i < additionalSize; i++) {
            treeList.add(random.nextInt(treeList.size()), random.nextInt());
        }
        endTime = System.nanoTime();
        System.out.println("TreeList Dauer: " + (endTime - startTime) / 1_000_000 + " ms");
    }
}
