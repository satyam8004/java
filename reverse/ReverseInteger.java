public class Exp{
  public static void main(String[] args) {
    int i = 345;
    // i%10 = 5
    // i/10 = 34
    int ans = 0;
    while(i > 0){
      int last = i%10;
      ans += last;
      i = i/10;
      if (i > 0) ans *= 10;
    }
    System.out.print(ans);

    // Method
    // 0 + 5 = 5
    // 5 * 10 = 50;
    // 50 + 4 = 54;
    // 54 * 10 = 540;
    // 540 + 3 = 543;
  }
}
