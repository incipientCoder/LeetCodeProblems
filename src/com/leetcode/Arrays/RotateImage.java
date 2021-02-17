package com.leetcode.Arrays;

import java.util.Arrays;

/***
 * You are given an n x n 2D matrix representing an image, rotate the image by 90 degrees (clockwise).
 *
 * You have to rotate the image in-place, which means you have to modify the input 2D matrix directly. DO NOT allocate another 2D matrix and do the rotation.
 *
 *
 *
 * Example 1:
 *
 * Input: matrix = [[1,2,3],[4,5,6],[7,8,9]]
 * Output: [[7,4,1],[8,5,2],[9,6,3]]
 *
 * Example 2:
 *
 * Input: matrix = [[5,1,9,11],[2,4,8,10],[13,3,6,7],[15,14,12,16]]
 * Output: [[15,13,2,5],[14,3,4,1],[12,6,8,9],[16,7,10,11]]
 *
 * Example 3:
 *
 * Input: matrix = [[1]]
 * Output: [[1]]
 *
 * Example 4:
 *
 * Input: matrix = [[1,2],[3,4]]
 * Output: [[3,1],[4,2]]
 */


//Rotating an Image is equal to reversed of the transposed image.
  //  So we can do a transpose of a matrix first and then the reversal of the transposed matrix.
public class RotateImage {
    public RotateImage(){

    }
    public void rotateImage(int[][] matrix){
        System.out.println("The Matrix Before rotating : ");
        for(int i=0;i<matrix.length;i++){
            System.out.println(Arrays.toString(matrix[i]));
        }
        transpose(matrix);
        reflect(matrix);
        System.out.println("The Matrix after rotating : ");
        for(int i=0;i<matrix.length;i++){
            System.out.println(Arrays.toString(matrix[i]));
        }
    }

  public void transpose(int[][] matrix){
        int temp;
        for(int i=0;i<matrix.length;i++){
            for(int j=i;j<matrix.length;j++){
                temp = matrix[j][i];
                matrix[j][i] = matrix[i][j];
                matrix[i][j] = temp;
            }
        }
  }
  public void reflect(int[][] matrix){
        int n= matrix.length;
        int temp;
        for(int i=0;i<n;i++){
            for(int j=0;j<n/2;j++){
                temp= matrix[i][j];
                matrix[i][j]= matrix[i][n-j-1];
                matrix[i][n-j-1]=temp;

            }
        }

  }
}
