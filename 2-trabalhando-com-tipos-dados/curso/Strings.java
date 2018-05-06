public class Strings{
	public static void main(String ... args){
		StringBuffer sb = new StringBuffer();
		sb.append("casa");
		//sb.append("casa").delete(0,1);
		//System.out.println(sb);
		
		System.out.println(sb.substring(0,1));
		
		System.out.println("Marcos e " + 10  + 10);
		System.out.println(10  + 10 + " O Marcos e ");
		
		String a1 = new String("Marcos");
		String a2 = new String("Marcos");
		System.out.println(a1 == a2);
		System.out.println(a1.equals(a2));
		
		String a3 = "sa";
		System.out.println(a3.substring(1,2));
		
		Carro c1 = new Carro();
		Carro c2 = new Carro();
		c1.preco = "1";
		c2.preco = "2";
		
		System.out.println(c1.equals(c2));
		
	}
}
class Carro{
	String preco;
	
	public boolean equals(Object o){
		Carro outro = (Carro) o;
		return this.preco.equals(outro.preco);
	}
}