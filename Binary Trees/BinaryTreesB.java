import java.util.Currency;
import java.util.LinkedList;
import java.util.Queue;

import javax.swing.text.html.HTMLDocument.RunElement;

public class BinaryTreesB
{
    static class Node{
        int data;
        Node left;
        Node right;

        Node(int data)
        {
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }

    static class BinaryTree{
        static int idx=-1;
        public static Node buildTree(int nodes[])
        {
            idx++;
            if(nodes[idx]==-1)
            {
                return null;
            }
            Node newNode=new Node(nodes[idx]);
            newNode.left=buildTree(nodes);
            newNode.right=buildTree(nodes);

            return newNode;
        }

        public static void preorder(Node root)
        {
            if(root==null)
            {
                return;
            }

            System.out.print(root.data+" ");
            preorder(root.left);
            preorder(root.right);
        }

        public static void inorder(Node root)
        {
            if(root==null)
            {
                return;
            }

            inorder(root.left);
            System.out.print(root.data+" ");
            inorder(root.right);
        }

        public static void postorder(Node root)
        {
            if(root==null)
            {
                return;
            }
            postorder(root.left);
            postorder(root.right);
            System.out.print(root.data+" ");
        }

        public static void levelOrder(Node root)
        {
            if(root==null)
            {
                return;
            }
            Queue<Node>q=new LinkedList<>();
            q.add(root);
            q.add(null);

            while(!q.isEmpty())
            {
                Node curNode=q.remove();
                if(curNode==null)
                {
                    System.out.println();
                    if(q.isEmpty())
                    {
                        break;
                    }
                    else
                    {
                        q.add(null);
                    }
                }
                else
                {
                    System.out.print(curNode.data+" ");
                    if(curNode.left!=null)
                    {
                        q.add(curNode.left);
                    }
                    if(curNode.right!=null)
                    {
                        q.add(curNode.right);
                    }
                }
            }
        }
        
    }

        //       1
        //     /   \
        //    2      3
        //  /  \    /  \
        // 4    5  6    7

    public static int height(Node root)
    {
        if(root==null)
        {
            return 0;
        }
        int lh=height(root.left);
        int rh=height(root.right);
        return Math.max(lh, rh)+1;
    }

    public static int count(Node root)
    {
        if((root==null))
        {
            return 0;
        }
        int leftcount=count(root.left);
        int rightcount=count(root.right);
        return leftcount+rightcount+1;

        
    }

    public static int sum(Node root)
    {
        if(root==null)
        {
            return 0;
        }
        int leftsum=sum(root.left);
        int rightsum=sum(root.right);

        return leftsum+rightsum+root.data;
    }

    public static void main(String[] args) {

        // int  nodes[]={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        // BinaryTree tree=new BinaryTree();
        // Node root=tree.buildTree(nodes);
        // System.out.println(root.data);

        // tree.preorder(root);

        // tree.inorder(root);

        // tree.postorder(root);

        // tree.levelOrder(root);

        Node root=new Node(1);
        root.left=new Node(2);
        root.right=new Node(3);
        root.left.left=new Node(4);
        root.left.right=new Node(5);
        root.right.left=new Node(6);
        root.right.right=new Node(7);

        // System.out.println(height(root));

        System.out.println(count(root));

        System.out.println(sum(root));
        
    }
}