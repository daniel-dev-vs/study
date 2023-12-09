package algoexpert;

import java.lang.System;
import java.util.*;



public class CloseValueBst {



	public static void main(String[] args){

		BST bst10 = new BST(10);
		BST bst5 = new BST(5);
		BST bst22 = new BST(22);
		BST bstS5 = new BST(5);
		BST bst1 = new BST(1);
		BST bst15 = new BST(15);
		BST bst13 = new BST(13);
		BST bst14 = new BST(14);
		BST bst2 = new BST(2);


		bst10.right = bst15;
		bst10.left = bst5;

		bst5.right = bstS5;
		bst5.left = bst2;

		bst2.left = null;
		bst2.right = null;
		
		bstS5.left = null;
		bstS5.right = null;


		bst15.left = bst13;
		bst15.right = bst22;
		
		bst13.right = bst14;
		bst13.left = null;

		bst22.right = null;
		bst22.left = null;

		bst14.right = null;
		bst14.left = null;

		int result = findClosestValueInBst(bst10, 1);
		System.out.println("result: " + result);
	}


	public static int findClosestValueInBst(BST tree, int target){
	
		int diff = getAbs(tree.value - target);
		int clo = tree.value;
		
		while(tree !=null){
			int calcDiff = getAbs(tree.value - target);


			if(diff > calcDiff)
			{
				diff = calcDiff;
				clo = tree.value;
			}

			if(target >= tree.value){
				tree = tree.right;
			}else{
				tree = tree.left;
			}

		
		}
			

		return clo;
	
	}


	public static int getAbs(int value){

		if(value > -1)
			return value;
		else
			return -(value);
	}





}

