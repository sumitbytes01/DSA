package org.dsa.ArrayEasy;

public class _1_SecondLargestElementInArray {
    public static void main(String[] args) {
        int[] arr = {2,5,1,3,0};
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        int secondsmallest = Integer.MAX_VALUE;
        for (int j : arr) {
            if (j > largest) {
                secondLargest = largest;
                largest = j;
            } else if (j > secondLargest && j != largest) {
                secondLargest = j;
            }
            if (j < smallest) {
                secondsmallest = smallest;
                smallest = j;
            } else if (j < secondsmallest && j != smallest) {
                secondsmallest = j;
            }
        }
        System.out.println("Largest Element is: "+largest);
        System.out.println("Second largest Element is: "+secondLargest);
        System.out.println("Smallest Element is: "+smallest);
        System.out.println("Second smallest Element is: "+secondsmallest);
    }
}
