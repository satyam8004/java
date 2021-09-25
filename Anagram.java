package eclipse;

//import java.util.Arrays;

public class Anagram {
	public static void main(String[] args) {
		String s1 = "Hello";
		String s2 = "hello";
		boolean anagram = false;
		
//		agar hm kisis tarah se ye bta pate ki ye char aa gya h to ginte rahenge 
//		pehle string se sare char ko add +1 kr denge 
//		fr dusre string se -1 kr denge agar 0 aa gya to anagarm vrna not anagram
		
// I THINK THIS IS THE BEST METHOD
		
		int a[] = new int[256];
		int k = 0;

		if(s1.length() == s2.length()) {
			for(int i = 0; i <s1.length(); i++) {
//			    a[k+s1.charAt(i)]++;
				a[k+s1.toLowerCase().charAt(i)]++;
				a[k+s1.toUpperCase().charAt(i)]++;
				
//ye wala nhi karenge kyoki ye to bde wale ko chod dega nhi to chote wale ko chod dega
//				if(Character.isLowerCase(s1.charAt(i))) a[k+s1.charAt(i)]++;
//				if(Character.isUpperCase(s1.charAt(i))) a[k+s1.charAt(i)]++;
					
			}
			for(int i = 0; i < s2.length(); i++) {
				a[k+s2.toLowerCase().charAt(i)]--;
				a[k+s2.toUpperCase().charAt(i)]--;

//				if(Character.isLowerCase(s2.charAt(i))) a[k+s2.charAt(i)]--;
//				if(Character.isUpperCase(s2.charAt(i))) a[k+s2.charAt(i)]--;
			}
		
// THIS WAS ONLY FOR THE COMPLETE LOWER CASE OR COMPLETE UPPER CASE
	//		for(int e: s1.toCharArray()) {
	//			a[e]++;
	//		}
			
	//		for(int e: s2.toCharArray()) {
	//			a[e]--;
	//		}
			for(int i = 0; i < a.length; i++) {
				if(a[i] == 0) {
					anagram = true;
				}else {
					anagram = false;
					break;
				}
			}
		}

		System.out.print(anagram ? "anagram " : "not anagram ");
	}
}


//================================================================================================================
//		   in this method i am going to compare two string after sorting them 
//		   if they are equal then anagram else not anagram
		
//		String arr[] = new String[s1.length()];
//		for(int i = 0; i < s1.length(); i++) {
////			System.out.println(s1.charAt(i));
//			String c = Character.toString(s1.charAt(i));
//			arr[i] = c;
//		}
//		Arrays.sort(arr);
//		String ans1 = "";
//		for(String e : arr) {
//			ans1 = ans1.concat(e);
//		}
//		
//		String ard[] = new String[s2.length()];
//		for(int i = 0; i < s2.length(); i++) {
//			String k = Character.toString(s2.charAt(i));
//			ard[i] = k;
//		}
//		Arrays.sort(ard);
//		String ans2 = "";
//		for(String e : ard) {
//			ans2 = ans2.concat(e);
//		}
//		System.out.print(ans2);
	
//		 dono ans barabar h fr bhi anagram nhi bta rha pta nhi kha glt h
		
		
//================================================================================================================
//	    string ko char me bdl ke usi char ke hr element ko hr baar nye string me daal ke agar contains method se try kre to ho skta h
//	    lekin contains method sequence wise chlta h to vo nhi chalega( vo dog or god ko not anagram bta dega)
	    
	    
//	    if (a.length() == s.length()) {
//	      for (int i = 0; i < a.length(); i++) {
//	        // char k = a.charAt(i);
//	        // char cannot be converted to char sequence

//	          String c = "";
//	          c = c.concat(a.substring(i, i+1));
//	        if (!s.contains(c)) {
//	          anagram = false;
//	          break;
//	        }
//	      }
	
//	      for(int i = 0; i < s.length(); i++){
//	        // char c = s.charAt(i);
//	        String k = "";
//	        k = k.concat(s.substring(i, i+1));
//	        // s ka array yha use karenge
//	        if (!a.contains(k)) {
//	          anagram = false;
//	          break;
//	        }
//	      }
//      }
//	     if (anagram == true) {
//	       System.out.print("anagram");
//	     }else{
//	       System.out.print("not anagram");
//	     }

	  // glt
	    // (anagram) ? System.out.print("anagram") : System.out.print("not anagram");

//	    System.out.print(anagram ? "anagram" : "not anagram");
//	    }
//	  }
//=====================================================================================================================	




//length se nhi kr skte kyoki char different ho skte

//IF SUM OF ASCII VALUE SAME H TO BHI TO ANAGRAM HONGE:
//pr ye glt ho skti h ki
//String s = "PQR";
//String a = "yz";
//ex:
//80(P) + 81(Q) + 82(R) == 243
//121(x) + 122(z) == 243

//==============================================================================
 
//SET SE
//pehle string ke sare char ko set me daal denge
//or dusre string ke sare char ko ek ek kr ke add karenge agar length bdla to not anagarm else anagram
//if a = "ABCDE";
//if b = "BCD"
//to ye galat ho jayega PR length wala check lga ke kr skte h

//ek ye kr skte h ki agar same dikhe to remove kr do vrna add kr do
//agar last me khali h to anagram nhi to not anagram

//ab contain wale me ye hai ki pehle ke sare element usme h leki dusre ke sare element pehle me nhi h
//array me contain function nhi chlta
//System.out.print(arr.contains("a"));


//to ye to main normal array list se bhi kr skta hu
//problem == agar pehle wale string ka size bda h or dusri string me vo char nhi fr bhi set define ho chuka h aur ab uska length pehle wale string ke hisab se hi rahega


//ek ho skta h ki saare char ko array me daal de or dono array ko sort krke compare kr le

