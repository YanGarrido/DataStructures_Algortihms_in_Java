package Algorithm.Selection_Sort;
import java.util.ArrayList;
import java.util.List;


public class Selection_Sort {
   public static int smallerSearch(List<Integer> arr){
       int smaller = arr.getFirst();
       int smallerIndex = 0;
       for(int i = 1; i < arr.size(); i++){
           if(arr.get(i) < smaller){
               smaller = arr.get(i);
               smallerIndex = i;
           }
       }
       return smallerIndex;
   }
   public static List<Integer> selectionSort(List<Integer> arr){
       List<Integer> newArr = new ArrayList<>();
       while (!arr.isEmpty()){
           int smaller = smallerSearch(arr);
           newArr.add(arr.remove(smaller));
       }
       return newArr;
   }

    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<>();
        arr.add(5);
        arr.add(3);
        arr.add(6);
        arr.add(2);
        arr.add(10);
        arr.add(1);
        arr.add(4);
        arr.add(8);
        arr.add(7);
        arr.add(9);
        arr.add(0);
        arr.add(11);
        arr.add(13);
        arr.add(12);
        arr.add(14);
        arr.add(15);

        List<Integer> result = selectionSort(arr);
        System.out.println(result);
    }
}
