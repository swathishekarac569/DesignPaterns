package CODINGandALGO.java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class commoninlist {
    public  static void main(String[] args) {

      List<Integer> list1 = Arrays.asList(1,2,3,4,5);
      List<Integer> list2 = Arrays.asList(1,2,9,8,0);

      List<Integer> finallist1 = list1.stream().filter(list2 :: contains).collect(Collectors.toList());
      System.out.println("Common elements: " + finallist1);
      System.out.println();

    }
}
