package eclipse;

public class ReverseArray {
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
