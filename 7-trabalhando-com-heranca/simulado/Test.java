class Super { 
	static String ID = "QBANK"; 
	// static void chamaFi(){
			
	// }
	int i;
}

class Sub extends Super{
   //static { System.out.print("In Sub"); }
   //i = 1; //nao posso acessar essa variavel do pai aqui de jeito maneira
   //ID = "1";
}
public class Test{
   public static void main(String[] args){
      System.out.println(Sub.ID);
	  System.out.println(new Sub().i);
	  //Sub.chamaFi();
   }
}