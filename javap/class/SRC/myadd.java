import java.util.*;
    class myadd{
       int x;
       int y;
       myadd(int a,int b)
       { 
       	   x=a;
       	   y=b;
       }
       myadd()
       {
       	  x=0;
       	  y=0;

       	}
       	int sum()
       	{
       		return x+y;
       	}
      }

      class myaddmain
      {
      	public static void main(String[] args) {
      		Scanner in=new Scanner(System.in);
      		int f,l,z;
      		System.out.println("enter x");
      		f=in.nextInt();
      		System.out.println("enter y");
      		l=in.nextInt();
      		myadd e1 = new myadd(f,l);
      		z=e1.sum();
      		System.out.println("sum is "+z);
      		myadd e2 = new myadd();
      		z=e2.sum();
      		System.out.println("sum is "+z);
      	}
      		
      	}
       
       