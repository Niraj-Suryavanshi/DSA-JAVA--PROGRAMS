import java.util.ArrayList;
public class basic
{
    public static void main(String[] args) {
        //In arraylist we don't use primitive data type thats the reason we use Integer as non-primitive datatype
        ArrayList<Integer>list =new ArrayList<>();
        ArrayList<String>list2 =new ArrayList<>();
        ArrayList<Boolean>list3 =new ArrayList<>();

        list.add(2);//O(1) for adding element in the list
        list.add(3);
        list.add(4);

        list.add(3,1000);// takes O(n)

        System.out.println(list);

        //get operation takes O(1) for accessing element by the index
        int idx=list.get(2);
        System.out.println(idx);

        //Delete the element from the arraylist takes O(n)
        list.remove(2);
        System.out.println(list);

        //setting the element at specific location takes O(n)
        list.set(1,100);
        System.out.println(list);

        System.out.println(list.contains(1));
        System.out.println(list.contains(100));

       

        //In arraylist to find its size we use size() method
        // int sz=list.size();
        
        for(int i=0;i<list.size();i++)
        {
            System.out.print(list.get(i)+" ");//we don't use like arr[i] here we used .get(i)
        }



    }
}