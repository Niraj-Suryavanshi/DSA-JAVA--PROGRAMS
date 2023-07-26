import java.util.ArrayList;

public class MutliDList {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>>mainList=new ArrayList<>();//new arraylist initilize the memory for the list //this is multiDlist
        ArrayList<Integer>list=new ArrayList<>();//simple list
        list.add(1);
        list.add(2);
        list.add(3);
        mainList.add(list);

        ArrayList<Integer>list2=new ArrayList<>();//simple list
        list2.add(1);
        list2.add(2);
        list2.add(3);
        mainList.add(list2);

        ArrayList<Integer>list3=new ArrayList<>();//simple list
        list3.add(1);
        list3.add(2);
        list3.add(3);
        mainList.add(list3);

         System.out.println(mainList);

        // for(int i=0;i<mainList.size();i++)
        // {
        //     ArrayList<Integer>curList=mainList.get(i);//this gets list of index 0 and stored in new list
        //     for(int j=0;j<curList.size();j++)
        //     {
        //         System.out.print(curList.get(j)+" ");
        //     }
        //     System.out.println();
        // }

    }
}
