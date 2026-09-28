package oopsAccept;

public class Employee {

    String name;
    int id;
    double salary;

    Employee(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    void displayDetails() {
        System.out.println("name: " + name);
        System.out.println("id: " + id);
        System.out.println("salary: " + salary);
    }
}

class Developer extends Employee {

    String programmingLanguage;

    Developer(String name, int id, double salary, String programmingLanguage) {
        super(name, id, salary);
        this.programmingLanguage = programmingLanguage;
    }

    void displayDeveloper() {
        displayDetails();
        System.out.println("Programming Language: " + programmingLanguage);
    }
}