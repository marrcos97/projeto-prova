abstract class Abstract{
	// public static void main(String [] args){
	// }
	//final void liga(){
	//}
	
	 final abstract void liga();
}
class FilhaAbstract extends Abstract{
	//void liga(){}
}

 // class TestaAbs{
	// abstract void liga();
// }
interface Inter1 {
	void ligaSemChave();
}
interface Inter extends Inter1{
		default void liga(){}
		//Não precisa implementar os metodos novamente
		//void ligaSemChave();
}
class TestaInterface /*implements Inter*/{
		public void liga(){}
}
