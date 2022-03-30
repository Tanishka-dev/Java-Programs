package BST;

import java.util.LinkedList;
import java.util.Queue;

public class BST {

   static class Node{
      int data;
      Node left;
      Node right;
      Node(int data){
         this.data = data;
         this.left = null;
         this.right = null;
      }

   } 
    static void levelOrder(Node root){
      if(root==null)
        return;
      Queue<Node> q= new LinkedList<>();
      q.add(root);
      q.add(null);
 
      while(!q.isEmpty()){
         Node current =q.remove();
         if(current == null){
            System.out.println();
            if(q.isEmpty())
              break;
            else
              q.add(null);
         }else{
            System.out.print(" "+ current.data+ " ");
            if(current.left !=null)
               q.add(current.left);
            if(current.right !=null)
               q.add(current.right);
         
         }
      }
   }
         
   public static void postOrder(Node root){
      if(root ==null){
 
        return;
      }
      postOrder(root.left);
      postOrder(root.right);
      System.out.print(root.data+ " ");
   }
    public static void preOrder(Node root){
       if(root ==null){
         return;
       }
       System.out.print(root.data+ " ");
       preOrder(root.left);
       preOrder(root.right);
    }
    public static void inOrder(Node root){
      if(root ==null){
 
        return;
      }
      inOrder(root.left);
      System.out.print(root.data+ " ");
      inOrder(root.right);
   }
    static Node insertInBST(Node root, int data) {
      if(root == null){
         root= new Node(data);
         return root;
      }
      if(data<root.data){
         root.left= insertInBST(root.left, data);
      }
      if(data>root.data){
         root.right= insertInBST(root.right, data);
      }    
      return root;
   }
   static int minVal(Node root) {
      if(root == null){
         return -1;
      }
     Node temp=root;
     while(temp.left!=null){
        temp=temp.left;
     }
     return temp.data;
   }
   static int maxVal(Node root) {
      if(root == null){
         return -1;
      }
     Node temp=root;
     while(temp.right!=null){
        temp=temp.right;
     }
     return temp.data;
   }
   static Node deleteFromBST(Node root, int data) {
      if(root == null){
         return root;
      }
      if(root.data ==data){
         //0 or 1 child

         if(root.right==null) 
            return root.left;
         else if(root.left==null)
             return root.right;
         //have both child
         else{
           // find inorder successor(smallest in the right subtree)
           int min= minVal(root.right);
           root.data = min;
           root.right = deleteFromBST(root.right, min);
           return root;
         }
      }
      else if(root.data>data){
         root.left= deleteFromBST(root.left, data);
         return root;
      }else{
         root.right= deleteFromBST(root.right, data);
         return root;
      }
     
   }
  public static void main(String[] args) {
     int[] data= {7,5,6,3,61,0,2,1,21};
     Node root=null;
     for(int i:data) {
        root= insertInBST(root, i);
        
     }
     System.out.println(root.data);
     System.out.println("LevelOrder Traversal");
     levelOrder(root);
     System.out.println("PreOrder Traversal");
     preOrder(root);
     System.out.println();
     System.out.println("InOrder Traversal");
     inOrder(root);
     System.out.println();
     System.out.println("PostOrder Traversal");
     postOrder(root);
     System.out.println();
     System.out.println("Min value= "+ minVal(root));
     System.out.println("Max value= "+ maxVal(root));
     Node rootNode =deleteFromBST(root,7);
     System.out.println("LevelOrder Traversal after deletion of 7");
     levelOrder(rootNode);
  }

   
}
