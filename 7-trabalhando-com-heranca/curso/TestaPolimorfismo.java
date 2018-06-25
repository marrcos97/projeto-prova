class Pai{
	void metodo(double d){
		System.out.println("Double");
	}
}

class Filho extends Pai{
		void metodo(int i){
			System.out.println("int");
		}
}

class TestaPolimorfismo{
		public static void main(String[] args){
			// Pai paiFilho =  new Filho();
			//Filho paiFilho =  new Filho();
			paiFilho.metodo(1);
		}
}