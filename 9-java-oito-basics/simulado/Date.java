import java.time.*;

class TestDate{
	public static void main(String[] args){
		//LocalDate dt = LocalDate.parse("2015-01-01").minusMonths(1).minusDays(1).plusYears(1); 
		LocalDate dt = LocalDate.parse("2015-01-01").plusDays(1).plusDays(1).minusYears(1); 
		System.out.println(dt);
	}
}