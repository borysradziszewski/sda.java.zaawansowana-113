package Company;

public final class Secretary extends Employee {

    public Secretary(String name, int salary) {
        super(name, salary);
        System.out.printf("Wywołuje konstruktor z klasy Secretary z argumentami: %s i %s i %s", name,salary);

    }
    public void makeCall(String number){
        System.out.printf("Dzwonię do: " + number);
    }
}
