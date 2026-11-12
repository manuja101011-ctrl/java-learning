
package collection_arraylist_hashset;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Objects;

class Student {
    int rollNo;
    String name;
    String department;
    int mark;

    Student(int rollNo, String name, String department, int mark) {
        this.rollNo = rollNo;
        this.name = name;
        this.department = department;
        this.mark = mark;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;

        if (!(obj instanceof Student))
            return false;

        Student s = (Student) obj;

        return this.rollNo == s.rollNo;
    }

    @Override
    public int hashCode() {
        return Objects.hash(rollNo);
    }
}

public class Main {

    void studentManagement() {

        System.out.println("\n1. Student Management");

        ArrayList<Student> list = new ArrayList<>();

        list.add(new Student(1, "Arun", "CSE", 85));
        list.add(new Student(2, "Bala", "ECE", 90));
        list.add(new Student(3, "Kumar", "IT", 75));
        list.add(new Student(4, "Ravi", "EEE", 95));
        list.add(new Student(5, "Mani", "CSE", 80));

        Student highest = list.get(0);

        for (Student s : list) {
            System.out.println(s.rollNo + " " + s.name + " " + s.mark);

            if (s.mark > highest.mark) {
                highest = s;
            }
        }

        System.out.println("Highest Mark: " + highest.name + " " + highest.mark);
    }

    void searchStudent() {

        System.out.println("\n2. Search Student");

        ArrayList<Student> list = new ArrayList<>();

        list.add(new Student(1, "Arun", "CSE", 85));
        list.add(new Student(2, "Bala", "ECE", 90));
        list.add(new Student(3, "Kumar", "IT", 75));
        list.add(new Student(4, "Ravi", "EEE", 95));

        int searchRollNo = 3;
        boolean found = false;

        for (Student s : list) {
            if (s.rollNo == searchRollNo) {
                System.out.println("Student Found");
                System.out.println(s.rollNo + " " + s.name + " " + s.department);
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Student Not Found");
        }
    }

    void duplicateStudents() {

        System.out.println("\n3. Duplicate Students");

        HashSet<Student> set = new HashSet<>();

        set.add(new Student(1, "Arun", "CSE", 85));
        set.add(new Student(2, "Bala", "ECE", 90));
        set.add(new Student(1, "Kumar", "IT", 75));
        set.add(new Student(3, "Ravi", "EEE", 95));

        for (Student s : set) {
            System.out.println(s.rollNo + " " + s.name + " " + s.department);
        }

        System.out.println("Total Students: " + set.size());
    }

    void uniqueDepartments() {

        System.out.println("\n4. HashSet - Unique Departments");

        HashSet<Student> set = new HashSet<>();

        set.add(new Student(1, "Arun", "CSE", 85));
        set.add(new Student(2, "Bala", "ECE", 90));
        set.add(new Student(3, "Kumar", "CSE", 75));
        set.add(new Student(4, "Ravi", "IT", 95));
        set.add(new Student(1, "Mani", "EEE", 80));

        for (Student s : set) {
            System.out.println(s.rollNo + " " + s.name + " " + s.department);
        }

        System.out.println("Total Students: " + set.size());
    }

    void arrayListToHashSet() {

        System.out.println("\n5. ArrayList + HashSet");

        ArrayList<Student> list = new ArrayList<>();

        list.add(new Student(1, "Arun", "CSE", 85));
        list.add(new Student(2, "Bala", "ECE", 90));
        list.add(new Student(3, "Kumar", "IT", 75));
        list.add(new Student(1, "Ravi", "EEE", 95));
        list.add(new Student(4, "Mani", "CSE", 80));
        list.add(new Student(2, "Raj", "ECE", 88));

        System.out.println("ArrayList:");

        for (Student s : list) {
            System.out.println(s.rollNo + " " + s.name + " " + s.mark);
        }

        HashSet<Student> set = new HashSet<>(list);

        System.out.println("HashSet:");

        for (Student s : set) {
            System.out.println(s.rollNo + " " + s.name + " " + s.mark);
        }

        System.out.println("Unique Students: " + set.size());
    }

    public static void main(String[] args) {

        Main obj = new Main();

        obj.studentManagement();
        obj.searchStudent();
        obj.duplicateStudents();
        obj.uniqueDepartments();
        obj.arrayListToHashSet();
    }
}
