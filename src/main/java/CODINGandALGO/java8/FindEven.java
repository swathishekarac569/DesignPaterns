package CODINGandALGO.java8;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class FindEven {
    public static void main(String[] args) {


        // 1 > Using Java 8 Streams to find even numbers in an array
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
      Arrays.stream(numbers).filter(e -> e % 2 == 0).forEach(System.out::print);
      System.out.println();

      // Using Java 8 Streams to find odd numbers in an array
      Arrays.stream(numbers).filter(e -> e%2 != 0 ).forEach(System.out::print);
      System.out.println();

      // 2 > Using sum of all numbers
      int sum = Arrays.stream(numbers).sum();
     double average =  Arrays.stream(numbers).average().getAsDouble();
      System.out.println("Sum of all average: " + average);
      System.out.println("Sum of all numbers: " + sum);

      // 3 > min and mx
      int max = Arrays.stream(numbers).max().getAsInt();
      int min = Arrays.stream(numbers).min().getAsInt();
      System.out.println("Maximum of  numbers: " + max +" : "+ min);

      //Distinct numbers
      Arrays.stream(numbers).distinct().boxed().collect(Collectors.toList());
      List<Integer> distinctNumbers = Arrays.asList(1, 1, 1, 4, 4, 6, 7, 9, 9, 10);
      distinctNumbers.stream().distinct().collect(Collectors.toList()).forEach(System.out::println);
      Arrays.stream(numbers).distinct().boxed().collect(Collectors.toList()).forEach(System.out::println);

      //Find duplicate in array
      int[] arrayWithDuplicates = {1, 2, 3, 4, 5, 3, 2, 6, 7, 8, 1};
      List<Integer> duplicates = Arrays.stream(arrayWithDuplicates)
        .boxed()
        .collect(Collectors.groupingBy(Function.identity() , Collectors.counting()))
        .entrySet()
        .stream()
        .filter(entry -> entry.getValue() > 1).map(Map.Entry :: getKey).collect(Collectors.toList());
      System.out.println("Duplicates: " + duplicates);

      // Find second highest number
      Arrays.stream(arrayWithDuplicates)
        .boxed()
        .sorted(Collections.reverseOrder())
        .distinct().skip(1)
        .findFirst().ifPresent(n -> System.out.println("Second highest number: " + n));

      List<Integer> list1 = Arrays.asList(1,2,3,4,5);
      List<Integer> list2 = Arrays.asList(1,2,9,8,0);

      List<Integer> finallist1 = list1.stream().filter(list2 :: contains).collect(Collectors.toList());
      System.out.println("Common elements: " + finallist1);
      System.out.println();

       // Frequency of characters in a string
      String st = "aawwssvvggttddqs";
      Map<Character, Long> frequencyMap = st.chars()
        .mapToObj(c -> (char) c)
        .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
      frequencyMap.forEach((k,v) -> System.out.println("Character: " + k + ", Frequency: " + v));

      //Find first non-repeating character
      String str = "swissword";
      char ch = str.chars()
        .mapToObj( c -> (char) c).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
        .entrySet().stream().filter(entry -> entry.getValue() == 1)
        .map(Map.Entry :: getKey).findFirst().get();
      System.out.println("First non-repeating character : "+ch);

      //Find sort for ascending and decending
      List<Integer> numList = Arrays.asList(5,3,8,1,2,7,4,6);
      numList.stream().sorted().forEach(System.out::print);
      System.out.println();
      numList.stream().sorted((a,b) -> b.compareTo(a)).forEach(System.out::print);
      System.out.println();
      numList.stream().sorted(Collections.reverseOrder()).forEach(System.out::print);
      System.out.println();

     //Convert list to strings to uppcare
      List<String> stringList = Arrays.asList("apple", "banana", "cherry");
      stringList.stream().map(String :: toUpperCase).forEach(System.out::println);
      System.out.println();

      //String starting with numb
      List<String> fruits = Arrays.asList("apple", "1banana", "1avocado", "2cherry", "3apricot");
      fruits.stream().filter(String -> Character.isDigit(String.charAt(0))).sorted().forEach(System.out::println);
      System.out.println();

      // Longest string in list
      List<String> longeststringList = Arrays.asList("apple", "banana", "cherry", "watermelon", "grape");
      String longeststring = longeststringList.stream().max(Comparator.comparing(String :: length)).get();
      System.out.println("Longest string: " + longeststring);

      // Count vowels in a string
      String vowelString = "Hello World!";
      long vowelCount = vowelString.chars()
        .mapToObj(c -> (char) c)
        .filter(c -> "AEIOUaeiou".indexOf(c) != -1)
        .count();
      System.out.println("Number of vowels: " + vowelCount);

      // Factorial of a number
      int number = 5;
      long factorial = IntStream.rangeClosed(1, number)
        .reduce(1, (a, b) -> a * b);
      System.out.println("Factorial of " + number + " is: " + factorial);

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


      // check if all numbers are positive
      boolean allPositive = Arrays.stream(numbers).allMatch(n -> n > 0);
      System.out.println("All numbers are positive: " + allPositive);

      // check if any number is greater than 8
      numevenodd.stream().filter(n -> n > 8).forEach(n -> System.out.println("Number greater than 8: " + n));
      numevenodd.stream().anyMatch(n -> n > 8);



    }
}
