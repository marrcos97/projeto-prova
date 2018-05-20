class Carro{
	final static int totalCarros = 15;
	
	int valor;
	
	static int getTotalCarros(){
		///Não acessao dentro do contexto static
		//valor = 10;
		//this.valor = 10;
		return totalCarros;
	}
	
	// static void setStatic(int num){
			// this.valor =  num;
	// }
	
	static void x(){
		System.out.println("X");
		//Daqui não acesso (Pq é static)
		//y();
	}
	
	void y(){
		System.out.println("Y");
		//Mas daqui eu chamo(Mesmo não sendo static)
		x();
	}
}

class TestaStatic extends Carro{
		public static void main(String[] args){
				System.out.println(Carro.getTotalCarros());
				new Carro().y();
				
		}
}