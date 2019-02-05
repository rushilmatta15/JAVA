import java.util.*;
class testing{
	public static void main(String[] args) {
		
			int x,y,z;
			Scanner in = new Scanner(System.in);
			System.out.println("enter x y z");
			x=in.nextInt();
			y=in.nextInt();
			z=in.nextInt();
			Point3D t= new Point3D();
			t.setxyz(x,y,z);
			for(int i=0 ; i<3 ; i++)
				System.out.println(t.getxyz()[i]);
				}
}

  