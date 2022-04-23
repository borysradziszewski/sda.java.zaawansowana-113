package Company;

public class Employee {
    private String name;
     int salary;

    public Employee(String name, int salary) {
        this.name = name;
        this.salary = salary;
        System.out.println("Wywołuję konstruktor klasy Employee z argumentami" +  name + " i " + salary);
    }

    public int getSalary() {
        return salary;
    }

    public void show(){
        System.out.println("Imię to: " + name + " " + "Pensja wynosi: " + salary);
    }
}
