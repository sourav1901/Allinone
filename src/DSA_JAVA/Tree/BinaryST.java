import java.util.*;

public class BinaryST {

    private static TreeNode root;

    public class TreeNode{
        private TreeNode left;
        private TreeNode right;
        private int data;
        
        
        public TreeNode(int data) {
            this.data = data;
        }
    }
    public void createTreeNode(){
        TreeNode t1 = new TreeNode(1);
        TreeNode t2 = new TreeNode(2);
        TreeNode t3 = new TreeNode(3);
        TreeNode t4 = new TreeNode(4);
        TreeNode t5 = new TreeNode(5);
        TreeNode t6 = new TreeNode(6);


        root = t1;
        t1.left = t2;
        t1.right = t3;

        t2.left =t4;
        t2.right = t5;

        t3.left = t6;

    }
    static int count=0;
    public void preOrder(TreeNode root){
        if(root == null){
            return;
        }
        count++;
        System.out.print(root.data+" ");
        preOrder(root.left);
        preOrder(root.right);

    }

    public void preOrder(){
        if(root==null){
            return;
        }
        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);
        while(!stack.isEmpty()){
            TreeNode temp = stack.pop();
            System.out.print(temp.data+" ");
            if(temp.right!=null){
                stack.push(temp.right);
            }
            if(temp.left!=null){
                stack.push(temp.left);
            }
        }
    } 

    public void inOrder(){
        if(root==null){
            return;
        }
        Stack<TreeNode> stack = new Stack<>();
        TreeNode temp = root;
        while(!stack.isEmpty() || temp!=null){
            if(temp!=null){
                stack.push(temp);
                temp = temp.left;
            }else{
                temp = stack.pop();
                System.out.print(temp.data+" ");
                temp = temp.right;
            }
            
        }
        System.out.println();
    } 

    public void postOrder(){
        TreeNode curr = root;
        Stack<TreeNode> stack = new Stack<>();
        while(!stack.isEmpty() || curr !=null){
            if(curr!=null){
                stack.push(curr);
                curr = curr.left;
            }else{
                TreeNode temp = stack.peek().right;
                if(temp==null){
                    temp = stack.pop();
                    System.out.print(temp.data+" ");
                    while(!stack.isEmpty() && temp == stack.peek().right){
                        temp = stack.pop();
                        System.out.print(temp.data+" ");
                    }
                }else{
                    curr = temp;
                }

            }
            
        }
    } 

    
    
    public void levelOrderTraverse(){
        if(root==null) return;

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while(!queue.isEmpty()){
            TreeNode temp = queue.poll();
            System.out.print(temp.data+" ");
            if(temp.left!=null) queue.offer(temp.left);
            if(temp.right!=null) queue.offer(temp.right);


        }
    }
    
    public void inOrder(TreeNode root){
        if(root == null){
            return;
        }
        inOrder(root.left);
        System.out.print(root.data+" ");
        inOrder(root.right);

    }

    
    public void postOrder(TreeNode root){
        if(root == null){
            return;
        }
        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.data+" ");

    }

    public void insert(int value){
        root = insertBST(root, value);
    }
    public TreeNode insertBST(TreeNode root,int value){
        if(root==null){
            root = new TreeNode(value);
            return root;
        }
        //recursion method
        if(value<root.data){
            root.left = insertBST(root.left, value);
        }else{
            root.right = insertBST(root.right, value);
        }

        //iterative method
        // TreeNode curr = root;
        // while(true){
        //     if(value<curr.data){
        //         if(curr.left!=null) curr = curr.left;
        //         else{
        //             curr.left = new TreeNode(value);
        //             break;
        //         }
        //     }else{
        //         if(curr.right!=null) curr = curr.right;
        //         else{
        //             curr.right = new TreeNode(value);
        //             break;
        //         }
        //     }
        // }

        return root;
    }

    public TreeNode search(int key){
        return searchBST(root,key);
    }
    public TreeNode searchBST(TreeNode root, int key){
        if(root==null || root.data==key){
            return root;
        }

        if(key < root.data){
            return searchBST(root.left, key);
        }else{
            return searchBST(root.right, key);
        }

    }

    public boolean isValidBST(TreeNode root) {
        return isValid(root,Long.MIN_VALUE,Long.MAX_VALUE);
    }
    public boolean isValid(TreeNode root,long min, long max){
        if(root==null) return true;
        
        if(root.data<=min || root.data>=max) return false;
        
        boolean  left = isValid(root.left,min,root.data);
        if(left){
            boolean right = isValid(root.right,root.data,max);
            return right;
        }
        return false;
    }

    public int maxDepth(TreeNode root) {
        if(root==null) return 0;
        int l = maxDepth(root.left);
        int r = maxDepth(root.right);
        return ((l>r?l:r))+1;
    }
    // iterative method
    // public int maxDepth(TreeNode root) {
    //     if(root==null) return 0;
    //     Stack<TreeNode> sNode = new Stack<>();
    //     Stack<Integer> sData = new Stack<>();
    //     int max =0;
    //     sNode.push(root);
    //     sData.push(1); 

    //     while(!sNode.isEmpty()){
    //         TreeNode curr = sNode.pop();
    //         int depth = sData.pop();
    //         if(curr.left!=null){
    //             sNode.push( curr.left);
    //             sData.push(depth+1);
    //         }
    //         if(curr.right!=null){
    //             sNode.push( curr.right);
    //             sData.push(depth+1);
    //         }
    //         max = Math.max(max, depth);
    //     }
    //     return max;
    // }



    
    
    public static void main(String[] args) {
        BinaryST bst = new BinaryST();

        bst.createTreeNode();
        bst.insert(5);
        bst.insert(15);
        bst.insert(30);
        bst.insert(52);
        bst.insert(5);
        bst.insert(32);


        



        // bst.preOrder();
        // bst.inOrder();
        // bst.postOrder();
        // bst.levelOrderTraverse();
        bst.preOrder(root);
        // bst.inOrder(root);
        // bst.postOrder(root);
        System.out.println(bst.maxDepth(root));
         
        // if(null != bst.search(30)) {
        //     System.out.println("key Found !!");
        // }else{
        //     System.out.println("key not found !!");
        // }
        // System.out.println(bst.isValidBST(root));
        System.out.println(count);
    }
}
