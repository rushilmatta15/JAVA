class myexception extends Exception{
	myexception(String s){
		super(s);
	}
}
class checkexception{
	public static void main(String[] args) {
		try{
			throw new myexception("My Own Exception");
		}
		catch(myexception e){
			System.out.println(e);
		}
}
}