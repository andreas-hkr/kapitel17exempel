public class Employee extends Person {
    private double salary;

    public Employee(String firstName, String lastName, double salary) {
        super(firstName, lastName);
        setSalary(salary);
    }

    public void setSalary(double salary) {
        if (salary >= 0) {
            this.salary = salary;
        } else {
            throw new IllegalArgumentException("Negative salary not allowed");
        }
    }

    public double getSalary() { return salary; }

    @Override
    public void print() {
        System.out.println("Hello, my name is " + getFirstName() + ". I am an employee.");
    }
}
