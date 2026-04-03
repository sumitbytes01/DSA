package org.dsa.binarysearch;

public class _7_OccuranceOfNumInArray {

    static void main() {
        // last occurance - first occurance +1
        int[] arr = {5, 5, 5, 5, 5, 5};
        int target = 5;
        // first occurance
        int first = -1;
        int l = 0;
        int r = arr.length - 1;
        while (l <= r) {
            int mid = l + (r - l) / 2;
            if (arr[mid] == target) {
                first = mid;
                r = mid - 1;
            } else if (arr[mid] > target) {
                r = mid - 1;
            } else {
                l = mid + 1;
            }
        }
        // last occurance
        int last = -1;
        l = 0;
        r = arr.length - 1;
        while (l <= r) {
            int mid = l + (r - l) / 2;
            if (arr[mid] == target) {
                last = mid;
                l = mid + 1;
            } else if (arr[mid] > target) {
                r = mid - 1;
            } else {
                l = mid + 1;
            }
        }
        first = arr[first] == target ? first : -1;
        last = arr[last] == target ? last : -1;
        System.out.println(last - first + 1);
    }
}
