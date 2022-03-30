

import java.util.LinkedList;
import java.util.Queue;

public class Tree {
   static class Node {
       int data;
       Node left;
       Node right;
 
       Node(int data) {
           this.data = data;
           this.left = null;
           this.right = null;
       }
   }

   
 
   static class BinaryTree {
       static int idx = -1;
       public static Node buildTree(int nodes[]) {
           idx++;
           if(nodes[idx] == -1) {
               return null;
           }
           Node newNode = new Node(nodes[idx]); 
           newNode.left = buildTree(nodes);
           newNode.right = buildTree(nodes);
           return newNode;
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
   public static void levelOrder(Node root){
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
            System.out.print(current.data+ " ");
            if(current.left !=null)
               q.add(current.left);
            if(current.right !=null)
               q.add(current.right);
         
         }
      }
   }
   public static int countNodes(Node root){
      if(root==null)
        return 0;  
      int leftNodes= countNodes(root.left);
      int righttNodes= countNodes(root.right);
      return leftNodes+righttNodes+1;   
   }
   public static int sumOfNodes(Node root){
      if(root==null)
        return 0;  
      int sumleftNodes= sumOfNodes(root.left);
      int sumrighttNodes= sumOfNodes(root.right);
      return sumleftNodes+sumrighttNodes+ root.data;   
   }
   public static int heightOfTree(Node root){
      if(root==null)
        return 0;  
      int heightLeft= heightOfTree(root.left);
      int heightRight= heightOfTree(root.right);

      int myHeight = Math.max(heightLeft, heightRight)+1;
      return myHeight;   
   }
   public static int diameterOfTree(Node root){
      if(root==null)
        return 0;  
      int diameterLeft= diameterOfTree(root.left);
      int diameterRight= diameterOfTree(root.right);
      int diameterRoot= heightOfTree(root.left)+ heightOfTree(root.right)+1;
      int myDiameter =Math.max(Math.max(diameterRight, diameterLeft), diameterRoot);
      return myDiameter;   
   }

   static class Diameter{
      int dia,ht;

      Diameter(int dia, int ht){
         this.dia = dia;
         this.ht = ht;
      }

      public static Diameter linearDiameter(Node root) {
         if(root==null)
            return new Diameter(0,0);


         Diameter left = linearDiameter(root.left);
         Diameter right = linearDiameter(root.right);

         int myHeight= Math.max(left.ht, right.ht)+1;

         int diam1=left.dia;
         int diam2=right.dia;
         int diam3=left.ht+right.ht+1;
        
        int myDiameter= Math.max(Math.max(diam1, diam2), diam3);

        Diameter info= new Diameter(myDiameter, myHeight);
        return info;       
      }
   }

   static class Find{
      boolean bal;
      int ht;
      
      Find(boolean bal, int ht){
          this.bal=bal;
          this.ht=ht;
      }
      
     static Find balance(Node root){
      if(root==null)
         return new Find(true,0);
    Find left= balance(root.left);
    Find right= balance(root.right);
       
    int height=Math.max(left.ht, right.ht)+1;
    boolean lft = left.bal;
   boolean rgt =  right.bal;
   boolean diff= Math.abs(left.ht- right.ht) <= 1;
   
   boolean balans=false;
   if(lft && rgt && diff)
      balans= true;
   else
     balans=false;
   
   Find info= new Find(balans,height);
   return info;
 }
      
      
  }


  static class Check{
   int sum;
boolean isSum;

Check(int sum, boolean isSum){
   this.sum=sum;
   this.isSum=isSum;
   
  }
  
 static Check findout(Node root){
      if(root==null)
        return new Check(0, true);
        
       if(root.left ==null && root.right ==null )
        return new Check(root.data, true);
        Check left= findout(root.left);
        Check right= findout(root.right);
   
       boolean isLeftSum= left.isSum;
       boolean isRightSum= right.isSum;
       boolean correct= root.data==(left.sum+right.sum)? true: false;
          
       Check info= new Check(left.sum+right.sum,correct);
        
        if(isLeftSum && isRightSum && correct ){
              info.isSum=true;
                info.sum=2*root.data;
        }
        else{
             info.isSum=false;            
        }        
       return info;     
  }
   
}

   
    static void morrisTraversal(Node root){
       if(root==null)
         return;
       Node current=root;
       Node predecessor;
       while(current!=null){
          if(current.left==null){
             System.out.print(current.data+ " ");
             current=current.right;

          }else{
            predecessor=current.left;
             while(predecessor.right!=null && predecessor.right!=current){
                predecessor=predecessor.right;
             }
             if(predecessor.right==null){
                predecessor.right=current;
                current=current.left;
             }else{
               predecessor.right=null;
               System.out.print(current.data+ " ");
               current=current.right;

             }
          }
       }      
    }
   public static void main(String args[]) {
       int nodes[] = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};    
       Node root = BinaryTree.buildTree(nodes);
       System.out.println("root- "+root.data);
       System.out.println("PreOrder Traversal");
       preOrder(root);
       System.out.println();
       System.out.println("InOrder Traversal");
       inOrder(root);
       System.out.println();
       System.out.println("PostOrder Traversal");
       postOrder(root);
       System.out.println();
       System.out.println("Tree-");
       levelOrder(root);
       System.out.println("Number of nodes- "+ countNodes(root));
       System.out.println("Sum of nodes- "+ sumOfNodes(root));
       System.out.println("Height of Tree- "+ heightOfTree(root));
       System.out.println("Diameter of Tree- "+ diameterOfTree(root));
       System.out.println("Diameter through linear time complexity of Tree- "+ Diameter.linearDiameter(root).dia);

      boolean isBal= Find.balance(root).bal;
      if(isBal)
        System.out.println("True");
      else
        System.out.println("False");

        boolean isSumTree= Check.findout(root).isSum;
        if(isSumTree)
          System.out.println("True");
        else
          System.out.println("False");
        
        morrisTraversal(root);
   }
}

    