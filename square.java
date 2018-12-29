import java.io.*;
import java.util.*;
import java.lang.Math;
class sqroot
{
   void cal(double a1,double b1,double a2,double b2,double a3,double b3,double a4,double b4)
   {
      double d2,d1;
	  d1=Math.pow(((a1-a3)+(b1-b3)),2);
	  d1=Math.sqrt(d1);
	  d2=Math.pow(((a2-a4)+(b2-b4)),2);
	  d2=Math.sqrt(d2);
	 
	 if(d1==d2)
	 {
		 System.out.println("Yes");
	 }
	 else
	 {
		 System.out.println("No");
     }		 
   }
 }
 class square
 {
    public static void main(String args[])
	{
	    double x1,y1,x2,y2,x3,y3,x4,y4;
	    Scanner ob = new Scanner(System.in);
	    System.out.println("Enter the points :");
		x1=ob.nextInt();
		y1=ob.nextInt();
		x2=ob.nextInt();
		y2=ob.nextInt();
		x3=ob.nextInt();
		y3=ob.nextInt();
		x4=ob.nextInt();
		y4=ob.nextInt();
		sqroot o = new sqroot();
		o.cal(x1,y1,x2,y2,x3,y3,x4,y4);
	}
}
	
