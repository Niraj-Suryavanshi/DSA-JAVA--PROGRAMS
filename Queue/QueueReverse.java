import java.util.*;
public class QueueReverse 
{

    public static void reverse(Queue<Integer>q)
    {
        Stack<Integer>s=new Stack<>();
        int size=q.size();
        for(int i=0;i<size;i++)
        {
            s.push(q.remove());
        }

        while(!s.isEmpty())
        {
            q.add(s.pop());
        }
        
    }

    public static void main(String[] args) {
        Queue<Integer>q=new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);

        System.out.println(q);

        reverse(q);
        while(!q.isEmpty())
        {
            System.out.print(q.remove()+" ");
        }
    }
}
