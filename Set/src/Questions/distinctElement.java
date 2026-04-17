package Questions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class distinctElement {
    public static int Distinct(int [] arr){
        HashSet<Integer> set =  new HashSet<>();
        for (int x : arr) {
            set.add(x);
        }

        return set.size();
    }

    public static  Boolean Twosum(int [] arr ,int  target){
          int n = arr.length;
          HashSet<Integer>set = new HashSet<>();

          for(int i = 0 ; i < n; i++){
                int sub = target -  arr[i];
                if(!set.contains(sub)) set.add(arr[i]);
                else return true;
          }
       return false;
    }

    public static ArrayList<Integer> missingRange(int [] arr , int low , int high){

           HashSet<Integer>set  = new HashSet<>();

           for (int x : arr){
               set.add(x);
           }

        ArrayList<Integer> ans = new ArrayList<>();
           for(int i = low ; i <= high; i++){
                if(!set.contains(i)) ans.add(i);
           }

           return ans;
    }

    public static void main(String[] args) {
            int [] arr = { 1 , 4 , 11 , 51 , 15};
            int low = 50;
            int high = 55;

        ArrayList<Integer> ans = missingRange(arr, 50, 55);
        System.out.println(ans);

    }
}
