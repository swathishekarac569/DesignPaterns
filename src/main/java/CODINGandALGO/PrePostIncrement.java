package CODINGandALGO;

public class PrePostIncrement {
  public static void main(String[] args) {
    int x = 5;

    // Post-increment: value is assigned first, then incremented
    int a = x++; // a = 5, x = 6
    System.out.println("Post-increment: a = " + a + ", x = " + x);

    // Pre-increment: value is incremented first, then assigned
    int b = ++x; // b = 7, x = 7
    System.out.println("Pre-increment: b = " + b + ", x = " + x);
  }
}
