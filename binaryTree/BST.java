import java.util.ArrayList;
import java.util.List;

public class BST {
    public static class node{
        int data;
        node left=null,right=null;
        node(int data)
        {
            this.data=data;
        }

    }
    public static node insert(node root,int val){
        if(root==null){
            node newnode=new node(val);
            root=newnode;
            return root;
        }
        if (root.data>val){
            root.left=insert(root.left,val);
        }
        else {
            root.right=insert(root.right,val);
        }
        return  root;
    }
    public   static boolean find(node root,int key){
        if(root==null){
            return  false;
        }
        if (root.data==key)
        {
            return true;
        }
        if (root.data>key){
            return find(root.left,key);
        }
        else {
            return find(root.right,key);
        }

    }
    public static void inorder(node root){
        if(root==null){
            return;
        }

        inorder(root.left);
        System.out.print(root.data+"-->");
        inorder(root.right);

    }
    public static List<Integer> inorderlist(node root){
        if(root==null){
            List<Integer> ans = new ArrayList<Integer>();
            ans.add(0);

            return ans;
        }
        List<Integer> li = new ArrayList<Integer>();

        li.addAll(inorderlist(root.left));

        li.addAll(inorderlist(root.right));
        return  li;

    }




    public static void main(String[] args) {
        int vakues[]={ 5,1,3,4,2,7};
        node root=null;
        for (int i = 0; i < vakues.length; i++) {
            root=insert(root,vakues[i]);
        }
        System.out.println(find(root,10));
        System.out.println(inorderlist(root));


    }

}
