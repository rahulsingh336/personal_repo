package random;

public class ArraySum {

  //given array you need to find sum
  public static void main(String[] args) {

    int[] arr = {1,2,3,4,10,11};
    printSum(arr);
  }

  static void printSum(int[] arr){

    int sum = 0;
    for (int i = 0; i < arr.length; i++) {
      sum += arr[i];
    }
    System.out.println(sum);
  }
}
