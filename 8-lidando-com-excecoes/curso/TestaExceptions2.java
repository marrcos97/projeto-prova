import java.io.*;

class TestaExceptions2{
	
		//Testando checked exceptions
		static void metodo2() throws java.io.IOException{
			InputStream st = new FileInputStream("oi.txt");
		}
		//Testando unchecked exceptions
		static void metodo1(){
			String nome = null;
			//nome.length();
		}
		public static void main(String[]args) throws java.io.IOException{
			metodo1();
			metodo2();
		}
}