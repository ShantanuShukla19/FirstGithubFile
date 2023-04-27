package Trees;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class BinaryTree {
    private node root;
    private static class node {
        private int data;
        private node left;
        private node right;

        public node(int d) {
            this.data = d;
        }
    }

    public void preorder(node root){
        if(root==null){
            return;
        }
        System.out.println(root.data+ " ");
        preorder(root.left);
        preorder(root.right);
    }
    public void iterativepreorder(){
        if(root==null){
            return;
        }
        Stack<node> stk=new Stack<>();
        stk.push(root);
        while(!stk.empty()){
            node temp=stk.pop();
            System.out.println(temp.data);
            if(temp.right!=null){
                stk.push(temp.right);
            }
            if(temp.left!=null){
                stk.push(temp.left);
            }
        }

        }
    public void inorder(node root){
        if(root==null){
            return;
        }
        inorder(root.left);
        System.out.println(root.data+ " ");
        inorder(root.right);
    }
    public void inorderiterative(){
        if(root==null){
            return;
        }
        Stack<node> stk=new Stack<>();
        node temp=root;
        while (!stk.isEmpty()||temp!=null){
            if(temp!=null){
                stk.push(temp);
                temp=temp.left;
            }
            else {
                temp=stk.pop();
                System.out.println(temp.data+" ");
                temp=temp.right;
            }
        }
    }

    public void postorder(node root2){
        if(root2==null){
            return;
        }
        postorder(root2.left);
        postorder(root2.right);
        System.out.println(root2.data+ " ");
    }
    public void iterartivepostorder(){
        node current=root;
        Stack<node> stk=new Stack<>();
        while(current!=null||!stk.isEmpty()){
            if(current!=null){
                stk.push(current);
                current=current.left;
            }
            else{
                node temp=stk.peek().right;
                if(temp==null){
                    temp=stk.pop();
                    System.out.println(temp.data);
                    while (!stk.isEmpty()&& stk.peek().right==temp){
                        temp=stk.pop();
                        System.out.println(temp.data);
                    }
                }
                else{
                    current=temp;
                }
            }
        }
    }
    public void levelorderiterative(){
        if(root==null){
            return ;
        }
        Queue<node> queue=new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()){
            node temp=queue.poll();
            System.out.println(temp.data);
            if(temp.left!=null){
                queue.offer(temp.left);
            }
            if(temp.right!=null){
                queue.offer(temp.right);
            }
        }
    }
    public void createBinaryTree(){
        node first= new node(1);
        node second= new node(2);
        node third= new node(3);
        node fourth= new node(10);
        node fifth= new node(5);
        node sixth= new node(6);
        node seventh= new node(7);

        root=first;
        first.left=second;
        first.right=third;
        second.left=fourth;
        second.right=fifth;
        third.left=sixth;
        third.right=seventh;

    }
    public int findmax(node root){
        if(root==null){
            return Integer.MIN_VALUE;
        }
        int result=root.data;
        int left=findmax(root.left);
        int right=findmax(root.right);
        if(left>result){
            result =left;
        }
        if(right>result){
            result=right;
        }
        return result;
    }
    public static void main(String[] args) {
        BinaryTree obj=new BinaryTree();
        obj.createBinaryTree();
//        obj.preorder(obj.root);
//        obj.iterativepreorder();
   //obj.inorder(obj.root);
//        obj.inorderiterative();
       // obj.postorder(obj.root);
        //obj.iterartivepostorder();
       // obj.levelorderiterative();
        System.out.println(obj.findmax(obj.root));
    }
}
