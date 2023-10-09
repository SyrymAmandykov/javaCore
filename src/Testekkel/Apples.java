package Testekkel;

public class Apples {

    private static long counter;
    private final long id = counter++;

    public long id() {
        return id;
    }

}
