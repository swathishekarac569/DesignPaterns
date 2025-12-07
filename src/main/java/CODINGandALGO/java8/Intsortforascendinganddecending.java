package CODINGandALGO.java8;

public class Intsortforascendinganddecending {

    public static void main(String[] args) {
        int[] numbers = {5, 2, 8, 1, 3};

        // Sort in ascending order
        int[] ascending = java.util.Arrays.stream(numbers)
                .sorted()
                .toArray();
        System.out.println("Ascending order: " + java.util.Arrays.toString(ascending));

        // Sort in descending order
        int[] descending = java.util.Arrays.stream(numbers)
                .boxed()
                .sorted(java.util.Collections.reverseOrder())
                .mapToInt(Integer::intValue)
                .toArray();
        System.out.println("Descending order: " + java.util.Arrays.toString(descending));
    }
}
