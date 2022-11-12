package com.prachi;

import java.util.Arrays;

public class ARRAY2D {
    public static void main(String[] args) {
//        int[][] numbers = {{1, 2, 3}, {4, 5, 6}};
//        System.out.println(numbers.length);//no. of rows
//        System.out.println(numbers[0].length);// no.of elts in each row/columns
//        System.out.println(Arrays.toString(numbers[0]));
//
//        for (int j = 0; j <= 2; j++) {
//            for (int i = 0; i <= 1; i++)
//                System.out.print(numbers[i][j] + " ");
//        }
//        System.out.println(Arrays.deepToString(numbers));//println leaves line after it
//        System.out.print("hi");
       // linearSearch(new int[][] {{1,2,3},{-8,-7},{98,56,-3,8}},80);
//      int[] ans=  binarySearch(new int[][]{{10,20,30,40},{11,25,35,45},{28,29,37,49},{33,34,38,50}},68);// matrix is sorting row wise as well as col wise
//        System.out.println(Arrays.toString(ans));
    }
    static int linearSearch(int[][] arr,int target){
        for (int i=0;i<arr.length;i++){           // row
            for (int j=0;j<arr[i].length;j++){    // col
                if (arr[i][j]==target) {
                    System.out.println("found");
                    return 1;
                }
            }
        }
        System.out.println("Not found");
        return -1;
    }
    static int[] binarySearch(int[][] matrix,int target){
        int r=0;int c=matrix.length-1;
        while (r< matrix.length && c>=0){
            if(target==matrix[r][c]){
                System.out.println("found");
                return new int []{r,c};
            }
            else if (target<matrix[r][c]){
                c--;
            }
            else{
                r++;
            }
        }
        System.out.println("Not found");
        return new int[]{-1,-1};
    }
    static int[] rowSearch(int[][] matrix,int row,int cStart,int cEnd,int target){
        while (cStart<cEnd){
            int cMid=cStart+(cEnd-cStart)/2;
            if (target==matrix[row][cMid])
                return new int[]{row,cMid};
            else if (target>matrix[row][cMid])
                cStart=cMid+1;
            else
                cEnd=cMid-1;
        }
        return new int[]{-1,-1};
    }
    static int[] binarySearch(int[][] matrix,int target){  // all elts of matrix are sorted
        int r= matrix.length;
        int c=matrix[0].length;     // n*m matrix
        if(r==1)
            return rowSearch(matrix,0,0,c-1,target);
        int rStart=0;int rEnd=r-1;int cMid=c/2;
        // run the loop still 2 rows are remaining
        while (rStart< rEnd-1){
            int rMid=rStart+(rEnd-rStart)/2;
            if(target==matrix[rMid][cMid])
                return new int[]{rMid,cMid};
            else if (target>matrix[r][c])
                rStart=rMid;
            else
               rEnd=rMid;
        }
        if (matrix[rStart][cMid]==target)
            return new int[]{rStart,cMid};
        if (matrix[rStart+1][cMid]==target)
            return new int[]{rStart+1,cMid};

        return new int[]{-1,-1};
    }

}