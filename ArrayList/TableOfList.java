import java.util.ArrayList;

public class TableOfList 
{
    public static void main(String[] args) 
    {
        ArrayList<ArrayList<Integer>>mainList=new ArrayList<>();
        ArrayList<Integer>list1=new ArrayList<>();//() only written to right like constructor of the object
        ArrayList<Integer>list2=new ArrayList<>();
        ArrayList<Integer>list3=new ArrayList<>();
        
        for(int i=1;i<=10;i++)
        {
            list1.add(i*1);
            list2.add(i*2);
            list3.add(i*3);
        }

        mainList.add(list1);
        mainList.add(list2);
        mainList.add(list3);

        list2.remove(3);
        list2.remove(4);

        System.out.println(mainList);

        for(int i=0;i<mainList.size();i++)
        {
            ArrayList<Integer>currList=mainList.get(i);
            for(int v=0;v<currList.size();v++)
            {
                System.out.print(currList.get(v)+" ");
            }
            System.out.println();
        }

       

    }
}
