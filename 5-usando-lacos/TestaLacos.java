public class TestaLacos{
		public static void main(String[] args){
		//marcos:
		//vinicius:
		//gomes:for(int i = 0; i<10;i++){
		//		if(i == 2)break vinicius;
		//		System.out.println("Oloco" + i);
		//}
		//int i = 0;
		//marcos: do {
		//i++;
		//if(i == 2)break marcos;
		//System.out.println("oloco: " + i);
		//}while(i <10);
		//
        //ra: for(int a=0;a<30;a++)
        //r(int b=0;b<1;b++)
        //(a+b==25) continue fora;
        //se if(a+b==20) break;
        //se System.out.println(a);
        //
		//0;
		//hile(i<10)
		// if(i>5){
		//	 System.out.println("oi");
		//	 i++;
		// }		
		// else{
		//	System.out.println("tchau");
		//	i++;
		// }	
			 
		int a = args.length;
        int i = 0;
        switch(a) {
            case 0:
            case 1:
            for(i=0;i<15;i++, System.out.println(i))
            if(i==5) continue;
            if(i==15) break;
            case 2:
            System.out.println("2");
        }
        System.out.println("fim");
		}
		
		//for(i=0;i<15;i++){
		//		if(i==5) continue;{
		//			System.out.println(i);
		//		}
		//	}
}