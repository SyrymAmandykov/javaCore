package Incapsulation;

public class test {

    public static void main(String[] args) {

        //AUES
        Student student1 = new Student(1,"arman","dumanov",3.0);
        Student student2 = new Student(2,"amir","abdullaev",2.5);
        //KBTU
        Student student3 = new Student(3,"sasha","ivanov",1.8);
        Student student4 = new Student(4,"alya","ormanova",4.0);
        //KIMEP
        Student student5 = new Student(5,"samat","baranov",3.8);

        StudentHouse studentHouse1 = new StudentHouse("AUES");
        StudentHouse studentHouse2 = new StudentHouse("KBTU");
        StudentHouse studentHouse3 = new StudentHouse("KIMEP");

        System.out.println("University -> " + studentHouse1.getName());
        studentHouse1.addStudent(student1);
        studentHouse1.addStudent(student2);
        //studentHouse1.deleteStudent(0); //УДЯЛЕТ СТУДЕНТА ПРИРВЫНИВАЯ ЗНАЧЕНИЕ В NULL
        studentHouse1.printStudents();
        //System.out.println("Best student -> " + '\n' + studentHouse1.theBestStudent());

        System.out.println("University -> " + studentHouse2.getName());
        studentHouse2.addStudent(student3);
        studentHouse2.addStudent(student4);
        studentHouse2.printStudents();

        System.out.println("University -> " + studentHouse3.getName());
        studentHouse3.addStudent(student5);
        studentHouse3.printStudents();

    }

}
