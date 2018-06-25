class TestaWrappers{
	public static void main(String[]args){
		Boolean b1 = new Boolean("verdade");
		Double d1 = new Double(12.5);
		Character c1 = new Character('m');
		Float f1 = new Float(12.6);
		Byte by1 = new Byte("127");
		Integer i1 = new Integer(1);
		Short s1 = new Short("1122");
		
		//Wrappers para primitivo
		int i = i1.intValue();
		char c = c1.charValue();
		System.out.println(c);
		
		//String para primitivo
		String s = "true";
		b1 = Boolean.parseBoolean(s);
		System.out.println(b1);
		
		//primitivo para Wrappers 
		//String para  wrapper
		double d = 12.5;
		d1 = Double.valueOf(d);
		d1 = Double.valueOf("12.6");
		System.out.println(d1);
		
		System.out.println(b1);
		
		int a;
		 System.out.println(a = Integer.parseInt("10",2));
	}
}