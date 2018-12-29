import java.io.*;
import java.util.*;
class p1
{
    public static void main(String args[])
	{
	    int n,i,j=0,len1;
		int len[] = new int[100];
		Scanner ob = new Scanner(System.in);
		n = ob.nextInt();
	    String a[] = new String[1000];
        String s1="";		
		for(i=0;i<n;i++)
		{
		   a[i] = ob.next();
		   len[i] = a[i].length();		   
		}
		len1 = a[0].length();
		for(i=1;i<n;i++)
		{
		   for(j=0;j<len1;j++)
		   {
				     if(a[0].charAt(j)==a[i].charAt(j))
			         { 
						s1 = a[0].substring(0,j+1);
						
			         }
			         else if(i-1==n)
					 {    
				         System.out.println(s1);
			             System.exit(0);
			         }
					 else 
					 {
						 break;
					 }
			}
	    }  
	 System.out.println(s1);
	}
}   
		
