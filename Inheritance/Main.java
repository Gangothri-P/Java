
class Person {
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

class Employee extends Person {
    int id;
    double salary;

    Employee(String name, int age, int id, double salary) {
        super(name, age);
        this.id = id;
        this.salary = salary;
    }

    void display() {
        super.display();
        System.out.println("Employee ID: " + id);
        System.out.println("Basic Salary: " + salary);
    }
}

class Manager extends Employee {
    String department;
    double bonus;

    Manager(String name, int age, int id, double salary,
            String department, double bonus) {
        super(name, age, id, salary);
        this.department = department;
        this.bonus = bonus;
    }

    double totalSalary() {
        return salary + bonus;
    }

    void display() {
        super.display();
        System.out.println("Department: " + department);
        System.out.println("Total Salary: " + totalSalary());
    }
}

public class Main {
    public static void main(String[] args) {
        Manager m = new Manager("Anu", 35, 101, 50000,
                                "IT", 10000);
        m.display();
    }
}
