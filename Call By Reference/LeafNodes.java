
    class BinaryTreeNode<T> {
      T data;
      BinaryTreeNode<T> left;
      BinaryTreeNode<T> right;
      
      public BinaryTreeNode(T data) {
        this.data = data;
      }
    }


public class LeafNodes {
   int count=0;
   public void inorder(BinaryTreeNode<Integer> root , LeafNodes sol) { //Call By Reference for count using sol
    if(root==null)
        return;   
    inorder(root.left, sol);
    if(root.left==null && root.right==null)
        sol.count++;
     inorder(root.right, sol);
  } 
  public static int noOfLeafNodes(BinaryTreeNode<Integer> root) {
   LeafNodes sol= new LeafNodes();
    sol.inorder(root, sol);
    return sol.count;
  
    
    
    
    
       
  }
}
