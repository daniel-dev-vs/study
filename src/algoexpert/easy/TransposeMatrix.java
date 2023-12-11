package algoexpert.easy;

import java.lang.System;


public class TransposeMatrix {


	public static int [][] transpose(int [][] matrix){

		int[][] transposed = new int[matrix[0].length][matrix.length];

		for(int i = 0; i < matrix.length; i++){
			for(int j = 0; j < matrix[0].length; j++){
				transposed[j][i] = matrix[i][j];						
			
			}				
		}

		
		return transposed;
	
	}

	public static void main(String [] args){


		int[][] matrix = new int[][]{{1,2,3},{4,5,6}};


		int[][] result = transpose(matrix);

		for(int i = 0; i < result.length; i++){
			for(int j = 0; j < result[0].length; j++){
				System.out.print(result[i][j]);				
			
			}
			System.out.println();			
		}

		
		
	}

}
