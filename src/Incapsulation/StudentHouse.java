package Incapsulation;

public class StudentHouse{

    private String name;
    private Student[] students= new Student[1000];
    private int size = 0;

//--------------------- конструкторы ---------------------------------------------------------
    public StudentHouse(){
    }

    public StudentHouse(String name){
        this.name = name;
    }

//--------------------- гетторы и сетторы ------------------------------------------------------

    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
//------------------------Начинаются методы--------------------------------------------

    void addStudent(Student student){
        students[size] = student;
        size++;
    }

    void deleteStudent(int i){
        students[i] = null;
    }

    void printStudents(){
        for (int i = 0; i < size; i++) {
            if (students[i] == null) continue;
            System.out.println(students[i]);
        }
    }

    public Student theBestStudent() {
        Student max = students[0];
        for (int i = 0; i < size; i++) {
            if (students[i].getGpa() > max.getGpa()){
                max = students[i];
            }
        } return max;
    }
}