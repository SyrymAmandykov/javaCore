package TryCatch;

public class Test {
    public static void main(String[] args) {

        Company name1 = new Company("FACEBOOK",new Worker("Mark","Zuckerberg"));
        Company name2 = new Company("APPLE",null);
        Company name3 = new Company("MICROSOFT",new Worker("Bill","Gates"));

        System.out.println(name1.getData());
        System.out.println(name2.getData());
        System.out.println(name3.getData());
    }
}
