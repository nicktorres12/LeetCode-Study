// https://leetcode.com/problems/same-tree

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public boolean isSameTree(TreeNode p, TreeNode q) {
       if (p == null && q != null){
           return false;
       } 
        if (q == null && p != null){
           return false;
       }
        
        if(p.val != q.val){
            return false;
        }
        
        TreeNode head = p;
        TreeNode head2 = q;
        while(p != null && q!= null){
        if(p.val != q.val){
            return false;
        }
        else{
            p = p.left;
            q = q.left;
            
        }
        }
        if (p == null && q != null){
           return false;
       } 
        if (q == null && p != null){
           return false;
       }
        p = head;
        q = head2;
        while(p != null && q!= null){
        if(p.val != q.val){
            return false;
        }
        else{
            p = p.right;
            q = q.right;
            
        }
        
    }
        
        return true;
}
}