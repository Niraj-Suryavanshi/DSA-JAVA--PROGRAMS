import java.util.*;
public class QueueUsingJCF {

    //IN jcf time complexity for all three operations are O(N)
    public static void main(String[] args) 
    {
    //    Queue q=new Queue(); not possible because q is the interface

   Queue<Integer>q=new LinkedList<>();//ArrayDeque
   q.add(1);
   q.add(2);
   q.add(3);

   while(!q.isEmpty())
   {
     System.out.println(q.peek());
     q.remove();
   }

}
}
