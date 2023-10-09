package InterfaceFourthExample;

public interface EmployeeInterface {

    Employee search(String name);       //возвращает сотрудника по запросу
    Employee oldestEmployee();          // возвращает самого старшего сотрудника
    Employee smallestEmployee();        // возвращает самого младшего сотрудника
    void addEmployee(Employee e);       // добавляет сотрудника в массив
    void deleteEmployee(int id);        //приравнивает к null данные сотрудника
    void printEmployee();               // выводит только тех сотрудников у кого данные не null
}
