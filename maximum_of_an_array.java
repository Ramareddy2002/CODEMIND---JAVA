import java.util.*;
class main
{
    public static void main(String args[])
    {
        int n,l=0,count=-1;
        float k;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        //k=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
            if(a[i]>count)
            {
                count=a[i];
            }
        }
        //k=sc.nextInt();
       // k=(float)count/n;
       /*for(int i=0;i<n;i++)
    {
     if(((a[i])==k))
     {
        //System.out.print("True");
        l++;
     }
     
    }
    if(l!=0)
    {
    //cout<<count;
    System.out.print("True");
    }
    else
    {*/
       System.out.print(count); 
    
      
       
       
        
    }
}