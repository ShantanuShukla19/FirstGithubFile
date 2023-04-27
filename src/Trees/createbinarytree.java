package Trees;
import java.util.Scanner;

public class createbinarytree {
    private node root;
    private class node{
        private int data;
        private node left;
        private node right;
        public node(int d){
            this.data=d;
            this.left=null;
            this.right=null;
        }
    }
    public void create(){
        node first=new node(2);
        node second=new node(1);
        node third=new node(4);
        node fourth=new node(21);
        node fifth=new node(11);
        root=first;
        first.left=second;
        first.right=third;
        second.left=fourth;
        second.left=fifth;
    }
    public node buildtree(node root){
        System.out.println("Enter the data : ");
        Scanner sc=new Scanner(System.in);
        int data=sc.nextInt();
        root= new node(data);
        if(data==-1){
            return null;
        }
        System.out.println("Enter the data you want to insert in left of "+data);
        root.left=buildtree(root.left);
        System.out.println("Enter the data you want to insert in right of "+data);
        root.right=buildtree(root.right);
        return root;
    }
   public void levelordertraversal(node root){

   }
    public static void main(String[] args) {
        node root=null;
        createbinarytree obj=new createbinarytree();
        root=obj.buildtree(root);
    }
}
