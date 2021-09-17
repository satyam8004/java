// APNI KAKSHA
public class ReverseString{
  public static void main(String[] args) {
    String a = "my name is satyam";
    int n = a.length();

    // start from the last index value
    int i = n-1;
    String ans = "";
    while(i >= 0){
      // ignoring spaces present after the sentence
      while(i >= 0 && a.charAt(i) == ' ') i--;

      // initially j and i are at same position
      int j = i;
      // if i got out of index limit also for initial spaces
      if(i < 0) break;

      // reducing i till found the next space(moving in words)
      while (i >= 0 && a.charAt(i) != ' ') i--;

      if(ans.isEmpty()){
        ans = ans.concat(a.substring(i+1, j+1));
      }else{
        ans = ans.concat(" " + a.substring(i+1, j+1));
      }
      // return ans;
    }
    System.out.print(ans);
  }
}



// MINE WITH FOR LOOP

public class ReverseString{
  public static void main(String[] args) {
    String s = "my name is satyam";
    //                    i     j
    //                 i  j
    //            i    j
    //          i j
    int n = s.length();
    int j = n-1;
    // j will track off i
    String ans = " ";
    // we have to start from last index
    for (int i = n-1; i >= 0; i--) {
      if (s.charAt(i) == ' ') {
        // space kha rha h ye glt h 
        ans = ans.concat(s.substring(i+1, j+1) + " ");

        // ignoring spaces
        while(s.charAt(i) == ' ') i--;
        j = i;
        // i+1 kyoki i space h and for j see P1
      }
      // for the first word
      if(i == 0){
        ans = ans.concat(s.substring(0, j+1));
      }
    }
    System.out.print(ans);
  }
}


// P1
// public class CompletelyReverseString{
//   public static void main(String[] args) {
//     int i = 4;
//     int j = i;
//     i = 7;
//
//     System.out.print(j);
//   // j will not change
//   }
// }
