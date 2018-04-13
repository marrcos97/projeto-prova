public class Strings{
	public static void main(String ... args){
		StringBuffer sb = new StringBuffer();
		sb.append("casa");
		//sb.append("casa").delete(0,1);
		//System.out.println(sb);
		
		System.out.println(sb.substring(0,1));
		
		System.out.println("Marcos e " + 10  + 10);
		System.out.println(10  + 10 + " O Marcos e ");
	}
}