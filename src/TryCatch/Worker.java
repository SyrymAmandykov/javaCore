package TryCatch;

public class Worker {
    String name;
    String surname;

    public Worker() {
    }

    public Worker(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public String toString(){
        return "{"
                + ", director.name=" + name
                + ", director.surname=" + surname
                + '}';
    }
}
