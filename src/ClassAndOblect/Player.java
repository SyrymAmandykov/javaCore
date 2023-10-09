package ClassAndOblect;

public class Player {
    int number;
    String name;
    String surname;
    String position;

    public Player() {
        this.number = 0;
        this.name = "no name";
        this.surname = "no name";
        this.position = "no name";
    }

    public Player(int number, String name, String surname, String position) {
        this.number = number;
        this.name = name;
        this.surname = surname;
        this.position = position;
    }

    public String toString() {
        return "Player{number=" + this.number + "," + " name=" + "'" + this.name + "'" + "," + " surname=" + "'" + this.surname + "'" + "," + " position=" + "'" + this.position + "'" + "}";
    }
}
