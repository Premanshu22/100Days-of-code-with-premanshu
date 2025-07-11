public class Main{
    public static void main(String[]args)
    {
        System.out.println("Pattern 1");
        pattern1(4);
        System.out.println();
        
        System.out.println("Pattern 2");
        pattern2(4,5);
        System.out.println();

        System.out.println("Pattern 3");
        pattern3(4);
        System.out.println();

        System.out.println("Pattern 4");
        pattern4(4);
        System.out.println();

        System.out.println("Pattern 5");
        pattern5(5);
        System.out.println();

        System.out.println("Pattern 6");
        pattern6(5);
        System.out.println();
    }

    static void pattern1(int n)
    {
        for(int row=1; row <= n; row++)
        {
            for(int col=1; col<=row; col++)
            {
                System.out.print("* ");
            }
            
            //
            System.out.println();
        }
    }

    static void pattern2(int n, int m)
    {
        //outer loop
        for(int i=1; i<=n; i++)
        {
            //inner loop
            {
                for(int j=1; j<=m ; j++)
                {
                    if(i==1 || j==1 || i==n || j==m)
                    {
                        System.out.print("*");
                    }
                    else{
                        System.out.print   (" ");
                    }
                }
            }
            System.out.println();
        }
    }


    static void pattern3(int n)
    {
         for(int i=n; i>=1; i--)
         {
            for(int j=1; j<=i; j++)
            {
                System.out.print("*");
            }

            System.out.println();
         }
    }


    static void pattern4(int n)
    {
         for(int i=1; i<=n; i++ )
         {
            //inner loop 1 --space print
            for(int j=1; j<=n-i; j++)
            {
                System.out.print(" ");
            }

            //inner loop 2 --star print
            for(int j=1; j<=i; j++)
            {
                System.out.print("*");
            }

            System.out.println();
         }
    }


    static void pattern5(int n)
    {
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }


    static void pattern6(int n)
    {
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=n-i+1;j++)
            {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }

}