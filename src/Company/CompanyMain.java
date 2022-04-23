package Company;

public class CompanyMain {
    public static void main(String[] args) {
        Employee employeeOne = new Employee("Jan", 200);
        Manager employeeTwo = new Manager("Bogdan", 250, 50);
        Secretary employeeThree = new Secretary("Angela", 230);
        employeeThree.makeCall("+48 530952555");

    }
}
