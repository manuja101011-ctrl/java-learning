package stringprogram;


import java.util.Optional;

class Outer {

    class Inner {
        void display() {
            System.out.println("Student Name: Manuja");
            System.out.println("Student Department: CSE");
        }
    }
}

public class StringProgram {

    public static void main(String[] args) {

        String str = "Java";
        System.out.println("Original String: " + str);

        String updated = str + " Programming";
        System.out.println("Updated String: " + updated);

        StringBuilder sb = new StringBuilder();

        sb.append("Arun ");
        sb.append("Bala ");
        sb.append("Kumar");

        System.out.println("\nStringBuilder: " + sb);

        StringBuffer sf = new StringBuffer();

        sf.append("Money Deposited ");
        sf.append("Transaction Successful");

        System.out.println("\nStringBuffer: " + sf);

        Outer obj = new Outer();
        Outer.Inner inner = obj.new Inner();

        System.out.println("\nInner Class:");
        inner.display();

        String name = null;

        Optional<String> studentName = Optional.ofNullable(name);

        System.out.println("\nOptional Class: " +
            studentName.orElse("Student name not available"));
    }
}
