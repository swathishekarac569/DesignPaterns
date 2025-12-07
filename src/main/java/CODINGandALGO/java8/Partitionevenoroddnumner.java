package CODINGandALGO.java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Partitionevenoroddnumner {
    public static void main(String[] args) {
      //Partition even or odd numner
      List<Integer> numevenodd = Arrays.asList(5,3,8,1,2,7,4,6,10,11,13);
      numevenodd.stream().collect(Collectors.partitioningBy(n -> n % 2 == 0))
        .forEach((isEven, nums) -> {
          if (isEven) {
            System.out.println("Even numbers: " + nums);
          } else {
            System.out.println("Odd numbers: " + nums);
          }
        });
    }
}
