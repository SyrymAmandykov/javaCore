package StreamApiExTwo;

import java.util.ArrayList;
import java.util.List;

public class test {
    public static void main(String[] args) {

        List<Person> persons = new ArrayList<>();
        persons.add(new Person("Syrym",29,"Almaty"));
        persons.add(new Person("Makpal",29,"Almaty"));
        persons.add(new Person("Symbat",18,"Astana"));
        persons.add(new Person("Ilyas",15,"Almaty"));


        PersonFilter filter = new PersonFilter();
        List<Person> personList = filter.filterPersons(persons);
        personList.forEach(p -> System.out.println(p.getName() + ", " + p.getAge() + ", " + p.getCity()));
    }
}
