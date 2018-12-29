import java.io.*;
import java.util.*;
import java.lang.String;
class sub 
{
    void cal(String a1)
	{
	  int len,i=1,j,i1=1,n=0,j1=0,temp;
	  String b[] = new String[1000];
	  int len1[] = new int[1000];
	  len=a1.length();
	             lab:
	                for(i=i;i<len;i++)
                    {
                      for(j=i-1;j>=j1 && j<=i1;j--)
                      {    				  
                			if(a1.charAt(i)==a1.charAt(j))
                            {
									 i=j+1;j1=j+1;
									 n++;
									 continue lab;
                            }									 
			                else if(j==j1)
                            {
					    	 
                               b[n] = a1.substring(j1,i+1);
							   i1++;
                            }	
					  }
				 }
				 len1[0] = b[0].length();
				 temp = len1[0];
				 for(i=0;i<=n;i++)
				 {
					 len1[i] = b[i].length();
					 if(temp<len1[i])
					 {
						 temp =len1[i];
				     }
				 }
			     System.out.println(temp);
		        
	}
}
	
	
class substring
{
     public static void main(String args[])
	 {
		                String a;
		                Scanner ob = new Scanner(System.in);
		                System.out.println("Enter the String :\t");
						a = ob.next();
						sub o=new sub();
						o.cal(a);	
						
	}					
}
