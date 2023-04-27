package Trees;

import java.util.Stack;

public class Symmetrictree {
    private Treenode root;
    private class Treenode{
        private int data;
        private Treenode left;
        private Treenode right;
        public Treenode(int data){
            this.data=data;
        }

    }
    boolean issymetric(Treenode root){
        if(root==null){
            return true;
        }
        Stack<Treenode> stack=new Stack<>();
        stack.push(root.right);
        stack.push(root.left);
        while (!stack.isEmpty()){
            Treenode n1=stack.pop();
            Treenode n2=stack.pop();
            if(n1==null&&n2==null){
                continue;
                //continue neeche ka nhi dekhta
            }
            if(n1==null||n2==null||n1.data!=n2.data){
                return false;

            }
            stack.push(n1.left);
            stack.push(n2.right);
            stack.push(n1.right);
            stack.push(n2.left);

        }
        return true;
    }
    public void createBinaryTree(){
        Treenode first= new Treenode(1);
        Treenode second= new Treenode(2);
        Treenode third= new Treenode(3);
        Treenode fourth= new Treenode(4);
        Treenode fifth= new Treenode(2);
        Treenode sixth= new Treenode(3);
        Treenode seventh= new Treenode(4);

        root=first;
        first.left=second;
        first.right=fifth;
        second.left=third;
        second.right=fourth;
        fifth.left=seventh;
        fifth.right=sixth;

    }

    public static void main(String[] args) {
        Symmetrictree obj=new Symmetrictree();
        obj.createBinaryTree();
        System.out.println(obj.issymetric(obj.root));
    }
}
