package org.dsa.binaryAnswers;

public class _13_MedianTwoSortedArrays {
    static void main() {
        int[] arr1 = {2, 4};
        int[] arr2 = {1, 3, 5};
        System.out.println(bruteForceMedian(arr1, arr2));
        /*Time: O(n + m)
        Space: O(1)*/
        System.out.println(betterMedian(arr1, arr2));
    }

    private static float betterMedian(int[] arr1, int[] arr2) {

        int n = arr1.length;
        int m = arr2.length;
        int len = n + m;

        // below indices will point to same index in case od odd length and adjacent middle index in case of even length;
        int ind1 = (len - 1) / 2;   // left middle
        int ind2 = len / 2;         // right middle

        int i = 0, j = 0;
        int count = 0;

        int ele1 = -1;
        int ele2 = -1;

        while (i < n && j < m) {

            int curr;

            if (arr1[i] <= arr2[j]) {
                curr = arr1[i++];
            } else {
                curr = arr2[j++];
            }

            if (count == ind1)
                ele1 = curr;

            if (count == ind2)
                ele2 = curr;

            count++;
        }

        while (i < n) {

            int curr = arr1[i++];

            if (count == ind1)
                ele1 = curr;

            if (count == ind2)
                ele2 = curr;

            count++;
        }

        while (j < m) {

            int curr = arr2[j++];

            if (count == ind1)
                ele1 = curr;

            if (count == ind2)
                ele2 = curr;

            count++;
        }
        return (ele1 + ele2) / 2.0f;
    }

    private static float bruteForceMedian(int[] arr1, int[] arr2) {
        int[] result = mergeSortedArrays(arr1, arr2);
        int n = result.length;
        if (result.length % 2 == 1)
            return result[n / 2];
        else {
            return (result[n / 2] + result[n / 2 - 1]) / 2f;
        }
    }

    private static int[] mergeSortedArrays(int[] arr1, int[] arr2) {
        int n = arr1.length;
        int m = arr2.length;
        int i = 0;
        int j = 0;
        int[] res = new int[m + n];
        int k = 0;
        while (i < n && j < m) {
            if (arr1[i] < arr2[j]) {
                res[k] = arr1[i];
                i++;
            } else {
                res[k] = arr2[j];
                j++;
            }
            k++;
        }

        while (i < n) {
            res[k] = arr1[i];
            i++;
            k++;
        }


        while (j < m) {
            res[k] = arr2[j];
            j++;
            k++;

        }
        return res;
    }
}
