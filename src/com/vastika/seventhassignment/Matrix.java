package com.vastika.seventhassignment;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Matrix {
	public static void main(String[] args) {
		List<List<Integer>> matrix1 = new ArrayList<List<Integer>>();
		List<List<Integer>> matrix2 = new ArrayList<List<Integer>>();
		List<List<Integer>> result = new ArrayList<List<Integer>>();
		

		// first matrix
		matrix1.add(Arrays.asList(1, 2, 3));
		matrix1.add(Arrays.asList(4, 5, 6));
		matrix1.add(Arrays.asList(7, 8, 9));
		// System.out.println(matrix1.get(0).sort(0));

		// second matrix
		matrix2.add(Arrays.asList(4, 5, 6));
		matrix2.add(Arrays.asList(2, 7, 8));
		matrix2.add(Arrays.asList(3, 1, 9));
		
		//System.out.println("second matrix" + matrix2);
		int row = 0;
		int column = 0;

		// System.out.println("Size "+size);
		for (List<Integer> a : result) {
			for (int b : a) {

				result.add(Arrays.asList(matrix1.get(row).get(column) + matrix2.get(row).get(column)));
				

				column++;
			}
			

			column = 0;
			row++;
			
			// System.out.println(result);
			// result = new ArrayList<List<Integer>>();
			System.out.println();
		}
		//System.out.println(matrix1);
		// System.out.println(result.get(1));

//		// using arrays
//		int[][] matrixA = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
//
//		int[][] matrixB = { { 4, 5, 6 }, { 2, 7, 8 }, { 3, 1, 9 } };
//
//		
//
//		int[][] resultant = new int[3][3];
//
//		System.out.println("The resultant matrix is ");
//		for (int i = 0; i < 3; i++) {
//			for (int j = 0; j < 3; j++) {
//				resultant[i][j] = matrixA[i][j] + matrixB[i][j];
//				System.out.print(resultant[i][j] + " ");
//			}
//			System.out.println();
//		}

	}
}