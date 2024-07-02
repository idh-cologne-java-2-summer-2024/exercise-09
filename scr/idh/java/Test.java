import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;
import org.apache.commons.collections4.list.TreeList;

public class ListInsertionExperiment {


import java.util.Arrays;
import java.util.List;

public class ExampleUsage {
    public static void main(String[] args) {
        List<String> list1 = Arrays.asList("A", "B", "C");
        List<String> list2 = Arrays.asList("B", "C", "D");
    }
}
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;
import org.apache.commons.collections4.list.TreeList;

public class ListInsertionExperiment {
	import java.util.ArrayList;
	import java.util.LinkedList;
	import java.util.List;
	import java.util.Random;
	import org.apache.commons.collections4.list.TreeList;

	public class ListInsertionExperiment {


private static final int INITIAL_SIZE = 100000;
private static final int INSERTION_COUNT = 10000;

public static void main(String[] args) {
    // Definieren der Listentypen
    List<List<Integer>> lists = new ArrayList<>();
    lists.add(new ArrayList<>(INITIAL_SIZE));
    lists.add(new LinkedList<>());
    lists.add(new TreeList<>());

    // Listentypnamen für die Ausgabe
    String[] listNames = {"ArrayList", "LinkedList", "TreeList"};

    for (int i = 0; i < lists.size(); i++) {
        List<Integer> list = lists.get(i);
        long duration = measureInsertionTime(list);
        System.out.println(listNames[i] + " insertion time: " + duration + " ms");
    }
}

private static long measureInsertionTime(List<Integer> list) {
    Random random = new Random();

    // Initiale Liste mit Zufallszahlen füllen
    for (int i = 0; i < INITIAL_SIZE; i++) {
        list.add(random.nextInt());
    }

    // Zeit vor dem Einfügen messen
    long startTime = System.currentTimeMillis();

    // Zufällige Einfügungen durchführen
    for (int i = 0; i < INSERTION_COUNT; i++) {
        list.add(random.nextInt(list.size()), random.nextInt());
    }

    // Zeit nach dem Einfügen messen
    long endTime = System.currentTimeMillis();

    // Dauer berechnen
    return endTime - startTime;
    }
}