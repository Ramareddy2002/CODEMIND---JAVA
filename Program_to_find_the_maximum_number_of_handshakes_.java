import java.util.*;
class sample
{
    public static void main(String args[])
    {
        int n,res=0;
        Scanner sc= new Scanner(System.in);
        n= sc.nextInt();
        /*for(int i=n-1;i>=0;i--)
        {
            res=res+(i);
        }*/
        res=(n*(n-1))/2;
        System.out.println(res);
    }
    
}