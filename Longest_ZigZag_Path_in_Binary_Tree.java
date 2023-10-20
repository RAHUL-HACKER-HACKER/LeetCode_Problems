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
    int max=0; // to store max
    public int longestZigZag(TreeNode root) {
        if(root.left!=null){
           helper(root.left,true,1);    // going left adding 1 node
        }
        if(root.right!=null){
            helper(root.right,false,1); // going right adding 1 node
        }
        return max;
        
    }
    //BOOLEAN LEFT to know if arrived at this node by traversing left or right
    public void helper(TreeNode root,boolean left,int val){
        if(root.left==null && root.right==null){
            //LEAF NODE return val
            max=Math.max(val,max);
            return;
        }
      
        if(left){  
            //if arrived from left then right node should be included 
            if(root.right!=null){
             helper(root.right,false,val+1);  //+1 node as right node is present
            }else{
                max=Math.max(val,max);    //if right node not present compare the val to max
            }
            if(root.left!=null){
                helper(root.left,true,1);   // starting as 1st node as it has already arrived from left so going left would be starting a new chain

            }
        }else{
           
             if(root.right!=null){
                 helper(root.right,false,1);
            }
             //if arrived from right then left node should be included 
            if(root.left!=null){
                helper(root.left,true,val+1); //+1 node as right node is present

            }
            else{
                max=Math.max(val,max);    //if left node not present compare the val to max
            }

        }
        
    }
}