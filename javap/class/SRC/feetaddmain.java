import java.util.*;
class feetaddmain{
	public static void main(String[] args) {
    Scanner in= new Scanner(System.in);
    float f,i,f1,i1,z;
    System.out.println("enter feet val");
    f=in.nextInt();
    System.out.println("enter inches value");
    i=in.nextInt();
    System.out.println("enter second feet val");
    f1=in.nextInt();
    System.out.println("enter second inches val");
    i1=in.nextInt();
    feetadd d3=new feetadd();
    feetadd d1=new feetadd(f,i);
    d3=d1.displaysum(d3);
    feetadd d2= new feetadd(f1,i1);
    d3=d2.displaysum(d3);
    System.out.println(d3.x+ " "+d3.y);		
	}
}