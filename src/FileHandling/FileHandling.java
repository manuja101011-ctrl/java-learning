package FileHandling;


import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.HashMap;
import java.util.Collections;

public class FileHandling {

    void createFile() throws IOException {
        File f = new File("student.txt");

        if (f.createNewFile()) {
            System.out.println("File Created");
        } else {
            System.out.println("File Already Exists");
        }
    }

    void writeFile() throws IOException {
        FileWriter fw = new FileWriter("student.txt", true);
        fw.write("Manuja\n");
        fw.close();
        System.out.println("Data Added Successfully");
    }

    void removeDuplicates() {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(10);
        list.add(30);
        list.add(20);

        HashSet<Integer> set = new HashSet<>(list);
        System.out.println("Unique Numbers: " + set);
    }

    void studentDetails() {
        HashMap<Integer, String> map = new HashMap<>();
        map.put(1, "Arun");
        map.put(2, "Bala");
        map.put(3, "Kumar");

        System.out.println("Student Details: " + map);
    }

    void sortNumbers() {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(40);
        list.add(10);
        list.add(30);
        list.add(20);

        Collections.sort(list);
        System.out.println("Sorted Numbers: " + list);
    }

    public static void main(String[] args) throws IOException {
        FileHandling obj = new FileHandling();

        obj.createFile();
        obj.writeFile();
        obj.removeDuplicates();
        obj.studentDetails();
        obj.sortNumbers();
    }
}
