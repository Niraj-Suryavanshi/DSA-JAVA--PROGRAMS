public class FriendsPairing {

    public static int fp(int n)
    {
        if(n==1||n==2)
        {
            return n;
        }

        // //choice
        // //single
        // int fnm1=fp(n-1);

        // //pair
        // int fnm2=fp(n-2);
        // int pairWays=(n-1)*fnm2;

        // //totalWays
        // int totWays=fnm1+pairWays;
        // return totWays;

        if(n==1||n==2)
        {
            return n;
        }
        return fp(n-1)+(n-1)*fp(n-2);
    }

    public static void main(String[] args) {
        System.out.println(fp(3));
    }
}
