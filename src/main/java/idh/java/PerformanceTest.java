package idh.java;

import org.apache.commons.collections4.list.TreeList;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class PerformanceTest {

    private static final int INITIAL_SIZE = 100000;
    private static final int INSERTIONS = 10000;

    public static void main(String[] args) {
        List<Integer> arrayList = new ArrayList<>();
        List<Integer> linkedList = new LinkedList<>();
        List<Integer> treeList = new TreeList<>();

        System.out.println("ArrayList: " + testList(arrayList));
        System.out.println("LinkedList: " + testList(linkedList));
        System.out.println("TreeList: " + testList(treeList));
    }

    private static long testList(List<Integer> list) {
        Random random = new Random();

        for (int i = 0; i < INITIAL_SIZE; i++) {
            list.add(random.nextInt());
        }

        long startTime = System.currentTimeMillis();

        for (int i = 0; i < INSERTIONS; i++) {
            list.add(random.nextInt(list.size()), random.nextInt());
        }

        long endTime = System.currentTimeMillis();

        return endTime - startTime;
    }
}
