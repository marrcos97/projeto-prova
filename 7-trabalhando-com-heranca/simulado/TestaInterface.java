interface PaiInter{
	//int idade;
	int idade = 0;
}

public class TestaInterface implements PaiInter{
		int idade = 10;
		public static void main(String [] args){
			PaiInter pai = new TestaInterface();
			System.out.println(pai.idade);
		}
}