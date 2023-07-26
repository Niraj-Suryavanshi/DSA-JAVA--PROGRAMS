import java.util.Arrays;

import java.util.Collections;

public class SortingAlgorithms {

    public static void swap(int arr[],int i,int j)
    {
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }

    public static void printArray(int arr[])
    {
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]);
        }
        System.out.println();
    }

    public static void bubbleSort(int arr[])
    {
        for(int turn=0;turn<arr.length-1;turn++)
        {
            for(int j=0;j<arr.length-1-turn;j++)//swapped each adjacent element and last element will sort first
            {
                if(arr[j]>arr[j+1])
                {
                    swap(arr,j,j+1);
                }
            }
        }
    }

    public static void selectionSort(int arr[])
    {
        for(int i=0;i<arr.length-1;i++)//we have to swapped only upto last second element
        {
            int minPos=i;
           
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[minPos]>arr[j])
                {
                    minPos=j;
                }
                //we are just finding the array element position with minimum value
                //so we can replace it with i'th element and array will sort form first position
            }
            swap(arr,minPos,i);//here we swapping with ith and minimum element
        }
    }

    public static void insertionSort(int arr[])
    {
        for(int i=1;i<arr.length;i++)
        {
            int curr=arr[i];
            int prev=i-1;
            while(prev>=0 && arr[prev]>curr)
            {
                arr[prev+1]=arr[prev];
                prev--;
            }
            arr[prev+1]=curr;
        }
    }

 
    public static void main(String[] args) {
    
        // int arr[]={5,4,3,1,4};
        // printArray(arr);
        // bubbleSort(arr);
        // selectionSort(arr);
        // insertionSort(arr);
        // Arrays.sort(arr,0,2);//last index not include only index-1
        Integer arrr[]={5,4,3,1,4};
        Arrays.sort(arrr,0,3,Collections.reverseOrder());
        System.out.println(Arrays.toString(arrr));
        

        // printArray(arr);
    }
}
