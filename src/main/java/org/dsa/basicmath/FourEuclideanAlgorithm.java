package org.dsa.basicmath;

public class FourEuclideanAlgorithm {
    public static void main(String[] args) {
        //O(min(N1, N2))
        //Repeatedly subtract the smaller number from the larger number until one of them becomes 0.
        //Once one of them becomes 0, the other number is the GCD of the original numbers.
        int n1 = 9, n2 = 12;
        while (n1!=0 && n2!=0){
            if(n1>n2){
                n1 = n1-n2;
            }
            else
                n2=n2-n1;
        }
        int num = n1==0?n2:n1;
        System.out.println(num);
    }
}
