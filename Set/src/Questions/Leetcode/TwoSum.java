package Questions.Leetcode;

import java.util.HashSet;

public class TwoSum {
    public static int [] twoSum(int [] arr , int target ){
         int n = arr.length;
        HashSet<Integer> set = new HashSet<>();

        for(int i = 0; i < n; i++){
             int Sub = target - arr[i];

             if(set.contains(Sub)){
                  for(int j = 0 ; j < i; j++){
                       if(Sub == arr[j]) return new int[]{j, i};
                  }
             }

             set.add(arr[i]);
        }

        return new int[] {-1 , -1};
    }
    public static void main(String[] args) {
               int [] arr = {3,2,4};
               int target = 6;

               int [] ans = twoSum(arr, target);
               for(int x : ans){
                   System.out.print(x +"  ");
               }
    }

}
