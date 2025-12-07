package CODINGandALGO.java8;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Intduplicateinarray {
     public static void main(String[] args) {

       //Find duplicate in array
       int[] arrayWithDuplicates = {1, 2, 3, 4, 5, 3, 2, 6, 7, 8, 1};
       List<Integer> duplicates = Arrays.stream(arrayWithDuplicates)
         .boxed()
         .collect(Collectors.groupingBy(Function.identity() , Collectors.counting()))
         .entrySet()
         .stream()
         .filter(entry -> entry.getValue() > 1).map(Map.Entry :: getKey).collect(Collectors.toList());
       System.out.println("Duplicates: " + duplicates);

     }
}
