/*a file contain 10 numbers
read the noss in an array
sort the numberswrite sorted list in the same file*/
import java.util.*;
import java.io.*;
class list{
	 File f=null;
	 int[] N=new int[10];
	 void numfileread(){
	 try{
	 f= new File("list.txt");
	 FileReader fin=new FileReader(f);
	 BufferedReader bin = new BufferedReader(fin);
	 for(int i=0;i<10;i++){
	 N[i]=Integer.parseInt(bin.readLine());
	 }
	 }
	 catch(Exception e){}
	 for(int i=0;i<10;i++)
	 {
	 System.out.println(N[i]+" ");
	 }
	 }
	 void listsort(){
	 	for(int i=0;i<10;i++){
	 		for(int j=0;j<10;j++){
	 			if(N[i]<N[j]){
	 				int t=N[i];
	 				N[i]=N[j];
	 				N[j]=t;
	 			}
	 		}
	 	}
	 }
	void display(){
		 for(int i=0;i<10;i++)
		 {
		 	System.out.println(N[i]+" ");
		 }	
	 }
	 
	 }
	 class mainlist{
	 public static void main(String args[]){
	 list l1=new list();
	 l1.numfileread();
	 l1.listsort();
	 System.out.println("Sorted list is");
	 l1.display();
	 }
	 }
