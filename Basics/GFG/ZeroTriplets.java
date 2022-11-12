package com.project;

import java.util.Arrays;

public class ZeroTriplets {
    public static void main(String[] args) {
        zeroTriplets(new int[]{0, -1, 2, -3, 1}, 5);
    }

    static void zeroTriplets1(int arr[], int n) {
        for (int i = 0; i < n - 2; i++) {         // we can take i<n
            for (int j = i + 1; j < n - 1; j++) {   // we can take j<n
                for (int k = j + 1; k < n; k++) {
                    if (arr[i] + arr[j] + arr[k] == 0) {
                        System.out.print(arr[i] + " " + arr[j] + " " + arr[k]);
                        System.out.println();
                    }
                }
            }

        }
    }

    // time complexity =O(n^3)
// arr[]: input array
// n: size of the array
//Function to find triplets with zero sum.
    public static boolean zeroTriplets(int arr[], int n) {
        boolean flag = false;
        Arrays.sort(arr);
        for (int i = 0; i < n - 2; i++) {
            if (flag)   // stop even if you found one triplets
                break;
            int l = i + 1; // start
            int r = n - 1; // end
            while (l < r) {
                int sum = arr[i] + arr[l] + arr[r];
                if (sum == 0) {
                    flag = true;
                    break;
                } else if (sum < 0)
                    l += 1;

                else
                    r -= 1;
            }
        }
        System.out.println(flag?"found":"not found");
        return flag;
    }
}