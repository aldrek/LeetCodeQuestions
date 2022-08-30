package com.aldrek.leetcodetwentryquestions;


class RotateImage {

    /**
     * This is a solution for Leetcode question  (https://leetcode.com/problems/rotate-image/)
     */
    public static void main(String[] args) {
        int[][] arr = {{5, 1, 9, 11}, {2, 4, 8, 10}, {13, 3, 6, 7}, {15, 14, 12, 16}};

        int n = arr.length;

        // flip rows to column and column to rows
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {

                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;

            }

        }

        // Mirror columns
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n / 2; j++) {
                int temp = arr[i][j];
                int index = n - 1 - j;
                arr[i][j] = arr[i][index];
                arr[i][index] = temp;
            }
        }


    }
}






