import java.util.ArrayList;
import java.util.Iterator;

class TesteArrayList{
	public static void main(String[] args){
		ArrayList<String> nomes = new ArrayList<>();
		nomes.add("Marcos");
		nomes.add("Vinicius");
		
		Iterator<String> it = nomes.iterator();
		
		while(it.hasNext()){
			System.out.println(it.next());
			if(it.equals("Marcos")){
				it.remove();
			}
		}
		while(it.hasNext()){
			System.out.println(it.next());
		}
	}
}