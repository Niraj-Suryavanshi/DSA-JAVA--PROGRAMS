import java.util.LinkedList;
public class LLCollections {
    public static void main(String[] args) {
       //create
        LinkedList<Integer>ll=new LinkedList<>();//here we use classes not the primitive data type like the int char float

        //add
        ll.addFirst(1);
        ll.addFirst(2);
        ll.add(4);
        ll.addFirst(6);
        System.out.println(ll);
        ll.removeFirst();
        ll.removeLast();
        System.out.println(ll);

    }
}
