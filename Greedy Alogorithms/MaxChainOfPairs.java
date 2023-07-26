
import java.util.Arrays;
import java.util.Comparator;

public class MaxChainOfPairs {
    public static void main(String[] args) {
        int pairs[][]={{5,24},{39,60},{5,28},{27,40},{50,90}};

        Arrays.sort(pairs, Comparator.comparingDouble(o->o[1]));

        int chainLen=1;
        int chainEnd=pairs[0][1];//stores 1st end of sorted arrays first row

        for(int i=1;i<pairs.length;i++)
        {
            if(pairs[i][0]>chainEnd)
            {
                chainLen++;
                chainEnd=pairs[i][1];
            }
        }

     System.out.println("Max length of chain is:"+chainLen);
    }
}