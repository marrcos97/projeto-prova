class Print{
	public static void main(String[] args){
		//System.out.print(78);
		System.out.format("Marcos eh: %s %n","Lindo");
		System.out.format("%s tem %d anos e pesa [%,5.1f klg]","Marcos", 21, 67.5);
		 System.out.printf("%s %n",12); //A
		 System.out.printf("%d ",(short)(byte)(double) 127);
		 System.out.printf("%d ", (int)(double) 127);
		 
		 //>00012.45<
		 System.out.printf(">%08.2f<",12.45);
		 
		 //System.out.printf(">%0,8.2f<",12.45);
		
	}
}