import java.util.Scanner;

public class Extends {

//    public class Car{
//        String name;
//        String model;
//        int maxSpeed;
//        int year;
//        double volume;
//
//        public Car(){
//            this.name = "no name";
//            this.model = "no name";
//            this.maxSpeed = 0;
//            this.year = 0;
//            this.volume = 0.0;
//        }
//
//        public Car(String name,String model,int maxSpeed,int year,double volume){
//            this.name = name;
//            this.model = model;
//            this.maxSpeed = maxSpeed;
//            this.year = year;
//            this.volume = volume;
//        }
//
//        public String ride(){
//            return "Car " + this.name + " " + this.model + " with max speed " + this.maxSpeed + " km/h from " + this.year + " year with engine volume " + this.volume + " liters is riding.";
//        }
//    }
//
//    public class Toyota extends Car{
//
//        String manufacturer;
//
//        public Toyota(){
//            super();
//            this.manufacturer = "no name";
//        }
//
//        public Toyota(String name,String model,int maxSpeed,int year,double volume,String manufacturer){
//            super(name,model,maxSpeed,year,volume);
//            this.manufacturer = manufacturer;
//        }
//
//        public String ride(){
//            return "Toyota Car " + this.name + " " + this.model + " with max speed " + this.maxSpeed + " km/h from " + this.year + " year with engine volume " + this.volume + " liters manufactured from " + this.manufacturer + " is riding.";
//        }
//    }
//
//    public class Mercedes extends Car{
//
//        String classType;
//
//        public Mercedes(){
//            super();
//            this.classType = "no name";
//        }
//
//        public Mercedes(String name,String model,int maxSpeed,int year,double volume,String classType){
//            super(name,model,maxSpeed,year,volume);
//            this.classType = classType;
//        }
//
//        public String ride(){
//            return "Mercedes Car " + this.name + " " + this.model + " with max speed " + this.maxSpeed + " km/h from " + this.year + " year with engine volume " + this.volume + " liters with " + this.classType + " class is riding.";
//        }
//    }

    public class Sportsman{
        String fullName;
        int age;
        String country;

        public Sportsman(){
            this.fullName = "no name";
            this.age = 0;
            this.country = "no name";
        }

        public Sportsman(String fullName,int age,String country){
            this.fullName = fullName;
            this.age = age;
            this.country = country;
        }

        public String play(){
            return "Sportsman " + this.fullName + " from " + this.country + " " + this.age + " years old is playing";
        }
    }

    public class Gymnast extends Sportsman{
        int height;
        int weight;
        String style;

        public Gymnast(){
            super();
            this.height = 0;
            this.weight = 0;
            this.style = "no name";
        }

        public Gymnast(String fullName,int age,String country,int height,int weight,String style){
            super(fullName, age, country);
            this.height = height;
            this.weight = weight;
            this.style = style;
        }

        public String play(){
            return "Gymnast " + this.fullName + " from " + this.country + " " + this.age + " years old, " + this.weight + " kg, " + this.height + " cm with " + this.style + " style is jumping.";
        }
    }

    public class Footballer extends Sportsman{

        String position;
        String club;

        public Footballer(){
            super();
            this.position = "no name";
            this.club = "no name";
        }

        public Footballer(String fullName,int age,String country,String position,String club){
            super(fullName,age,country);
            this.position = position;
            this.club = club;
        }

        public String play(){
            return "Footballer " + this.fullName + " from " + this.country + ", " + this.age + " years old " + this.position + " is playing for " + this.club;
        }
    }

//    public static void main(String[] args) {
//        Scanner scan = new Scanner(System.in);
//        Sportsman sportsman = new Sportsman("syrym",29,"kazakhstan");
//    }


    public class Swimmer extends Sportsman{
        String style;
        double recordTime;

        public Swimmer(){
            super();
            this.style = "no name";
            this.recordTime = 0.0;
        }

        public Swimmer(String fullName,int age,String country,String style,double recordTime){
            super(fullName,age,country);
            this.style = style;
            this.recordTime = recordTime;
        }

        public String play(){
            return "Swimmer " + this.fullName + " from " + this.country + ", " + this.age + " years old with " + this.style + " style swimmed in " + this.recordTime + " seconds";
        }
    }

    public class User{
        protected int id;
        protected String login;
        protected String password;
        protected String name;
        protected String surname;

        public User(){
            this.id = 0;
            this.login = "no name";
            this.password = "no name";
            this.name = "no name";
            this.surname = "no name";
        }

        public User(int id,String login,String password,String name,String surname) {
            this.id = id;
            this.login = login ;
            this.password = password;
            this.name = name;
            this.surname = surname;
        }

        public void setId(int id){
            this.id = id;
        }
        public int getId(){
            return id;
        }

        public void setLogin(String login){
            this.login = login;
        }
        public String getLogin(){
            return login;
        }

        public void setPassword(String password){
            this.password = password;
        }
        public String getPassword(){
            return password;
        }

        public void setName(String name){
            this.name = name;
        }
        public String getName(){
            return name;
        }

        public void setSurname(String surname){
            this.surname = surname;
        }
        public String getSurname(){
            return surname;
        }

        public void getData(){
            System.out.println("ID: " + this.id + " FULL NAME: " + this.name + " " + this.surname + " LOGIN: " + this.login + " PASSWORD: " + this.password);
        }
    }

    public class Staff extends User{
        private double salary;
        private String subjects[] = new String[100];
        private int indexOfSubject = 0;

        public Staff(){
            super();
            this.salary = 0.0;
            this.subjects = new String[0];
            this.indexOfSubject = 0;
        }

        public Staff(int id,String login,String password,String name,String surname,double salary,String[] subjects,int indexOfSubject){
            super(id,login,password,name,surname);
            this.salary = salary;
            this.subjects = subjects;
            this.indexOfSubject = indexOfSubject;
        }

        public void setSalary(double salary){
            this.salary = salary;
        }
        public double getSalary(){
            return salary;
        }

        public void setSubjects(String[] subjects){
            this.subjects = new String[100];
        }
        public String[] getSubjects(){
            return subjects;
        }

        public void setIndexOfSubject(int indexOfSubject){
            this.indexOfSubject = indexOfSubject;
        }
        public int getIndexOfSubject(){
            return indexOfSubject;
        }

        public void getData(){
            System.out.println("ID: " + this.id + " FULL NAME: " + this.name + " " + this.surname + " LOGIN: " + this.login + " PASSWORD: " + this.password + " SALARY: " + this.salary);
        }

        public void addSubject(String subject){
            int index = 0;
            for (int i = 0; i < indexOfSubject; i++) {
                subjects[i] = subject;
                index++;
                System.out.println("SUBJECTS: " + subjects[i]);
            }
        }
    }
}
