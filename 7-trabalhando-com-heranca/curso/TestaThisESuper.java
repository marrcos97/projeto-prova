class Pai{
	String nome;
	Pai(){}
	Pai(String i){}
}
class Filho extends Pai{
	Filho(){}
	Filho(int i, String s){
		//Ambos funcionam
		super.nome = s;
		//this.nome= s;
	}
}
class TesteThis{
	public static void main(String [] args){
			Pai pai = new Filho(1,"Marcos");
			System.out.println(pai.nome);
	}
}