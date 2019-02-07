import java.io.*;
class numread{
	File f=null;
	int[] N;
	void numfileread(){
		try{
			f=new File("data.txt");
			FileReader fin = new FileReader(f);
			BufferedReader bin = new BufferedReader(fin);
			for(int i=0;i<10;i++){
				N[i]=Integer.parseInt(bin.readLine());
			}
		}
		catch(Exception e){}
		for(int i=0;i<10;i++){
			System.out.println(N[i]+" ");
		}
	}
}
class mainclass{
	public static void main(String[] args) {
		numread nr=new numread();
		nr.numfileread();

		
	}
}