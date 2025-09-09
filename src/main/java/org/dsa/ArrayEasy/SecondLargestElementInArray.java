package org.dsa.ArrayEasy;

public class SecondLargestElementInArray {
    public static void main(String[] args) {
        int[] arr = {2,5,1,3,0};
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        int secondsmallest = Integer.MAX_VALUE;
        for (int i = 0; i <arr.length; i++) {
            if(arr[i] > largest){
                secondLargest = largest;
                largest = arr[i];
            } else if (arr[i] > secondLargest && arr[i] != largest) {
                secondLargest = arr[i];
            }
            if(arr[i] < smallest){
                secondsmallest = smallest;
                smallest = arr[i];
            } else if (arr[i] < secondsmallest && arr[i] != smallest) {
                secondsmallest = arr[i];
            }
        }
        System.out.println("Largest Element is: "+largest);
        System.out.println("Second largest Element is: "+secondLargest);
        System.out.println("Smallest Element is: "+smallest);
        System.out.println("Second smallest Element is: "+secondsmallest);
    }
}
