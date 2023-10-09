package ArrayListTwo;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class test {
    public static void main(String[] args) {

        // все равно нет понимания как пистаь тесты

        Set<String> courses1 = new HashSet<>();
        courses1.add("matematika");

        Student student1 = new Student("Syrym",courses1);

        student1.addCourse("matem");
    }

}
