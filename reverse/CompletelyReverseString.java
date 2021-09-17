public class CompletelyReverseString{
  public static void main(String[] args) {
    //completely reverse a string

    String s = "my name is programmer";
    String ans = "";
    // for last word as string we need substring b/w 16 ,17
    // and then we will concat other words with it

    // System.out.print(s.substring(20, 21));
    for (int i = s.length()-1; i >= 0; i--) {
      ans = ans.concat(s.substring(i, i+1));
    }
    System.out.print(ans);
  }
}
