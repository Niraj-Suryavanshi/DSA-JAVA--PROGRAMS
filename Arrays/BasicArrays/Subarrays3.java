
public class Subarrays3 {

    public static void Kadanes(int numbers[])
    {
        int MaxSum=Integer.MIN_VALUE;
        int currSum=0;

        // for(int i=0;i<numbers.length;i++)
        // {
        //     currSum=currSum+numbers[i];
        //     if(currSum<0)
        //     {
        //         currSum=0;
        //     }
        //     MaxSum=Math.max(currSum, MaxSum);
        // }

        int ms,cs;
	    ms=cs=numbers[0]; 
	    for(int i=1;i<numbers.length;i++)
	    {
	        cs=Math.max(numbers[i],cs+numbers[i]);
	        ms=Math.max(cs,ms);
	    }

        System.out.println("Max Sum is: "+ms);
    }
    public static void main(String[] args) 
    {
        int numbers[]={-1,-2,-3,-4};
       
        Kadanes(numbers);
        
    }
}
