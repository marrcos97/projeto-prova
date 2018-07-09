class TestaLacos{
	public void TestaLacos(int x){
		marcos :
		try{
				
				 System.out.println("oi  meninas");	
				for(int i =0;i<1;i++){
					if(i == 0)break marcos;
				}
			
		}catch(Exception e){
			System.out.println("Peguei");
		}
		finally{
			System.out.println("Finalmente");
		}
	}
	public static void main(String [] args){
		int x = 0;
		float f= 123;
		//while (false) { x=3; }
			TestaLacos tc = new TestaLacos();
			tc.TestaLacos(x);
		if(false){
			x =3;
		}
	}
}