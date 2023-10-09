package ArrayList;

import java.util.*;

public class Test {
    public static void main(String[] args) {

            HashSet<Integer> hashSet = new HashSet<>(Arrays.asList(2, 3, 2, 3,10, 11,23,56));
            TreeSet<Integer> treeSet = new TreeSet<>(Arrays.asList(90, 90, 88, 87, 199, 200, 200, -100,-100));
            LinkedHashSet<Integer> linkedHashSet = new LinkedHashSet<>(Arrays.asList(1, 6, 2, 4, 5,5, 10, 12, 13));
            TreeSet<String> treeSet2 = new TreeSet<>(Arrays.asList("sad", "A", "a", "B", "Yedil", "Daud", "Car"));

            System.out.println(linkedHashSet);

//        ArrayList<Integer> arrayList = new ArrayList<>();
//        arrayList.add(4);
//        arrayList.add(9);
//        arrayList.add(8);
//        arrayList.add(7);
//        arrayList.add(5);
//
//        for (Integer element : arrayList) {
//            System.out.print(element + " ");
//        }


    }
    }
