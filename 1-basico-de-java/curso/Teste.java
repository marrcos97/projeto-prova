class Teste{

  static int id = 1;
   //testar com variavel não estatica 
  public static void main(String[] args){
	for(new Teste().id  = 10;  new Teste().id < 100; new Teste().id++){
		System.out.println(id);			
	}
	System.out.println(id);			
  }
}