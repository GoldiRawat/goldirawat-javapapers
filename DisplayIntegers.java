import java.util.ArrayList;

public class DisplayIntegers {
    public static void main(String[] args) {
        // Create a collection of integers (ArrayList in this example)
        ArrayList<Integer> integerList = new ArrayList<>();

        // Add some integers to the collection
        integerList.add(10);
        integerList.add(20);
        integerList.add(30);
        integerList.add(40);
        integerList.add(50);

        // Display the integers using for-each loop
        System.out.println("Integers in the collection:");
        for (int number : integerList) {
            System.out.println(number);
        }
    }
}
