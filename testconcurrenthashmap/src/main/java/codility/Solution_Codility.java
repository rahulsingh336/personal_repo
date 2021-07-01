package codility;

public class Solution_Codility {

  public static void main(String[] args) {
  	int[] a = {1,1,1,1,50};
  	//int[] a = {2,2,2,2,2,3,4,4,4,6};
  	//int[] a = {0,2,2};
    System.out.println(solution(a));
  }

	static int solution(int[] A) {
		int n = A.length;
		int[] L = new int[n + 1];
		L[0] = -1;
		for (int i = 0; i < n; i++) {
			L[i] = A[i];
		}
		int count = 0;
		int pos = (n) / 2;
		int candidate = L[pos];
		for (int i = 1; i <= n; i++) {
			if (L[i] == candidate)
				count = count + 1;
		}
		       if (count > pos)
			//+        if (2*count > n)
		  // if (2*count > n)
			return candidate;
		return (-1);
	}
}
