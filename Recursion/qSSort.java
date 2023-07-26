public class qSSort {

    int partition(int a[],int l,int h)
    {
        int pivot=a[l];
        int i=l;
        int j=h;
        while(i<j)
        {
            while(i<=j && a[i]<=pivot)
            {
               i++; 
            }
            while(a[j]>pivot)
            {
               j--;
            }
            if(i<j)
            {
                swap(a,i,j);
            }
        }
        swap(a,j,l);
        return j;
    }

    void quickSort(int a[],int l, int h )
    {
        if(l<h)
        {
            int pivot=partition(a,l,h);
            quickSort(a,l,pivot-1);
            quickSort(a,pivot+1,h);

        }

    }
    void swap(int arr[],int i,int j)
    {
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    public static void main(String[] args) {
        qSSort q=new qSSort();
        int arr[]={4,5,2,3,66};
        int n=arr.length;
        q.quickSort(arr,0,n-1); 
        System.out.println(arr.toString());
    }
}
