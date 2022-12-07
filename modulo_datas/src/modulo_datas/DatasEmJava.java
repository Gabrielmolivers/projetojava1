package modulo_datas;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Calendar;
import java.util.Date;

public class DatasEmJava {
	
	public static void main(String[] args) throws ParseException {
		
		Calendar calendar = Calendar.getInstance();
		
		Date date = new Date();
		
		System.out.println(date.getTime());
		System.out.println("Calendar" + calendar.getTimeInMillis());
		
		System.out.println("Dia do Mês: " + date.getDate());
		System.out.println("Calendar Mes " + calendar.get(Calendar.DAY_OF_MONTH));
		
		System.out.println("Dia da Semana: " + date.getDay());
		System.out.println("Calendar Semana " + (calendar.get(Calendar.DAY_OF_WEEK) - 1));
		
		System.out.println("Horas: " + date.getHours());
		System.out.println("Calendar Hora " + calendar.get(Calendar.HOUR_OF_DAY));
		
		System.out.println("Minutos: " + date.getMinutes());
		System.out.println("Calendar Minutos " + calendar.get(Calendar.MINUTE));
		
		System.out.println("Segundos: " + date.getSeconds());
		System.out.println("Calendar Segundos " + calendar.get(Calendar.SECOND));
		
		System.out.println("Ano: " + (date.getYear() + 1900));
		System.out.println("Calendar Ano " + calendar.get(Calendar.YEAR));
		
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		
		System.out.println("Data atual: " + simpleDateFormat.format(date));
		System.out.println("Calendar Data atual: " + simpleDateFormat.format(calendar.getTime()));
		
		simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		
		System.out.println("Data para banco de Dados: " + simpleDateFormat.format(date));
		
		System.out.println("Objeto Date " + simpleDateFormat.parse("1987-10-18 20:10:51"));
		
		/*Comparacao de datas*/
		
		SimpleDateFormat simplesDateFormat = new SimpleDateFormat("dd/MM/yyyy");
		
		Date dataVencimentoBoleto = simplesDateFormat.parse("10/04/2021");
		
		Date dataAtualHoje = simplesDateFormat.parse("11/04/2021");
		
		if (dataVencimentoBoleto.after(dataAtualHoje)) {
			System.out.println("Boleto não vencido");
		}else {
			System.out.println("Boleto vencido - URGENTE");
		}
		
		
		
		long dias = ChronoUnit.DAYS.between(LocalDate.parse("2022-09-18"), LocalDate.now());
		
		System.out.println("Faz " + dias + " dias desde meu aniversário de 24 anos");
		
		
		
		
	}

}
