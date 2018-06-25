class TestaExceptions{
		public static void main(String [] args){
				try{
					String nome = null;
					nome.toLowerCase();
				}catch(Throwable e){
					System.out.println("Erro");
				}
				
		}
}