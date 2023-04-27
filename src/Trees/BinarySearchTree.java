package Trees;

public class BinarySearchTree {
    private Treenode root;
    private class Treenode{
        private int data;
        private Treenode left;
        private Treenode right;
        public Treenode(int data){
            this.data=data;
        }

    }
    boolean isvalid(Treenode root,int min,int max){
        if(root==null){
            return true;
        }
        if(root.data<=min||root.data>=max){
            return false;
        }
        boolean left=isvalid(root.left,min, root.data);
        if(left){
            boolean right=isvalid(root.right, root.data,max);
        }
        return false;
    }
    public void insert(int data) {
        //Create a new node
        Treenode newNode = new Treenode(data);

        //Check whether tree is empty
        if(root == null){
            root = newNode;
            return;
        }
        else {
            //current node point to root of the tree
            Treenode current = root, parent = null;

            while(true) {
                //parent keep track of the parent node of current node.
                parent = current;


                if(data < current.data) {
                    current = current.left;
                    if(current == null) {
                        parent.left = newNode;
                        return;
                    }
                }

                else {
                    current = current.right;
                    if(current == null) {
                        parent.right = newNode;
                        return;
                    }
                }
            }
        }
    }
    public void insert2(int data) {
        root = insertRec(root, data);
    }
    Treenode insertRec(Treenode root, int data) {

        // If the tree is empty,
        // return a new node
        if (root == null) {
            root = new Treenode(data);
            return root;
        }

        /* Otherwise, recur down the tree */
        if (data < root.data)
            root.left = insertRec(root.left, data);
        else if (data > root.data)
            root.right = insertRec(root.right, data);

        /* return the (unchanged) node pointer */
        return root;
    }


    public void inorderTraversal(Treenode node) {

        //Check whether tree is empty
        if(root == null){
            System.out.println("Tree is empty");
            return;
        }
        else {

            if(node.left!= null)
                inorderTraversal(node.left);
            System.out.print(node.data + " ");
            if(node.right!= null)
                inorderTraversal(node.right);

        }
    }
    public Treenode search(int key){
        return search(root,key);
    }
    public Treenode search(Treenode root,int key){
        if(root==null||root.data==key){
            return root;
        }
        if(key<root.data){
            return search(root.left,key);

        }
        else{
            return search(root.right,key);
        }
    }

    public static void main(String[] args) {
        BinarySearchTree obj=new BinarySearchTree();
//        obj.insert(6);
//        obj.insert(32);
//        obj.insert(2);
        obj.insert2(5);
        obj.insert2(7878);
        obj.insert2(13);

        obj.inorderTraversal(obj.root);
        if (null!=obj.search(131)){
            System.out.println("found");
        }
        else{
            System.out.println("Not Found");
        }
        System.out.println(obj.isvalid(obj.root,Integer.MIN_VALUE,Integer.MAX_VALUE));
    }
}
