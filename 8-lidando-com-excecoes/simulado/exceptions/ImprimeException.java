package exceptions;
class ImprimeException{
		public static void main(String[] args){
			//System.out.println("Ola pacotes");
			try{
				hello();
			}catch(MyException me){
				System.out.println(me);
			}
			
		}
		static void hello()throws MyException{
			int[] dear =  new int[7];
			dear[0] = 747;
			foo();
		}
		
		static void foo()throws MyException{
			throw new MyException("Exception from foo");
		}
}
class MyException extends Exception{
	public MyException(String msg){
		super(msg);
	}
}
