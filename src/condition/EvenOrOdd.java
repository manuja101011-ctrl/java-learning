package condition;

public class EvenOrOdd {

    int number = 4;

    public void evenodd() {

        String result = (number % 2 == 0) ? "even" : "odd";

        System.out.println(result);
    }
}