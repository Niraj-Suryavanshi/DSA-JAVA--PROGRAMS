import java.util.Arrays;

public class CountingSort {

    public static void countSort(int arr[])
    {
        int largest=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++)
        {
            largest=Math.max(largest, arr[i]);//finding larget no. for define new array size
        }

        int count[]=new int[largest+1];
        for(int i=0;i<arr.length;i++)
        {
            count[arr[i]]++;
            //above arr[i]th value pass to count[] as index of count[] and increment by 1 so that
            //initial empty array cell of count[] increment by 1 each time 
            // count[i]=Count[i]+1;
        }

        int j=0;
        for(int i=0;i<count.length;i++)
        {
            while(count[i]>0)
            {
                arr[j]=i;//storing values in original array
                j++;
                count[i]--;//decrement the element at count[i] location by 1 like a=5; a--; i.e a=a-1;

            }
        }
    }
    
    public static void main(String[] args) {
    
        int arr[]={1,4,1,3,2,4,3,7};
        System.out.println(Arrays.toString(arr));
        countSort(arr);
        System.out.println(Arrays.toString(arr));
        
    }
}
