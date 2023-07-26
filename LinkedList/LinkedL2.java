public class LinkedL2 {

        public static class Node
        {
            int data;
            Node next;

            Node(int data)
            {
                this.data=data;
                this.next=null;
            }
        }

    public static boolean isCycle(Node head)
    {
        Node slow=head;
        Node fast=head;

        while(fast!=null && fast.next!=null)
        {
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast)
            {
               return true;
            }
        }

        return false;
    }

    public static void removeLoop(Node head)
    {
        Node slow=head;
        Node fast=head;
        boolean cycle=false;

        while(fast!=null && fast.next!=null)
        {
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast)
            {
               cycle=true;
               break;
            }
        }

        if(cycle==false)
        {
            return;
        }

        //find  meeting point
        slow=head;
        Node prev=null;//for finding last node
        while(slow!=fast)
        {
            prev=fast;
            slow=slow.next;
            fast=fast.next;
        }

        prev.next=null;//remove cycle   

    }

    public static void main(String[] args) {
        Node n1=new Node(3);
        Node n2=new Node(4);
        Node n3=new Node(5);
        Node head=n1;
        head.next=n2;
        n2.next=n3;
        n3.next=n2;
        //print(head);
        System.out.println(isCycle(head));
        removeLoop(head);
        System.out.println(isCycle(head));
   
    }

   public static void print(Node head)
    {
        Node temp=head;
        while(temp!=null)
        {
            System.out.print(temp.data+"->");
            temp=temp.next;  
        }
    }
}


