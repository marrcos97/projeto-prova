class TestaMetodos{
		public static void main(String[] args){
				//Não funciona
				//System.out.println(a(args.length)[0]);
				testaSwitch(0);
				
		}
		static int a(int n){
					return 1;
		}
		
		static void testaSwitch(final int num){
			final int num1 = 0;
			int  caso = 0;
			switch(caso){
				case num1 : 
						System.out.println("Entrou");
						break;
			}
		}
}