package MapAndHashMap;

import java.util.*;

public class Map {
    public static void main(String[] args) {
//----------------------------------------------------------------------------------------------------------------------

//        Scanner scan = new Scanner(System.in);
//        HashMap<String, Integer> names = new HashMap<>();
//        for (int i = 0; i < 5; i++) {
//            names.put(scan.next(),scan.nextInt());
//        }
//
//        for (String key: names.keySet()) {
//            System.out.println(key + " costs " + names.get(key)+ " USD");
//        }
//----------------------------------------------------------------------------------------------------------------------

//        Scanner scan = new Scanner(System.in);
//        HashMap<String, Integer> goalsOfAFootballPlayer = new HashMap<>();
//
//        for (int i = 0; i < 5; i++) {
//            goalsOfAFootballPlayer.put(scan.next(),scan.nextInt());
//        }
//
//        for (String elem:goalsOfAFootballPlayer.keySet()) {
//            System.out.println(goalsOfAFootballPlayer.size());
//        }
//----------------------------------------------------------------------------------------------------------------------
//        Scanner scan = new Scanner(System.in);
//        HashMap<String, Integer> goalsOfAFootballPlayer = new HashMap<>();
//
//        for (int i = 0; i < 5; i++) {
//            goalsOfAFootballPlayer.put(scan.next(),scan.nextInt());
//        }
//
//        while (true){
//            if (goalsOfAFootballPlayer.size() == 5) break;
//            goalsOfAFootballPlayer.put(scan.next(),scan.nextInt());
//        }
//
//        for (String key:goalsOfAFootballPlayer.keySet()) {
//            System.out.println(key + " scored " + goalsOfAFootballPlayer.get(key) + " goals in EPL");
//        }
//----------------------------------------------------------------------------------------------------------------------

        //мое неверное решение
//        Scanner scan = new Scanner(System.in);
//        ArrayList<String> words = new ArrayList<>();
//        //HashMap<String,Integer> hashList= new HashMap<>();
//
//        String[] array = scan.nextLine().split(" ");
//
//        for (int i = 0; i < array.length; i++) {
//            words.add(array[i]);
//            }
//
//
//
//
//        for (String res: words) {
//            System.out.println(res + " ");
//        }

        // верное решение
//        Scanner in = new Scanner(System.in);
//        HashMap<String,Integer> map = new HashMap<>();
//        //dog cat door door dog cat cat house
//        String[] array = in.nextLine().split(" ");
//        //   ["dog","cat",'door', 'cat', "dog", "house"]
//        for (int i = 0; i < array.length; i++) {
//            map.put(array[i], 0);
//        }
//        for (int i = 0; i < array.length; i++) {
//            map.put(array[i], map.get(array[i])+1);
//        }
//
//        for (String key: map.keySet()) {
//            System.out.println("'" + key + "'" + " occurs " + map.get(key) + " times");
//        }

//---------------------------------------------------------------------------------------------------------------------

        Scanner in = new Scanner(System.in);
        HashMap<String,Integer> map = new HashMap<>();
        //dog cat door door dog cat cat house
        String[] array = in.nextLine().split(" ");
        //   ["dog","cat",'door', 'cat', "dog", "house"]
        for (int i = 0; i < array.length; i++) {
            map.put(array[i], 0);
        }
        for (int i = 0; i < array.length; i++) {
            map.put(array[i], map.get(array[i])+1);
        }

        for (String key: map.keySet()) {
            System.out.println("'" + key + "'" + " occurs " + map.get(key) + " times");
        }

    }
}
