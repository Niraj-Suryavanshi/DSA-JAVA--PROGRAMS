public class PracticeTwoD
{
    public static void main(String[] args) 
    {
      
        //1.program to find count of a number in 2d array
        
    //     int[][] arr= { {4,7,8}, {8,8,7} };

    //     int countOf7=0;
    //     for(int i=0;i<arr.length;i++)
    //     {
    //         for(int j=0;j<arr[0].length;j++)
    //         {
    //             if(arr[i][j]==7)
    //             {
    //                 countOf7++;
    //             }
    //         }
    //     }

    //   System.out.println("Count of 7 is: "+countOf7);

    //2.program to find sum of a 2nd row in 2d array

    int [][]nums={{1,2,3},{4,5,6},{12,22,33}};
    int sum=0;

    for(int j=0;j<nums[0].length;j++)
    {
        sum+=nums[1][j];
    }

    System.out.println("Sum is :"+sum);


    }
}