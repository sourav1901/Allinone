import java.util.Scanner;

// 1, 3, 6, 8, 11, 13, 16, 18, 21, 23, 26, 28, 31, 33, 36, 38, 41 n=17;

public class GenerateSeries {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();

    int k = 3;
    int i = 2;
    // System.out.print(1 +" "+ 3 + " ");
    if (n == 1) {
      System.out.print(1);
    } else {

      while (i <= n - 1) {
        k = k + 3;
        // System.out.print(k + " ");
        i++;
        if (i <= n - 1) {
          k = k + 2;
          // System.out.print(k+ " ");
          i++;
        }
      }
      System.out.print(k);
    }

  }
}
