import java.util.*;
class stackmain{
	public static void main(String args[])
	{
		Scanner in= new Scanner(System.in);
		stack s1=new stack();
		int i,x,y;
		do{
			System.out.println("enter 1 to push \n enter 2 to pop \n enter 3 to check size \n enter 4 to display \n");
			y=in.nextInt();
			switch(y)
			{
				case 1:
				{
					System.out.println("enter no.");
					x=in.nextInt();
					s1.push(x);
					break;
				}
				case 2:
				{
					s1.pop();
					break;
				}
				case 3:
				{
					s1.spaceleft();
					break;
				}
				case 4:
				{
					s1.display();
					break;
				}
				default :
				{
					System.out.println("wrong input");
					break;
					
				}
			}
			System.out.println("press 1 to try again");
					i=in.nextInt();
				}
				while (i==1);
			}
		}
	
