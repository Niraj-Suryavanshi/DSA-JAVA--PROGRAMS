
public class Subarrays {

    public static void subarray(int arr[])
    {
        int tp=0;
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++)
        { 
            int start=i;
            for(int j=i;j<arr.length;j++)
            {
                int sum=0;
                int end=j;
                for(int k=start;k<=end;k++)
                {
                    // System.out.print(arr[k]+" ");
                    sum+=arr[k];
                }
                System.out.print(sum);
                if(sum>max)
                {
                    max=sum;
                }
                if(sum<min)
                {
                    min=sum;
                }
                System.out.println();
                tp++;
            }
           
            System.out.println();
        }
        System.out.println("max sum is:"+max);
        System.out.println("min sum is:"+min);
        System.out.println("Subarray are:"+tp);
    }

    public static void main(String[] args)
     {
        int arr[]={1,-2,6,-1,3};
        subarray(arr);
    }
    
}
