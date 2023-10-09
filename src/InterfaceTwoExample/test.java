package InterfaceTwoExample;

public class test {
    public static void main(String[] args) {
        Staff staff = new Staff(3,"Marina","Ivanova",250000);
        Programmers programmers = new Programmers(2,"TANJIRO",50000,20000,0.9);
        HRManagers hrManagers = new HRManagers(7,"Timur Bagdatov",230000);

        System.out.println(programmers.getSalary());
        System.out.println(staff.getSalary());
        System.out.println(hrManagers.getSalary());

        System.out.println("____________________________________________________________________");

        System.out.println(programmers.getWorkerData());
        System.out.println(staff.getWorkerData());
        System.out.println(hrManagers.getWorkerData());
    }
}
