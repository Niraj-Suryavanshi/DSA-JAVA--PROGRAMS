public class StarPattern
{
    public static void main(String[] args)
     {
        // char ch='A';
        // int n=5;

        // *
        // **
        // ***
        // ****
        // *****

        // for(int i=1;i<=n;i++)
        // {
        //     for(int j=1;j<=i;j++)
        //     {
        //         System.out.print("*");
        //     }

        //     System.out.println();
        // }


        // *****
        // ****
        // ***
        // **
        // *

        // for(int i=1;i<=n;i++)
        // {
        //     for(int j=1;j<=n-i+1;j++)
        //     {
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }

        // 1
        // 12
        // 123
        // 1234
        // 12345

            // for(int i=1;i<=n;i++)
            // {
            //     for(int j=1;j<=i;j++)
            //     {
            //         System.out.print(j);
            //     }
            //     System.out.println();
            // }

         
            // A
            // BC
            // DEF
            // GHIJ
            // KLMNO

        // for(int i=1;i<=n;i++)
        // {
        //     for(int j=1;j<=i;j++)
        //     {
        //         System.out.print(ch);
        //         ch++;
        //     }
        //     System.out.println();
        // }

        // int row=4;
        // int col=5;

        // * * * * * 
        // *       * 
        // *       * 
        // * * * * *   


        // for(int i=1;i<=row;i++)
        // {
        //     for(int j=1;j<=col;j++)
        //     {
        //         if(i==1 || i==row || j==1||j==col)
        //         {
        //             System.out.print("* ");
        //         }
        //         else
        //         {
        //             System.out.print("  ");
        //         }
                
        //     }
        //     System.out.println();
        // }

    //    int n=4;
    //     *
    //    **
    //   ***
    //  ****
    //    for(int i=1;i<=n;i++)
    //    {
    //         for(int j=1;j<=n-i;j++)
    //         {
    //             System.out.print(" ");
    //         }
    //         for(int j=1;j<=i;j++)
    //         {
    //             System.out.print("*");
    //         }

    //         System.out.println();
    //    }

        // int n=5;
        
        // 1 2 3 4 5 
        // 1 2 3 4 
        // 1 2 3 
        // 1 2 
        // 1 

        // for(int i=1;i<=n;i++)
        // {
        //     int a=1;
        //     for(int j=1;j<=n-i+1;j++)
        //     {
        //         System.out.print(a++ +" ");
        //     }

        //     System.out.println();
        // }

        // int n=5;
        // int a=1;

        // 1 
        // 2 3 
        // 4 5 6 
        // 7 8 9 10 
        // 11 12 13 14 15

        // for(int i=1;i<=n;i++)
        // {
        //     if(i!=5)
        //     {
        //         for(int j=1;j<=i;j++)
        //         {
        //             System.out.print(a++);
        //             System.out.print("  ");
        //         }
        //     }
        //     else
        //     {
        //         for(int j=1;j<=i;j++)
        //         {
        //             System.out.print(a++);
        //             System.out.print(" ");
        //         }
        //     }
           
        //     System.out.println();
        // }

    //     int n=5;

    //      1 
    //     2 2 
    //    3 3 3 
    //   4 4 4 4 
    //  5 5 5 5 5 

    //     for(int i=1;i<=n;i++)
    //     {
    //         for(int j=1;j<=n-i;j++)
    //         {
    //             System.out.print(" ");
    //         }
    //         for(int j=1;j<=i;j++)
    //         {
    //             System.out.print(i+ " ");
    //         }
           
    //         System.out.println();
    //     }

        // int n=5;

        // 1
        // 01
        // 101
        // 0101
        // 10101

        // for(int i=1;i<=n;i++)
        // {
        //     for(int j=1;j<=i;j++)
        //     {
        //         if((i+j)%2==0)
        //         {
        //             System.out.print(1);
        //         }
        //         else
        //         {
        //             System.out.print(0);
        //         }
        //     }
        //     System.out.println();
        // }

        // int n=4;

        // *      *
        // **    **
        // ***  ***
        // ********
        // ********
        // ***  ***
        // **    **
        // *      *

        // for(int i=1;i<=n;i++)
        // {
        //     for(int j=1;j<=i;j++)
        //     {
        //         System.out.print("*");
        //     }

        //     for(int j=1;j<=2*(n-i);j++)
        //     {
        //         System.out.print(" ");
        //     }


        //     for(int j=1;j<=i;j++)
        //     {
        //         System.out.print("*");
        //     }

        //     System.out.println();
        // }

        // for(int i=n;i>=1;i--)
        // {
        //     for(int j=1;j<=i;j++)
        //     {
        //         System.out.print("*");
        //     }

        //     for(int j=1;j<=2*(n-i);j++)
        //     {
        //         System.out.print(" ");
        //     }


        //     for(int j=1;j<=i;j++)
        //     {
        //         System.out.print("*");
        //     }

        //     System.out.println();
        // }

    //     int n=5;

    //      * * * * * 
    //     * * * * * 
    //    * * * * * 
    //   * * * * * 
    //  * * * * * 

    //     for(int i=1;i<=5;i++)
    //     {
    //         for(int j=1;j<=n-i;j++)
    //         {
    //             System.out.print(" ");
    //         }
    //         for(int j=1;j<=n;j++)
    //         {
    //             System.out.print("* ");
    //         }

    //         System.out.println();
    //     }

            // int n=4;

        //       * 
        //     * * * 
        //   * * * * * 
        // * * * * * * * 
        // * * * * * * * 
        //   * * * * * 
        //     * * * 
        //       * 
            // for(int i=1;i<=n;i++)
            // {
            //     for(int j=1;j<=n-i;j++)
            //     {
            //         System.out.print("  ");
            //     }
                // for(int j=1;j<=i;j++)
                // {
                //     System.out.print("* ");
                // }
                // for(int j=1;j<=i-1;j++)
                // {
                //     System.out.print("* ");
                // }

            //     for(int j=1;j<=(2*i)-1;j++)
            //     {
            //         System.out.print("* ");
            //     }

            //     System.out.println();
            // }

            // for(int i=n;i>=1;i--)
            // {
            //     for(int j=1;j<=n-i;j++)
            //     {
            //         System.out.print("  ");
            //     }
                // for(int j=1;j<=i;j++)
                // {
                //     System.out.print("* ");
                // }
                // for(int j=1;j<=i-1;j++)
                // {
                //     System.out.print("* ");
                // }

            //     for(int j=1;j<=(2*i)-1;j++)
            //     {
            //         System.out.print("* ");
            //     }

            //     System.out.println();
            // }

            // int n=5;

            //                 *  *  *  *  *  
            //             *           *  
            //         *           *  
            //     *           *  
            // *  *  *  *  * 

            // for(int i=1;i<=n;i++)
            // {
            //     for(int j=1;j<=n-i;j++)
            //     {
            //         System.out.print("   ");
            //     }

            //     for(int j=1;j<=n;j++)
            //     {
            //         if(i==1 || i==n ||j==1 ||j==n)
            //         {
            //             System.out.print("*  ");
            //         }
            //         else
            //         {
            //             System.out.print("   ");
            //         }
            //     }
            //     System.out.println();
            // }

    }
}
