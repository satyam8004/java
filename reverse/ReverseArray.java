package eclipse;

public class Exp1 {
	
//	public static void main(String args[]) {
//		String s = "dog";
//		String all = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
//		int n = 0;
////		n = n + s.charAt(0);
//		for(int i = 0; i < s.length(); i++) {
//			n = 0;
//			n += s.charAt(i);
//			System.out.println(n);
//		}
//		
//		String a = "dog";
//		System.out.print(s == a);
//		
//		
//		int n = Integer.(i, 0);
		
//		agar ascii value zero kr de or fr plus minus kre to sirf zero match krna hoga
		
		// ek ese kr skte h ki sbki ascii value me pehle string ke char aane pr plus krte jaye 
		// or dusre string ke char aane pr minus krte jaaye free resulted ascii ko purani wali se compare kare to ye jada
		// time le lega
		
//		String s1 = "dog";
//		String s2 = "god";
//		boolean anagram = true;
//		String s = "";
//		char arr[] = s1.toCharArray();
//		if(s1.length() == s2.length()) {
//			for(int i = 0; i < arr.length; i++) {
//				s = s.concat(Character.toString(arr[i]));
//				if(s2.contains(s)) {
//					anagram = true;
//					continue;
//				}else {
//					anagram = false;
//					break;
//				}
//			}
//			
//			System.out.print(anagram ? "anagram " : " not anagram");
//		}
		
//		System.out.print(s1.contains());
		
//	}

	public static void main(String[] args) {
		int a[] = {2,5,1,1,3,6,9,8};
		int n = a.length;
		for(int i = 0; i < n/2; i++) {
			int temp = a[i];
			a[i] = a[n-1-i];
			a[n-1-i] = temp;
		}
		
		for(int e: a) {
			System.out.print(e + " ");
		}
	}

}
