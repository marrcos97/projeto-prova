import java.util.*;
import java.util.List.*;
import java.util.function.*;

class TestaLambda{
	public static void main(String[] args){
			List<String> lista = new ArrayList<>();
			lista.add("Marcos");
			lista.add("Vinicius");
			lista.add("Gomes");
			
			
			// classe anonima
			//Consumer<String> consumidor = new ComparaStrings();
			// Consumer<String> consumidor = new Consumer<String>(){
					// @Override
					// public void accept(String s){
					// System.out.println(s);
				// }
			// };
			
			//Consumer<String> consumidor = (String s) -> { System.out.println(s);  };
			
			//Como é apenas um parametro  eu posso tirar os () e o tipo
			// Consumer<String> consumidor = (s) ->  System.out.println(s);
			//Consumer<String> consumidor = s -> { System.out.println(s);  };
			
			//Como o metodo tem apenas uma linha de codigo, eu posso tirar as chaves
			//Consumer<String> consumidor = s ->  System.out.println(s);
			
			
			lista.forEach(consumidor);
			//E no final de tudo eu posso passar a expressão como parametro
			//lista.forEach(s ->  System.out.println(s));
	}
}
//@FunctionalInterface

//Implementando do jeito mais rudmentar
// class ComparaStrings implements Consumer<String>{
		// public void accept(String s){
			// System.out.println(s);
		// }
// }