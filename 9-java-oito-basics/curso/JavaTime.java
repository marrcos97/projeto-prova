import java.time.*;
import java.time.temporal.*;
import java.util.*;
import java.time.format.*;

class JavaTime{
	public static void main(String [] args){
		LocalDate ld =  LocalDate.now();
		LocalDate anoPassado =  LocalDate.of(2017,05,28);
		LocalDateTime ldt = LocalDateTime.now();
		LocalTime lt = LocalTime.now();
		
		ldt.get(ChronoField.DAY_OF_WEEK);
		ldt.get(ChronoField.DAY_OF_WEEK);
		
		System.out.println(ld);
		System.out.println(ldt);
		System.out.println(lt);
		System.out.println(ldt.get(ChronoField.DAY_OF_MONTH));
		
		//Entre LocalDateTimes
		System.out.println(ChronoUnit.YEARS.between(anoPassado,ldt));
		Period tempoDeVida = Period.between(anoPassado,ld);
		System.out.println("Period " + tempoDeVida.getYears());
		System.out.println("Period " + tempoDeVida.getDays());
		
		//Diminuindo e aumentando o tempo
		System.out.println(ldt.minus(4 , ChronoUnit.DAYS));
		System.out.println(ldt.minus(4 , ChronoUnit.YEARS));
		System.out.println(ldt.plus(4,ChronoUnit.YEARS).plus(5,ChronoUnit.WEEKS));
		
		//Trasformando Date em LocalDateTime
		Date date = new Date();
		Instant i = date.toInstant();
		ldt  =  LocalDateTime.ofInstant(i, ZoneId.systemDefault());
		
		//Transformando LocalDateTime em Date
		Instant i2 = ldt.toInstant(ZoneOffset.UTC); 
		Date date1 = Date.from(i2);
		
		//Construindo um Calendar
		Calendar cal = Calendar.getInstance();
		cal.setTime(date1);
		
		//Duração de tempo entre periodos 
		//Instant
		
		Instant in =  Instant.now();
		Duration dur = Duration.ofSeconds(10);
		Instant in2 = i.plus(dur);
		
		System.out.println(in);
		System.out.println(in2);
		
		Instant in3 = Instant.EPOCH;
		long duracao = Duration.between(in3, in).getSeconds();
		System.out.println(duracao);
		
		//Formatador de datas
		LocalDateTime ldtFormat = LocalDateTime.now();
		
		DateTimeFormatter formatter =  DateTimeFormatter.ofPattern("dd/MM/yyyy");
		System.out.println(formatter.format(ldtFormat));
		
		//String para DateFormat (Lembrar de parsear)
		LocalDate dataParseada = LocalDate.parse("28/05/2018",formatter);
		System.out.println(formatter.format(dataParseada));
		
		
		System.out.println(YearMonth.now().isSupported(
        ChronoUnit.MONTHS));
    System.out.println(YearMonth.now().isSupported(
        ChronoField.DAY_OF_MONTH));
    System.out.println(MonthDay.now().isSupported(
        ChronoField.DAY_OF_MONTH));
    System.out.println(LocalDate.now().isSupported(
        ChronoUnit.DAYS));
    System.out.println(LocalDate.now().isSupported(
        ChronoUnit.YEAR)); 
    System.out.println(LocalDateTime.now().isSupported(
        ChronoField.HOUR_OF_AMPM));
    System.out.println(LocalDateTime.now().isSupported(
        ChronoField.YEAR));
	}
}