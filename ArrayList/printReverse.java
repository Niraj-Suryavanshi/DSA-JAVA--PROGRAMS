import java.util.ArrayList;
import java.util.Collections;

public class printReverse {

    public static void swap(ArrayList<Integer>list,int idx1,int idx2)
    {
        int temp=list.get(idx1);
        list.set(idx1,list.get(idx2));//here idx is the Index while .get(idx2) is real value
        list.set(idx2, temp);
    }

    public static void main(String[] args) {
        ArrayList<Integer>list=new ArrayList<>();
        list.add(99);
        list.add(2);
        list.add(3);
        list.add(98);
        list.add(5);

        //reverse print = O(n)
        // for(int i=list.size()-1;i>=0;i--)
        // {
        //     System.out.print(list.get(i)+" ");
        // }

        //maximum value in list
        //Tc is O(n)
        int max=Integer.MIN_VALUE;//stored -ve infinity value in max
        for(int i=0;i<list.size();i++)
        {
            // if(max<list.get(i))
            // {
            //     max=list.get(i);
            // }
            max=Math.max(max, list.get(i));
        }
        // System.out.print("Maximum is "+max);
         System.out.println(list);

        // int idx1=1;
        // int idx2=3;

        // swap(list,idx1,idx2);
        // System.out.println(list);

        Collections.sort(list);//here collections is the class and we should not use collection it is interface
        //above line will sort in ascending order

        System.out.println(list);

        Collections.sort(list,Collections.reverseOrder());//here 2nd parameter is Comparator of java
        //Comparator used  for fnx logic defining
        System.out.println(list);


    }
}
