import java.util.*;
import java.util.List.*;
import java.util.function.*;

class TestaLambda{
	public static void main(String[] args){
			List<String> lista = new ArrayList<>();
			lista.add("Marcos");
			lista.add("Vinicius");
			lista.add("Gomes");
			
			
			Consumer<String> consumidor = s ->  System.out.println(s);
			lista.forEach(consumidor);
			
	}
}
