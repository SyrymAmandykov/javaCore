package Incapsulation;

//public class Student {

//    public class Phone{
//        private String name;
//        private String model;
//        private int price;
//
//        public Phone(){
//            this.name = "no name";
//            this.model = "no model";
//            this.price = 0;
//        }
//
//        public Phone(String name,String model,int price ){
//            this.name = name;
//            this.model = model;
//            this.price = price;
//        }
//
//        public void setName(String name){
//            this.name = name;
//        }
//
//        public String getName(){
//            return name;
//        }
//
//        public void setModel(String model){
//            this.model = model;
//        }
//
//        public String getModel(){
//            return model;
//        }
//
//        public void setPrice(int price){
//            this.price = price;
//        }
//
//        public int getPrice(){
//            return price;
//        }
//
//        public String getCategory(){
//            if (price > 1000){
//                return("TOP");
//            }
//            if (price >= 500 && price <= 1000){
//                return ("MEDIUM");
//            } else {
//                return ("SIMPLE");
//            }
//        }
//    }

    public class Student{
        private int id;
        private String name;
        private String surname;
        private double gpa;

        public Student(){
            this.id = 0;
            this.name = "no name";
            this.surname = "no surName";
            this.gpa = 0.0;
        }

        public Student(int id,String name,String surname,double gpa){
            this.id = id;
            this.name = name;
            this.surname = surname;
            this.gpa = gpa;
        }

        public void setId(int id){
            this.id = id;
        }
        public int getId(){
            return id;
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

        public void setGpa(double gpa){
            this.gpa = gpa;
        }
        public double getGpa(){
            return gpa;
        }

        public String toString(){
            return "Student{id=" + this.id + ", " + "name='" + this.name + "', " + "surname='" + this.surname + "', " + "gpa=" + this.gpa + "}";
        }
}
