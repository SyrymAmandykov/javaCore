import com.sun.source.tree.BreakTree;

import java.util.Arrays;
import java.util.Enumeration;
import java.util.Scanner;

public class Method {

    public static void main(String[] args) {
//        int a = 3,b = 2,c = 6;
//        int res = getMax( a,b,c);
//        System.out.println(res);
//
//    }
//        public static int getMax(int a, int b, int c) {
//            int max = 0;
//            if (a > b && a > c) {
//                max = a;
//            } else if (b > a && b > c) {
//                max = b;
//            } else {
//                max = c;
//            }
//            return max;
//
//        }

//        Scanner scan = new Scanner(System.in);
//        String word = scan.nextLine().toLowerCase();
//        char letter = scan.nextLine().toLowerCase().charAt(0);
//
//        System.out.println(check(word,letter));
//    }
//
//       public static int check(String word, char letter){
//        word = word.toLowerCase();
//           int count = 0;
//           for (int i = 0; i < word.length(); i++) {
//               if (letter == (word.charAt(i))){
//                   count ++;
//               }
//           }
//        return count;
//        }

//        Scanner scan = new Scanner(System.in);
//        String word = scan.nextLine();
//        palindrome(word);
//
//    }
//
//    public static String palindrome(String word) {
//        String word2 = "";
//        word = word.toLowerCase();
//        for (int i = word.length() - 1; i >= 0; i--) {
//            word2 += word.charAt(i);
//        }
//        if (word2.equals(word)) {
//            return "YES";
//        } else {
//            return"No";
//        }
//    }

//        Scanner scan = new Scanner(System.in);
//        String word1 = scan.nextLine();
//        String word2 = scan.nextLine();
//        contains(word1,word2);
//
//    }
//
//    public static void contains(String word1,String word2){
//        if (word1.contains(word2)){
//            System.out.println("YES");
//        } else {
//            System.out.println("NO");
//        }
//    }

//        Scanner scan = new Scanner(System.in);
//        String login = scan.nextLine();
//        String pass = scan.nextLine();
//        check(login,pass);
//    }
//
//    public static String check(String login,String pass){
//        if (login.equals("admin") && pass.equals("qwerty")){
//            return "Authentication completed";
//        } else {
//            return "Invalid login or password";
//        }
//
//    }

//        Scanner scan = new Scanner(System.in);
//        int number = scan.nextInt();
//        int array[] = new int[number];
//
//        for (int i = 0; i < array.length; i++) {
//            array[i] = scan.nextInt();
//        }
//        check(array);
//        System.out.println(array);
//    }
//
//    public static int check(int array[]) {
//        int sum = 0;
//        int count = 0;
//        for (int i = 0; i < array.length; i++) {
//            if (array[i] % 2 == 0) {
//                sum += array[i];
//                count++;
//            }
//        }
//        return sum/count;
//    }


//        Scanner scan = new Scanner(System.in);
//        int number = scan.nextInt();
//        int array[][] = new int[number][number];
//
//        for (int i = 0; i < number; i++) {
//            for (int j = 0; j < number; j++) {
//                array[i][j] = scan.nextInt();
//            }
//        }
//
//        check(array);
//    }
//
//    public static void check(int array[][]){
//        int array2[];
//        array2 = array[0];
//        array[0] = array[array.length-1];
//        array[array.length-1] = array2;
//
//        for (int i = 0; i < array.length; i++) {
//            for (int j = 0; j < array[i].length; j++) {
//                System.out.print(array[i][j] + " ");
//            } System.out.println();
//        }
//    }


//        Scanner scan = new Scanner(System.in);
//        int number = scan.nextInt();
//        int array[] = new int[number];
//
//        for (int i = 0; i < number; i++) {
//            array[i] = scan.nextInt();
//        }
//
//        check(array);
//        System.out.println(check(array[]);
//    }
//
//        public static void check(int array[]){
//            int res = 0;
//            for (int i = 0; i < array.length; i++) {
//                if(array[i] == 23){
//                    break;
//                }
//                if(array[i]%2 ==1){
//                    res = array[i];
//                    System.out.println(res);
//                }
//            }
//        }
//
//        Scanner scan = new Scanner(System.in);
//        int number = scan.nextInt();
//        int[] array = new int[number];
//
//        for (int i = 0; i < number ; i++) {
//            array[i] = scan.nextInt();
//        }
//
//        check(array);
//    }
//
//    public static int check(int[] array) {
//        int sum = 0;
//        for (int i = 0; i < array.length; i++) {
//            if (array[i]%5 != 0) {
//                sum += array[i];
//            }
//        }
//        return sum;
//    }


//        Scanner scan = new Scanner(System.in);
//        int number = scan.nextInt();
//
//        System.out.println(check(number));
//    }
//
//    public static String check(int num){
//        for (int i = 0; i < num; i++) {
//            if (num%2==0){
//                return "YES";
//            } else {
//               return "NO";
//            }
//        } return "null";
//    }

//        Scanner scan = new Scanner(System.in);
//        String word = scan.nextLine();
//
//        check(word);
//
//    }
//
//    public static void check(String str){
//        String word2 = "";
//        for (int i = 0; i < str.length(); i++) {
//            word2 = word2 + str.charAt(i) + str.charAt(i);
//        } System.out.print(word2);
//    }

//        Scanner scan = new Scanner(System.in);
//        String word = scan.nextLine();
//
//        System.out.println(check(word));
//    }
//
//    public static int check(String anyWord){
//        int count = 0;
//        String vowelLetters = "a, e, i, o, u";
//        for (int i = 0; i < anyWord.length(); i++) {
//            if (vowelLetters.contains(String.valueOf(anyWord.charAt(i)))){
//                count++;
//            }
//        } return count;
//    }

//        Scanner scan = new Scanner(System.in);
//        int number = scan.nextInt();
//
//        int[] number1 = new int[number];
//
//        for (int i = 0; i < number1.length; i++) {
//            number1[i] = scan.nextInt();
//        }
//
//        System.out.println(check(number1));
//
//    }
//
//    public static int check(int[] num){
//        int count = 0;
//        for (int i = 0; i < num.length; i++) {
//            if (num[i] != 0){
//                count++;
//            }
//        } return count;
//    }


//        Scanner scan = new Scanner(System.in);
//        int number = scan.nextInt();
//
//        int[] number1 = new int[number];
//
//        for (int i = 0; i < number1.length; i++) {
//            number1[i] = scan.nextInt();
//        }
//        System.out.println(check(number1));
//    }
//
//    public static int check(int[] num) {
//        int res = 0;
//        for (int i = 0; i < num.length; i++) {
//            for (int j = 0; j < num.length + 1; j++) {
//                if (num[i] != num[j]) {
//                    res += num[i];
//                } return res;
//            }
//        } return 0;
//    }

//        Scanner scan = new Scanner(System.in);
//        int number = scan.nextInt();
//
//        int[] number1 = new int[number];
//
//        for (int i = 0; i < number1.length; i++) {
//            number1[i] = scan.nextInt();
//        }
//        check(number1);
//    }
//
//    public static void check(int[] array){
//        int max = array[0];
//        int min = array[0];
//        for (int i = 0; i < array.length; i++) {
//                if (array[i] > max){
//                    max = array[i];
//                }
//                if (array[i] < min){
//                    min = array[i];
//                }
//        }
//        System.out.println(min);
//        System.out.println(max);
//    }

//        Scanner scan = new Scanner(System.in);
//        int number1 = scan.nextInt();
//        int number2 = scan.nextInt();
//        char symbol1 = '+';
//        char symbol2 = '-';
//        char symbol3 = '*';
//        char symbol4 = '/';
//
//        System.out.println(check(number1,number2,symbol3));
//    }
//
//    public static int check(int a, int b, char c) {
//        if (c == '+') {
//            return a + b;
//        } else if (c == '-') {
//            return a - b;
//        } else if (c == '*') {
//            return a * b;
//        } else if (c == '/') {
//            return a / b;
//        } return 0;
//    }

        // частично правильный
//        Scanner scan = new Scanner(System.in);
//        int number1 = scan.nextInt();
//        int number2 = scan.nextInt();
//
//        int array[][] = new int[number1][number2];
//
//        for (int i = 0; i < number1; i++) {
//            for (int j = 0; j < number2; j++) {
//                array[i][j] = scan.nextInt();
//            }
//        }
//
//        check(array);
//    }
//        public static void check(int[][] array) {
//            int max = array[0][0];
//            for (int i = 0; i < array.length; i++) {
//                for (int j = 0; j < array.length; j++) {
//                    if (array[i][j] > max) {
//                        max = array[i][j];
//                    }
//                }
//                System.out.println(max);
//                max = 0;
//            }
//        }

//        Scanner scan = new Scanner(System.in);
//        int number = scan.nextInt();
//
//        int[] array = new int[number];
//
//        for (int i = 0; i < array.length; i++) {
//            array[i] = scan.nextInt();
//        }
//
//        check(array);
//    }
//
//    public static void check(int[] array){
//        for (int i = 0; i < array.length; i++) {
//            if (array[i] < 50 && array[i]%5==0){
//                System.out.println(array[i] + " ");
//            }
//        }
//    }

//        Scanner scan = new Scanner(System.in);
//        int number = scan.nextInt();
//
//        System.out.println(check(number));
//    }
//
//    public static String check(int seasonType) {
//        String[] season = {"Winter","Spring","Summer","Autumn"};
//        for (int i = 1; i <= season.length; i++) {
//            if (seasonType <= 2 || seasonType == 12) {
//                return season[0];
//            }
//            if (seasonType <= 5 && seasonType > 2) {
//                return season[1];
//            }
//            if (seasonType <= 8 && seasonType > 5) {
//                return season[2];
//            }
//            if (seasonType <= 11 && seasonType > 8) {
//                return season[3];
//            }
//        } return null;
//    }
//}


        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        int[] array = new int[number];

        for (int i = 0; i < array.length; i++) {
            array[i] = scan.nextInt();
        }

        check(array);

    }

    // i
    //   j
    // 1 2 3 4 5
    //
    public static void check(int[] array) {

        int res = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] != array[j] && i!=j){
                    res = array[i];
                }
            }  System.out.print(res + " ");
        }
    }
}

