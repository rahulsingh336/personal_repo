package gfg;

import java.util.Stack;

public class Solution {

  public static void main(String[] args) {

    int[] arr = {4, 7, 11, 5,13, 2};
    //int[] arr = {6, 9, 3, 5, 13, 2};
    //int[] arr = {4, 7, 11, 13, 2};
    //int[] arr = {11, 11, 12, 9};
    //int[] arr = {1, 2, 3, 4, 2};
      Stack stack = new Stack();
    int count = 6;
    // {11, 11, 12, 9}
    System.out.println(test(arr, count));
      return;

  }

    private static boolean test(int[] arr, int n) {
/*        boolean result = false;
        for (int i = 0; i < n-1; i++) {
          for (int j = i + 1 ; j < n-1; j++) {
            for (int k = j + 1; k <= n -1; k++) {
                System.out.println(arr[i] +","+ arr[j] +","+ arr[k]);
                 if (arr[k] > arr[i] && arr[k] < arr[j]) {

                  result = true;
                  break;
              }
            }
          }
        }
        return result ? result : false;*/
        /*int currMin, currMax;
        currMin = currMax = arr[0];

        for (int i = 1; i < n; i++) {

            if (arr[i] < currMin) {
                currMin = arr[i];
            }
            else if (arr[i] > currMax) {
                currMax = arr[i];
            }
            if (arr[i] < currMax && arr[i] > currMin) {
                System.out.println(arr[i] +" - " +currMin +" - "+currMax);
                return true;
            }
        }
        return false;*/
        Stack < Integer > stack = new Stack < > ();
        int[] temp = new int[n];
        temp[0] = arr[0];
        for(int i = 1; i <n; i++)
            temp[i] = Math.min(temp[i - 1], arr[i]);

        for (int j = n - 1; j >= 0; j--)
        {
            if (arr[j] > temp[j])
            {
                while (!stack.empty() && stack.peek() <= temp[j])
                    stack.pop();
                if (!stack.empty() && stack.peek() < arr[j])
                    return true;
                stack.push(arr[j]);
            }
        }
        return false;
    }
}


