public class Operadores{
	public static void main(String []args){
		    int a = 10;
			
			//a += a + ++a + a + a++;
			//10
			//10  + 10 
			//10 + 10  + 11
			//10  + 10 + 11 + 10 
			//10  + 10 + 11 + 10 + 12
			//53			
			
			//a = ++a + a;
			//10
			// 10 = 11
			//11+ 11
			//22
			
			//a = a++ + ++a;
			//10
			//10 = 10
			//11+ 11
			//22
			
			//a = ++a;
			//11
			
			//a += a++;
			//20
			
			//a += ++a;
			//21
			
			//a = ++a + a;
			//11
			//11+ 11
			//21
			
			//a = a++ + ++a + a + a;
			//10
			// 10 = 11 + 11
			// 22
			//	22+ 12 + 12
			//46
			
			//a += a++ + ++a + a + a;
			//56
			
			//a += a;
			a += a;
			
			//Operador condicional ternario
			a = a > 10 ? 30 : 10;
			
			System.out.println(a);
			System.out.println("Ola");
	}
}