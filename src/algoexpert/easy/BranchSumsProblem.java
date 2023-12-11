package algoexpert.easy;

import java.util.ArrayList;
import java.util.List;

public class BranchSumsProblem {

    public static class BinaryTree {
        int value;
        BinaryTree left;
        BinaryTree right;

        BinaryTree(int value) {
            this.value = value;
            this.left = null;
            this.right = null;
        } public static int nodeDepths(BinaryTree root) {
    // Write your code here.



		int result = sum(root, 0);

    return result;

  }

  public static int sum(BinaryTree tree, int sum){


    if(tree == null)
			return sum;

	if(tree.right != null)
			sum(tree.right, sum + 1);


	if(tree.left != null)
		sum(tree.left, sum+1);

    return sum;

	}
    }

    public static List<Integer> branchSums(BinaryTree root) {
        // Write your code here.
        List<Integer> result = new ArrayList<>();

        sum(root, 0, result);

        return result;

    }

    public static void sum(BinaryTree tree, int sum, List<Integer> result){


        if(tree == null)
            return;

        if(tree.left == null && tree.right == null){
            result.add(sum + tree.value);
            return;
        }


        sum(tree.left, sum + tree.value, result);
        sum(tree.right, sum + tree.value, result);

    }
}
