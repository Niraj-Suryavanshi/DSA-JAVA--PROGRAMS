
public class BinarySearch
{
    public static int bSearch(int arr[],int start,int end,int target)
    {
        
        while(start<=end)
        {
            int mid=(start+end)/2;
            if(arr[mid]==target)
            {
                return mid;
            }
            
            if(arr[mid]>target)
            {
                end=mid-1;
            }
            else
            {
                start=mid+1;
            }
        }

        return -1;
    }

    public static void main(String[] args) 
    {
        int arr[]={32,33,54,65,787,8888};
        int index=bSearch(arr,0,arr.length-1,10);
        System.out.println(index);
    }
}