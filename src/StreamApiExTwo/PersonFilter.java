package StreamApiExTwo;
import StreamApiExOne.Car;

import java.util.*;
import java.util.stream.Collectors;

public class PersonFilter {
    public List<Person> filterPersons(List<Person> persons){
        return (List<Person>) persons.stream()
                .filter(index -> index.getCity().equals("Almaty"))
                .filter(index -> index.getAge() >= 18)
                .collect(Collectors.toList());
    }
}
