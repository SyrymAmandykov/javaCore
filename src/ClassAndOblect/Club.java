package ClassAndOblect;

//public class Club {

//    public class Phone {
//        String name;
//        String model;
//        int price;
//
//        public Phone() {
//            this.name = "no name";
//            this.model = "no name";
//            this.price = 0;
//        }
//
//        public Phone(String name, String model, int price) {
//            this.name = name;
//            this.model = model;
//            this.price = price;
//        }
//
//        public String getData() {
//            return this.name + " - " + this.model + " for " + this.price + " KZT";
//        }
//
//    }
//
//    public class Student {
//        int id;
//        String name;
//        String surname;
//        double gpa;
//
//        public Student() {
//            this.id = 0;
//            this.name = "no name";
//            this.surname = "no name";
//            this.gpa = 0;
//        }
//
//        public Student(int id, String name, String surname, double gpa) {
//            this.id = id;
//            this.name = name;
//            this.surname = surname;
//            this.gpa = gpa;
//        }
//
//        public String getStudentData(){
//            return "ID: " + this.id + " Full Name: " + this.name + "" + this.surname + " GPA: " + this.gpa;
//        }
//    }

    public class Club{
        String name;
        String country;
        int ratingPoints;
        Player []players;

        public Club(){
        }

        public Club(String name,String country,int ratingPoints, Player[] players){
            this.name = name;
            this.country = country;
            this.ratingPoints = ratingPoints;
            this.players = players;
        }

        public void printClubData(){
            System.out.println("Name: " + name + " " + "Country: " + country + " " + "RatingPoints: " + ratingPoints + " " + "Players: " );
            for (int i = 0; i < players.length; i++) {
                System.out.println(players[i]);
            }
        }
}