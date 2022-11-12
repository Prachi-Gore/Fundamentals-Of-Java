package com.project;
// kunal kushwaha youtube Maths for DSA L1
public class Bitwise{
    public static void main(String[] args) {
        //System.out.println(isOddEven(67));
        // false:odd  true:even
       // System.out.println(findUnique(new int[]{2, 1, 3, 6, 3, 2, 1, 4, 4}));
        System.out.println(findBit(new int[]{1, 1, 0, 1,0},3));
    }

    public static boolean isOddEven(int n) {
        return (n & 1) == 0;
    }

    public static int findUnique(int[] arr) {
        int unique = 0;
        for (int elt : arr)
            unique ^= elt;// XOR //Associative// 0^elt=elt//elt^elt=0
        return unique;
    }
    // find kth bit
    public static int findBit(int[] arr,int k ){
        return arr[k] & 1;
    }
    // set the kth bit (make it 1)
    // reset kth bit   (make it 0)

}


