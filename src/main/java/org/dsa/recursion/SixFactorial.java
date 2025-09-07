package org.dsa.recursion;

public class SixFactorial {
    public static void main(String[] args) {
        int num =5;
        int res = 1;
        for (int i = 1; i <=num; i++) {
            res = res*i;
        }
        System.out.println(res);
        // parameterised recursion
        factorialRecursionParam(num,1);
        // functional recursion
        res = factorialRecursionFunctional(num);
        System.out.println(res);
    }

    private static int factorialRecursionFunctional(int num) {
        if (num==0)
            return 1;
        return (num) * factorialRecursionFunctional(num-1);
    }

    private static void factorialRecursionParam(int num, int res) {
        if (num==0){
            System.out.println(res);
            return;
        }
        factorialRecursionParam(num-1,res*num);
    }
}
