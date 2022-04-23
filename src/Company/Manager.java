package Company;

public class Manager extends Employee {
    private int bonus;

    public Manager(String name, int salary) {
        super(name, salary);
        System.out.println("Wywołuje konstruktor z klasy Manager ");
    }

    public Manager(String name, int salary, int bonus) {
        super(name, salary);
        this.bonus = bonus;
        System.out.println("Wywołuje konstruktor z klasy Manager z bonusem ");
    }

    public void makeSpeech() {
        System.out.println("No pain no gain");
    }

    @Override
    public int getSalary() {
        // return super.getSalary() + bonus;
        return salary + bonus;

    }

    public void makeSpeech(String additionalMessage) {
        System.out.println("No pain no gain" + additionalMessage);

    }


}
