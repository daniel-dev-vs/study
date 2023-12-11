package algoexpert.easy;

import java.util.ArrayList;
import java.util.List;

public class NodesPathProblem {


    public static void main(String[] args) {
        int result = nodeDepths(fillRoot());

        System.out.println(result);
    }
    public static class BinaryTree {
        int value;
        BinaryTree left;
        BinaryTree right;

        BinaryTree(int value) {
            this.value = value;
            this.left = null;
            this.right = null;
        }
    }

    public static int nodeDepths(BinaryTree root) {
        // Write your code here.
        int[] result = {0};

        sum(root, 0, result);

        return result[0];

    }

    public static void sum(BinaryTree tree,int level, int[] result){
        result[0]+= level;

        if(tree.left != null){
            sum(tree.left, level+1, result);

        }
        if(tree.right != null){
            sum(tree.right, level+1, result);

        }


    }
    
    public static BinaryTree fillRoot(){
        BinaryTree BinaryTree1 = new BinaryTree(1);
        BinaryTree BinaryTree2 = new BinaryTree(2);
        BinaryTree BinaryTree3 = new BinaryTree(3);
        BinaryTree BinaryTree4 = new BinaryTree(4);
        BinaryTree BinaryTree5 = new BinaryTree(5);
        BinaryTree BinaryTree6 = new BinaryTree(6);
        BinaryTree BinaryTree7= new BinaryTree(7);
        BinaryTree BinaryTree8 = new BinaryTree(8);
        BinaryTree BinaryTree9 = new BinaryTree(9);


        BinaryTree1.left = BinaryTree2;
        BinaryTree1.right = BinaryTree3;

        BinaryTree2.left = BinaryTree4;
        BinaryTree2.right = BinaryTree5;

        BinaryTree4.left = BinaryTree8;
        BinaryTree4.right = BinaryTree9;


        BinaryTree3.left = BinaryTree6;
        BinaryTree3.right = BinaryTree7;

        return BinaryTree1;
        
    }
}
