public class Anagram{
  public static void main(String[] args) {

    boolean anagram = true;
    String a = "dog";
    String s = "god";

    if (a.length() == s.length()) {
      for (int i = 0; i < a.length(); i++) {
        // char k = a.charAt(i);
        // char cannot be converted to char sequence

          String c = "";
          c = c.concat(a.substring(i, i+1));
        if (!s.contains(c)) {
          anagram = false;
          break;
        }
      }

      for(int i = 0; i < s.length(); i++){
        // char c = s.charAt(i);
        String k = "";
        k = k.concat(s.substring(i, i+1));
        // s ka array yha use karenge
        if (!a.contains(k)) {
          anagram = false;
          break;
        }
      }
  }
    // if (anagram == true) {
    //   System.out.print("anagram");
    // }else{
    //   System.out.print("not anagram");
    // }

  // glt
    // (anagram) ? System.out.print("anagram") : System.out.print("not anagram");

    System.out.print(anagram ? "anagram" : "not anagram");
  }
}

// length se nhi kr skte kyoki char different ho skte

// IF SUM OF ASCII VALUE SAME H TO BHI TO ANAGRAM HONGE:
// pr ye glt ho skti h ki
// String s = "PQR";
// String a = "yz";
// ex:
// 80(P) + 81(Q) + 82(R) == 243
// 121(x) + 122(z) == 243


// SET SE
// pehle string ke sare char ko set me daal denge
// or dusre string ke sare char ko ek ek kr ke add karenge agar length bdla to not anagarm else anagram
// if a = "ABCDE";
// if b = "BCD"
// to ye galat ho jayega PR length wala check lga ke kr skte h

// ek ye kr skte h ki agar same dikhe to remove kr do vrna add kr do
// agar last me khali h to anagram nhi to not anagram

// ab contain wale me ye hai ki pehle ke sare element usme h leki dusre ke sare element pehle me nhi h
// array me contain function nhi chlta
// System.out.print(arr.contains("a"));


// to ye to main normal array list se bhi kr skta hu
// problem == agar pehle wale string ka size bda h or dusri string me vo char nhi fr bhi set define ho chuka h aur ab uska length pehle wale string ke hisab se hi rahega


// ek ho skta h ki saare char ko array me daal de or dono array ko sort krke compare kr le
