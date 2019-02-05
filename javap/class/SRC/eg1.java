import java.util.*;
class eg1{
	public static void main(String[] args) {
		Scanner in =new Scanner(System.in);
		System.out.println("enter first no.");
        int a=in.nextInt();
        System.out.println("enter second no.");
        while(true)
        try{
			int b=in.nextInt();
		    System.out.println(a/b);
		    	break;
		}
		catch(Exception e){
			System.out.println(e);
		}
		
		System.out.println("helloo");

	}
		
	}