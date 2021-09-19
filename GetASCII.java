// get asci VALUE
import java.util.*;
public class GetASCII{
  public static void main(String[] args) {
    String s = "@ABCDEFGHIJKLMNOPQRSTUVWXYZ`abcdefghijklmnopqrstuvwxyz~!#$%^&*()_+-={}[]|\"';:<>?,./0123456789";
    int e = 0;
    // for (int i = 0; i < s.length(); i++) {
      //    System.out.println(s.charAt(i) + ":  " + (e + s.charAt(i)));
      //   e = 0;
      // }
    char arr[] = s.toCharArray();
    Arrays.sort(arr);
    for (int k: arr) {
      System.out.println(arr[e] + ":  "+ k);
      e++;
    }
  }
}
