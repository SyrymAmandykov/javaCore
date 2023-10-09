package ArrayList;

import java.util.*;

public class ArrList {
    public static void main(String[] args) {
//        Scanner scan = new Scanner(System.in);
//        int number = scan.nextInt();
//
//        ArrayList<Integer> list = new ArrayList<>();
//
//        for (int i = 0; i < number; i++) {
//            list.add(scan.nextInt());
//            System.out.println(list);
//        }

        // НЕ ВЫШЛО
//        Scanner scan = new Scanner(System.in);
//        int number = scan.nextInt();
//
//        ArrayList<Integer> list = new ArrayList<>();
//        for (int i = 0; i < number; i++) {
//            list.add(scan.nextInt());
//        }
//
//        int index = 0;
//        int max = list.get(0);
//        for (int i = 0; i < number; i++) {
//            if (list.get(i) > max) { // 1 > 0 то 0 = 1
//                max = list.get(i);
//                index = i;
//            }
//        }
//
//        list.remove(index);
//
//        int max1 = 0;
//        for (int i = 0; i < number; i++) {
//            if (list.get(i) > max1) {
//                max1 = list.get(i);
//            }
//        }
//        System.out.println(max1);

//        Scanner scan = new Scanner(System.in);
//        int number = scan.nextInt();
//
//        ArrayList<Integer> list = new ArrayList<>();
//        for (int i = 0; i < number; i++) {
//            list.add(scan.nextInt());
//        }
//
//        int count = 0;
//        for (int i = 0; i < list.size(); i++) {
//            if (list.get(i) > 0){
//                count++;
//            }
//        }
//        System.out.println(count);

//        Scanner scan = new Scanner(System.in);
//        int number = scan.nextInt();
//        int num1 = scan.nextInt(),num2 = scan.nextInt();
//
//        ArrayList<Integer> list = new ArrayList<>();
//        for (int i = 0; i < number; i++) {
//            list.add(scan.nextInt());
//        }
//
//        int sum = 0;
//        for (int i = num1; i <= num2; i++) {
//            sum += list.get(i);
//        }  System.out.println(sum);


//        Scanner scan = new Scanner(System.in);
//        int number = scan.nextInt();
//        int num1 = scan.nextInt(),num2 = scan.nextInt();
//
//        ArrayList<Integer> list = new ArrayList<>();
//        for (int i = 0; i < number; i++) {
//            list.add(scan.nextInt());
//        }
//
//        for (int i = num2; i >= num1; i--) {
//            System.out.print(list.get(i) + " ");
//        }


//        Scanner scan = new Scanner(System.in);
//
//        ArrayList<Integer> list = new ArrayList<>();
//        LinkedHashSet<Integer> linkedSetList = new LinkedHashSet<>();
//
//        // вводит числа до тех пор пока юзер не введет цифру 0,
//        // иначе в переменную list будет добавляться вводимые числа с помощью метода add
//        while(true){
//            int number = scan.nextInt();
//            if(number == 0) break;
//            list.add(number);
//        }
//
//        for (int i = 0; i < list.size(); i++) {
//            for (int j = 0; j < list.size(); j++) {
//                if (list.get(j).equals(list.get(i)) && i!=j) {
//                    linkedSetList.add(list.get(i));
//                }
//            }
//        }
//
//        for (Integer elem: linkedSetList) {
//            System.out.print(elem + " ");
//        }

//        Scanner scan = new Scanner(System.in);
//
//        ArrayList<Integer> list = new ArrayList<>();
//        ArrayList<Integer> negativenumbers = new ArrayList<>();
//
//        while (true){
//            int number = scan.nextInt();
//            if (number == 0) break;
//            list.add(number);
//        }
//
//        for (int i = 0; i < list.size(); i++) {
//            if (list.get(i) < 0) {
//                negativenumbers.add(list.get(i));
//            }
//        }
//
//        for (Integer numbers: negativenumbers) {
//            System.out.print(numbers + " ");
//        }
//
//        int max = -9;
//        for (int i = 0; i < negativenumbers.size(); i++) {
//            if (negativenumbers.get(i) > max) {
//                max = negativenumbers.get(i);
//            }
//        }
//        System.out.println();
//        System.out.print(max);

//надо решить
//        Scanner scan = new Scanner(System.in);
//
//        ArrayList<Integer> list = new ArrayList<>();
//
//        while (true){
//            int number = scan.nextInt();
//            if (number == 0) break;
//            list.add(number);
//        }
//
//        for (int i = 0; i < list.size(); i++) {
//            if (list.get(i) > 1 && list.get(i)%i == 0){
//                System.out.print(list.get(i) + " ");
//            }
//        }


//        Scanner scan = new Scanner(System.in);
//        int number1 = scan.nextInt();
//        ArrayList<Integer> list1 = new ArrayList<>();
//        for (int i = 0; i < number1; i++) {
//            list1.add(scan.nextInt());
//        }
//
//        Collections.sort(list1);
//
//        int number2 = scan.nextInt();
//        ArrayList<Integer> list2 = new ArrayList<>();
//        for (int i = 0; i < number2; i++) {
//            list2.add(scan.nextInt());
//        }
//
//        Collections.sort(list2);
//
//        ArrayList<Integer> list3 = new ArrayList<>();
//        for (int i = 0; i < list1.size(); i++) {
//            list3.add(list1.get(i));
//        }
//        for (int i = 0; i < list2.size(); i++) {
//            list3.add(list2.get(i));
//        }
//
//
//        Collections.sort(list3);
//
//        System.out.print("Sorted first array: " + '\n');
//        for (Integer element1 : list1) {
//            System.out.print(element1 + " ");
//        }
//        System.out.println();
//
//        System.out.print("Sorted second array: " + '\n');
//        for (Integer element2 : list2) {
//            System.out.print(element2 + " ");
//        }
//        System.out.println();
//
//        System.out.print("Sorted third array: " + '\n');
//        for (Integer element3 : list3) {
//            System.out.print(element3 + " ");
//        }

        //ЕСЛИ НУЖНО ВЫВЕСТИ В ВИДЕ МАССИВА
//        System.out.println("Sorted first array: " + '\n' + list1);
//        System.out.println("Sorted second array: " + '\n' + list2);
//        System.out.println("Sorted third array: " + '\n' + list3);


//        Scanner scan = new Scanner(System.in);
//
//        ArrayList<String> anyWordsList = new ArrayList<>();
//        for (int i = 0; i < 10; i++) {
//            anyWordsList.add(scan.nextLine());
//        }
//
//        HashSet<String> filterWords = new HashSet<>();
//        for (int i = 0; i < anyWordsList.size(); i++) {
//            filterWords.add(anyWordsList.get(i));
//        }
//
//        System.out.println(filterWords.size());

//---------------------------------------------------------------------------------------------------------------------
        // 1 вариант решения
//        Scanner scan = new Scanner(System.in);

//        ArrayList<Integer> numbers = new ArrayList<>();
//        for (int i = 0; i < 5; i++) {
//            numbers.add(scan.nextInt());
//        }

//        HashSet<Integer> filterNumbers = new HashSet<>();
//        for (int i = 0; i < numbers.size(); i++) {
//            filterNumbers.add(numbers.get(i));
//        }

//        int sum = 0;
//        for (Integer num : filterNumbers) {
//            sum += num;
//        }
//        System.out.println(sum);

        // 2 вариант решения
//        Scanner scan = new Scanner(System.in);
//
//        HashSet<Integer> filterNumbers = new HashSet<>();
//        for (int i = 0; i < 5; i++) {
//            int numbers = scan.nextInt();
//            filterNumbers.add(numbers);
//        }
//
//        int sum = 0;
//        for (Integer num : filterNumbers) {
//            sum += num;
//        }
//        System.out.println(sum);
//-----------------------------------------------------------------------------------------------------------------

//        Scanner scan = new Scanner(System.in);
//
//        HashSet<Integer> filterNumbers = new HashSet<>();
//
//        while (true){
//            int number = scan.nextInt();
//            if (number == 0) break;
//            filterNumbers.add(number);
//        }
//
//        int sum = 0;
//        for (Integer num : filterNumbers) {
//            sum += num;
//        }
//        System.out.println(sum);


//        Scanner scan = new Scanner(System.in);
//
//        HashSet<Integer> filterNumbers = new HashSet<>();
//
//        while (true){
//            int number = scan.nextInt();
//            if (number == 0) break;
//            filterNumbers.add(number);
//        }
//
//        boolean message = false;
//        for (Integer num : filterNumbers) {
//            if (num == 77){
//                message = true;
//            }
//        }
//
//        if (message == true){
//            System.out.println("YES");
//        } else {
//            System.out.println("NO");
//        }


//        Scanner scan = new Scanner(System.in);
//
//        HashSet<String> anyWordsList = new HashSet<>();
//        while (true) {
//            String attention = scan.nextLine();
//            if (attention.equals("stop")) break;
//            anyWordsList.add(attention);
//        }
//
//        int totalLength = 0;
//        for (String elem : anyWordsList) {
//            totalLength += elem.length();
//        }
//
//        System.out.println(totalLength);


//          НАДО РЕШИТЬ
//        Scanner scan = new Scanner(System.in);
//
//        HashSet<String> anyWordsList = new HashSet<>();
//        while (true) {
//            String attention = scan.nextLine().toLowerCase();
//            if (attention.equals("stop")) break;
//            anyWordsList.add(attention);
//        }
//
//        String gl = "a, e, i, o, u";
//        int totalLength = 0;
//        for (int i = 0; i < anyWordsList.size(); i++) {
//            if (gl.contains(String.valueOf(anyWordsList).toLowerCase()));
//            totalLength++;
//        }
//
//        System.out.println(totalLength);



//        Scanner scan = new Scanner(System.in);
//
//        TreeSet<Integer> numbers = new TreeSet<>();
//        while (true) {
//            int num = scan.nextInt();
//            if (num == 0) break;
//            numbers.add(num);
//        }
//
//        System.out.print(numbers + "");


//        Scanner scan = new Scanner(System.in);
//        HashSet<String> set1 = new HashSet<>();
//        while (true) {
//            String word1 = scan.nextLine();
//            if (word1.equals("exit")) break;
//            set1.add(word1);
//        }
//
//        while (true) {
//            String word2 = scan.nextLine();
//            if (word2.equals("exit")) break;
//            set1.add(word2);
//        }
//
//        System.out.println(set1 + " ");


//        Scanner scan = new Scanner(System.in);
//
//        ArrayList<Integer> numbers = new ArrayList<>();
//        while (true) {
//            int num1 = scan.nextInt();
//            if (num1 == 0) break;
//            numbers.add(num1);
//        }
//
//        boolean boo = false;
//        int num2 = scan.nextInt();
//        for (Integer elem: numbers) {
//            if (elem == num2){
//                boo = true;
//            }
//        }
//
//        if (boo){
//            System.out.println("Number " + num2 + " included in the set.");
//        } else {
//            System.out.println("Number " + num2 + " not included in the set.");
//        }
    }
}
