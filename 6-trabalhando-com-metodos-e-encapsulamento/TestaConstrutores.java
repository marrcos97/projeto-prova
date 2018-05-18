class TestaConstrutores{
		public static void main(String [] args){
					new B();
		}
}
class A{
		A(){
			a();
		}
		void a(){
			System.out.println("Chamei o A da Classe A");
		}
}

class B extends A{
		void a(){
			System.out.println("Chamei o A da Classe B");
		}
}