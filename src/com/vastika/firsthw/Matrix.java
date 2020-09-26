package com.vastika.firsthw;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Matrix {
	public static void main(String[]args) {
		List<List<Integer>> matrix1 = new ArrayList<List<Integer>>();
		List<List<Integer>> matrix2 = new ArrayList<List<Integer>>();
		//List<List<Integer>> result = new ArrayList<List<Integer>>();
		
		//first matrix
		matrix1.add(Arrays.asList(1,2,3));
		matrix1.add(Arrays.asList(4,5,6));
		matrix1.add(Arrays.asList(7,8,9));
		
		//second matrix
		matrix2.add(Arrays.asList(4,5,6));
		matrix2.add(Arrays.asList(2,7,8));
		matrix2.add(Arrays.asList(3,1,9));
		
		//using arrays
		int [][]matrixA = {{1,2,3},{4,5,6},{7,8,9}};
		int [][] matrixB = {{4,5,6},{2,7,8},{3,1,9}};
		int row=3;
		int column =3;
		int [][] result = new int[row][column];
		
		System.out.println("The resultant matrix is ");
		for(int i=0;i<row;i++) {
			for(int j=0;j<column;j++) {
				result[i][j] = matrixA[i][j] + matrixB[i][j];
				System.out.print(result[i][j]+" ");
			}
			System.out.println();
		}
		

	}
}