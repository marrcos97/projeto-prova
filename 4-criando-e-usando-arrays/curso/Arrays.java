class Arrays{
	public static void main(String[] args){
		//Uma dimensão	
		int [] dados;

		//duas dimensões
		int [][] tabela = new int [2][2];
		
		tabela [0] [0]= 1;
		tabela [0] [1]= 2;
		
		System.out.println(tabela[0][0]);
		System.out.println(tabela[0][1]);
		
		//Três dimensões
		int [][][]cubo = new int [2][2][2];
		
		cubo[0][0][0] = 1;
		
		System.out.println(cubo[0][0][0]);
		
	}
}