
package Algorithm.Binary_Search;

public class Binary_Search {

    public static Integer binarySearch(int[] list, int value){
      int low = 0;
      int high = list.length - 1;

      while (low <= high){
          int mid = (low + high) / 2;
          int guess = list[mid];

          if (guess == value){
            return mid;
          }
          if (guess > value){
            high = mid - 1;
          } else {
              low = mid + 1;
          }
      }
      return null;
    }

    public static void main(String[] args) {
        int[] myList = {1,2,3,4,5,6,7,8,9,10};
        System.out.println(binarySearch(myList, 5));
    }
}
