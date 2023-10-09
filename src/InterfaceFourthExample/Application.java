package InterfaceFourthExample;

public class Application implements EmployeeInterface {
    Employee[] employees = new Employee[1000];
    int count = 0;

    public Application() {
    }

    public Application(Employee[] employees, int count) {
        this.employees = employees;
        this.count = count;
    }

    public Employee[] getEmployees() {
        return employees;
    }

    public void setEmployees(Employee[] employees) {
        this.employees = employees;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public Employee search(String name){
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getFullName().equalsIgnoreCase(name)){
                return employees[i];
            }
        } return null;
    }

    public Employee oldestEmployee(){
        Employee num = new Employee();
        for (int i = 0; i < employees.length; i++){
            if (employees[i].getAge() > num.getAge()){
                num = employees[i];
            }
        } return num;
    }

    public Employee smallestEmployee(){
        Employee num = new Employee();
        for (int i = 0; i < employees.length; i++){
            if (employees[i].getAge() < num.getAge()){
                num = employees[i];
            }
        } return num;
    }

    public void addEmployee(Employee e){
        if (count != 1000) {
            employees[count] = e;
            count++;
        } else {
            System.out.println("Array is full");
        }
    }

    public void deleteEmployee(int id){
        employees[id] = null;
    }

    public void printEmployee(){
        for (int i = 0; i < count; i++) {
            if (employees[i] != null){
                System.out.println(employees[i].toString());
            }
        }
    }
}
