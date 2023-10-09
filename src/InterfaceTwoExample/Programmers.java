package InterfaceTwoExample;

public class Programmers implements Workers{
    private int id;
    private String nickname;
    private int salary;
    private int bonusSalary;
    private double KPIValue;

    public Programmers() {
    }

    public Programmers(int id, String nickname, int salary, int bonusSalary, double KPIValue) {
        this.id = id;
        this.nickname = nickname;
        this.salary = salary;
        this.bonusSalary = bonusSalary;
        this.KPIValue = KPIValue;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public int getSalary() {
        return (int) (this.salary + (this.KPIValue * this.bonusSalary));
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getBonusSalary() {
        return bonusSalary;
    }

    public void setBonusSalary(int bonusSalary) {
        this.bonusSalary = bonusSalary;
    }

    public double getKPIValue() {
        for (int i = 0; i <= 1; i++) {
            return KPIValue;
        } return 0;
    }

    public void setKPIValue(double KPIValue) {
        this.KPIValue = KPIValue;
    }

    public String getWorkerData(){
        return "ID: " + id + " NICKNAME: " + nickname + " SALARY: " + salary + " BONUS SALARY: " + bonusSalary + " KPI VALUE: " + KPIValue;
    }
}
