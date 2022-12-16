package ChallengeOne;

import java.util.*;

public class ChallengeOne {
    public static void main(String[] args) {
       int[] arr = {1,3,5,7,9};
       int[] arr1 = {2,4,5,6};

       List<Integer> sortedMax = new ArrayList<>();
       sortedMax.add(1);
       sortedMax.add(3);
       sortedMax.add(5);
       sortedMax.add(7);
       sortedMax.add(9);

       miniMaxValue(arr);
        System.out.println("====================");
       miniMaxSum(sortedMax);
    }

    public static void miniMaxValue(int[] arr){
        int max, min;

        Arrays.sort(arr);
        min = Arrays.stream(arr).min().getAsInt();
        max = Arrays.stream(arr).max().getAsInt();
        System.out.println(min + "-" + max);
    }

    public static void miniMaxSum(List<Integer> arr){

        int max, min;

        if(arr == null || arr.size()==0){
            System.out.println("Array List is empty");
        }

        List<Integer> sortedList = new ArrayList<>(arr);

        Collections.sort(sortedList);

        min = sortedList.get(0);
        max = sortedList.get(sortedList.size()-1);

        System.out.println("MIN ->" + min);
        System.out.println("MAX ->" + max);
    }
}
