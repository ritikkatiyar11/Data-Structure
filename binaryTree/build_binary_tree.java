import jdk.dynalink.NamedOperation;
import java.util.*;
public class build_binary_tree {
    static class node {
        int data;
        node left;
        node right;

        node(int data) {
            this.data = data;
        }
    }

    public static class binaryTree {
        static int index = -1;
        public static int count(node root){
            if (root==null){
                return 0;
            }
            return count(root.left)+count(root.right)+1;
        }
        public static int sum(node root){
            if (root==null){
                return 0;
            }
            return sum(root.left)+sum(root.right)+ root.data;
        }
        public node build(int[] arr) {
            index++;

            if (arr[index] == -1) {
                return null;
            }
            node newnode = new node(arr[index]);
            newnode.left = build(arr);
            newnode.right = build(arr);
            return newnode;


        }
        public void postorder(node root){
            if (root==null){
                return;
            }

            postorder(root.left);
            postorder(root.right);
            System.out.print(root.data+" ");

        }
        public void Inorder(node root){
            if (root==null){
                return;
            }
            preorder(root.left);
            System.out.println(root.data+" ");
            preorder(root.right);


        }
        public void preorder(node root){
            if (root==null){
                return;
            }
            System.out.print(root.data+" ");
            preorder(root.left);
            preorder(root.right);

        }
        public void levelorder(node root){
            if (root==null)
            {
                return;
            }
            Queue<node> q=new LinkedList<>();
            q.add(root);
            q.add(null);
            while(!q.isEmpty())
            {
                node current=q.remove();
                if (current==null){
                    System.out.println();
                    if (q.isEmpty()){
                        break;


                    }
                    else {
                        q.add(null);
                    }
                }
                else {
                    System.out.print(current.data+" ");
                    if (current.left!=null){

                    q.add(current.left);}
                    if (current.right!=null){
                    q.add(current.right);}
                }
            }



        }

        public static void main(String[] args) {
            int nodes[] = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};

            binaryTree bt = new binaryTree();
            node root = bt.build(nodes);
//            bt.levelorder(root);
            System.out.println(count(root));
            System.out.println(heights(root));


        }
        public static int heights(node root){
            if(root==null){
                return 0;
            }
            int leftHeight=heights(root.left);
            int rightHeight=heights(root.right);
            int ans=Math.max(leftHeight,rightHeight)+1;
            return  ans;

        }


    }
}
