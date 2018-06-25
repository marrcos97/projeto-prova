interface Avo{}
class Pai{}
class Filho extends Pai implements Avo{}

class Teste{
	public static void main(String[] args){
			System.out.println("Testa Cast");

			Pai pai = new Filho();
			Pai paiSozinho = new Pai();

			Pai pai1 = pai;
			
			//Compila e roda
			Filho filho1 = (Filho) pai;
			
			//Compila mas da exception
			//Filho fiho2 = (Filho) paiSozinho;
			
			//Sempre compila com cast, a não ser que  a classe seja final
			//Avo avo = (Avo) new Pai();
			
			Avo avo = new Filho();
			
			//Interfaces são abstratas e não podem ser instanciadas
			///new Avo();
			
			//Filho filhoAvo = new Avo();
			
			if(avo instanceof Filho)
				System.out.println("eh filho");
			else
				System.out.println("nao eh filho");
	}
}