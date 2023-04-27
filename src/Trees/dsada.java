//package Trees;
//
//public class dsada {
//
//        static class node{
//            int data;
//            node left;
//            node right;
//            node(int data){
//                this.data=data;
//            }
//        }
//        public static node insert(node root, int val){
//            if(root==null){
//                root=new node(val);
//                return root;
//            }
//            if(root.data>val){
//                root.left=insert(root.left,val);
//            }
//            else{
//                root.right=insert(root.right,val);
//            }
//            return root;
//        }
//        public static void inordertraversal(node root){
//            if (root==null){
//                return
//            }
//            inordertraversal(root.left);
//            System.out.println(root.data);
//            inordertraversal(root.right);
//        }
//        public static void postordertraversal(node root){
//            if (root==null){
//                return;
//            }
//            inordertraversal(root.left);
//            inordertraversal(root.right);
//            System.out.println(root.data);
//        }
//        public static void preordertraversal(node root){
//            if (root==null){
//                return;
//            }
//            System.out.println(root.data);
//            inordertraversal(root.left);
//            inordertraversal(root.right);
//
//        }
//
//    public static void main(String[] args) {
//
//        int values[]={3,1,4,6,9,2,5,7};
//        node root=null;
//        for (int i = 0; i <values.length ; i++) {
//            root=insert(root,values[i]);
//        }
//        preordertraversal(root);
//        inordertraversal(root);
//        postordertraversal(root);
//    }
//}
