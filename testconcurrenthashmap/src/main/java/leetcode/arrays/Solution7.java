package leetcode.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Solution7 {

  public static void main(String[] args) {
     //int[] num = {1,2,3};
     int[] num = {8,9,9,9};
     //int[] num = {4,3,2,1};
     //int[] num = {0};
     //int[] num = {9,9};
    Arrays.stream(plusOne(num))
        .forEach(
				System.out::println);
  }

	public static int[] plusOne(int[] digits) {
  	/*if (digits.length == 1 ) {
		int temp = digits[0] + 1;
		if(temp > 9) {
			int[] t = {1,0};
			return t;
		} else {
			digits[0] = temp;
		}
  		return digits;
	}
    int quotient = 0;
  	List<Integer> tempList = new ArrayList<>();

    for (int i = digits.length-1; i >= 0; i--) {
    	if (quotient != 0) {
			int temp = digits[i] + quotient;
			if(temp > 9) {
				quotient = temp / 10 ;
				tempList.add(0);
				if (0==i) {
					tempList.add(1);
				}
			} else {
				tempList.add(temp);
				break;
			}
		} else {
			int temp = digits[i] + 1;
			if(temp > 9) {
				quotient = temp / 10 ;
				tempList.add(0);
				if (0 ==i) {
					tempList.add(1);
				}
			} else {
				tempList.add(temp);
				break;
			}
		}

    }
		Collections.reverse(tempList);
    return tempList.stream().mapToInt(i->i).toArray();*/
		ArrayList<Integer> result = new ArrayList<Integer>();
		if (digits == null || digits.length == 0) {
			int[] temp = {1};
			return temp;
		}

		int carry = 0;
		for (int i = digits.length - 1; i >= 0; i--) {
			if (i == digits.length - 1) {
				carry = carry + digits[i] + 1;
			} else {
				carry += digits[i];
			}
			result.add(0, carry % 10);
			carry /= 10;
		}

		if (carry == 1) {
			result.add(0, 1);
		}
		int resultArray[] = new int[result.size()];
		for (int i = 0; i < result.size(); i++) {
			resultArray[i] = result.get(i);
		}

		return resultArray;
	}
}
/*
3,9,9

9 + 1 = 10 / 10 = 1
9 + 1 = 10 /10 =1
400
*/


