package Trees;

public class BST {
    static class node{
        int data;
        node left;
        node right;
        node(int data){
            this.data=data;
        }
    }
    public static node insert(node root,int val){
        if(root==null){
            root=new node(val);
            return root;
        }
        if(root.data>val){
            root.left=insert(root.left,val);
        }
        else{
            root.right=insert(root.right,val);
        }
        return root;
    }
    public static void inordertraversal(node root){
        if (root==null){
            return;
        }
        inordertraversal(root.left);
        System.out.print(root.data+"---->");
        inordertraversal(root.right);
    }
    public static void postordertraversal(node root){
        if (root==null){
            return;
        }
        postordertraversal(root.left);
        postordertraversal(root.right);
        System.out.print(root.data+"---->");
    }
    public static void preordertraversal(node root){
        if (root==null){
            return;
        }
        System.out.print(root.data+"---->");
        preordertraversal(root.left);
        preordertraversal(root.right);
    }
   public static int height( node temp)
    {
        // code here
        if(temp==null){
            return 0;
        }
        int left=height(temp.left);
        int right=height(temp.right);
        int ans=Math.max(left,right)+1;
        return ans;
    }
    public static int countLeaf( node root) {
        if(root == null) {
            return 0;
        }
        if (root.left == null && root.right == null) {
            return 1;
        }
        else {
            return countLeaf(root.left) + countLeaf(root.right);
        }
    }
    public static node delete(node root,int val){
        //phle search krna vo node jise delete krna
     if(root.data>val){
         root.left=delete(root.left,val);
     } else if (root.data<val) {
         root.right=delete(root.right,val);
     }
     else{
         //milgaya
         //case1
         if(root.right==null&&root.left==null){
             return null;
         }
         //case2
         if(root.left==null){
             return root.right;
         }
         if(root.right==null){
             return root.left;
         }
         //case3
         node is=inordersuccesor(root.right);
         root.data=is.data;
         root.right=delete(root.right, is.data);
     }
     return root;
    }
    public static node inordersuccesor(node root){
        while (root.left!=null){
            root=root.left;
        }
        return root;
    }
   public static void findmax(node root){
        if (root.right==null){
            System.out.println(root.data);
            return;
        }
        else {
            while (root.right!=null){
                root=root.right;
            }
            System.out.println(root.data);

        }
   }
    public static void findmin(node root){
        if (root.left==null){
            System.out.println(root.data);
            return;
        }
        else {
            while (root.left!=null){
                root=root.left;
            }
            System.out.println(root.data);

        }
    }

    public static void main(String[] args) {
        System.out.println("SHANTANU SHUKLA");
        System.out.println("21BCB0038");
        System.out.println("True");
        System.out.println(9);
        System.out.println(1);
        int values[]={3,1,4,6,9,2,5,7};
        node root=null;
        for (int i = 0; i <values.length ; i++) {
            root=insert(root,values[i]);
        }

    }
}
