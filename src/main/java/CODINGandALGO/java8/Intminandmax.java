package CODINGandALGO.java8;

import java.util.Arrays;

public class Intminandmax {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int max = Arrays.stream(numbers).max().getAsInt();
        int min = Arrays.stream(numbers).min().getAsInt();
        System.out.println("Maximum of  numbers: " + max +" : "+ min);
    }
}
