public class Main {
    public static void main(String[] args) {
        Person[] persons = {
                new Employee("Anna", "Karlsson",38500),
                new Friend("Max", "Boström", "044-123456")
        };

        for (var person : persons) {
            person.print();
        }
    }
}