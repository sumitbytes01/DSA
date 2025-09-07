package org.dsa.recursion;

public class FiveSumOfFirstNNaturalNumbers {
    public static void main(String[] args) {
        //O(1)
        int n = 10;
        int sum = (n*(n+1))/2;
        System.out.println(sum);
        //O(n)
        sum = 0;
        for (int i = 0; i <= n; i++) {
            sum+=i;
        }
        System.out.println(sum);

        //recursion parameterised
        sum = 0;
        sumNNumbersRecursionParam(10,sum);

        //functional parameterised
        sum = sumNNumbersRecursionFunctional(10);
        System.out.println(sum);
    }

    private static int sumNNumbersRecursionFunctional(int i) {
        if(i==0)
            return 0;
        return i+sumNNumbersRecursionFunctional(i-1);
    }

    private static void sumNNumbersRecursionParam(int i, int sum) {
        if(i==0){
            System.out.println(sum);
            return;
        }
        sumNNumbersRecursionParam(i-1,sum+i);
    }
}
