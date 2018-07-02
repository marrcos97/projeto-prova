class NewException extends Exception {}
class AnotherException extends Exception {}
public class ExceptionTest{
    public static void main(String [] args){
		try{
			
			Short k = 9; 
			Integer i = 9;
			//Não compila
			System.out.println(k == i);
			//Exception e = null;
			Exception e = new Exception();
			throw e;
			//m2();
			//System.out.println("Passei");
			
		}catch(Exception e){
			//O stack todo
			e.printStackTrace();
			
			//Apenas o nome da classe de exceção
			//System.out.println(e);
		}
		
		finally{
			//m3();
			System.out.println("Passei no finally");			
		}
		
		Filha f = new Filha();
		ExceptionTest ef = new Filha();
		f.teste();
		//ef.teste();
		((Filha) ef).teste();
	}     
	public static void m2() throws NewException{  throw new NewException();  }
	public static void m3() throws AnotherException{  throw new AnotherException();}
	public void teste() throws NewException{}
}
class Filha extends ExceptionTest{
	public void teste(){}
}