import java.io.*;
import java.util.*;
class FileDemo5
{
	public static void main(String[] args) 
	{
		File f=null;
		try
		{
			f = new File ("File2.txt");
            FileWriter fout = new FileWriter(f);
            BufferedWriter bout= new BufferedWriter(fout);
	     Scanner sc = new Scanner(System.in);
             System.out.print("\nEnter a String:");
             // int sn=sc.nextInt();
             //sssut.write(sn+"\t");
 	     		String fname=sc.nextLine();
 	     		bout.write(fname+"\t");
 	     		Double cgpa=sc.nextDouble();
 	     		bout.write(cgpa+"\t");
 	     		char grade=sc.next().charAt(0);
 	     		bout.write(grade+"");
 	     	bout.close();
 	     	FileReader fin = new FileReader(f);
	      BufferedReader bin= new BufferedReader(fin);
 	      String sr;
	      System.out.println("The contents of the file are: ");	
		 while((sr=bin.readLine())!=null){
                         System.out.println(sr);
			} 

		}	
		catch (Exception e) {
         // if any I/O error occurs
         e.printStackTrace();
      } 
      	}
}