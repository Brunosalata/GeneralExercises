package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Date;
import java.util.TimeZone;

public class Program {

	public static void main(String[] args) throws ParseException {

		SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");
		SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		SimpleDateFormat sdf3 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		sdf3.setTimeZone(TimeZone.getTimeZone("GMT"));

		Date x1 = new Date();									// Instanciar uma data atual, data de agora
		Date x2 = new Date(System.currentTimeMillis());			// Outra opção para data no momento atual
		Date x3 = new Date(0L);									// Tempo zero da classe
		Date x4 = new Date(1000L * 60L * 60L * 5L);
		
		Date y1 = sdf1.parse("25/06/2018");
		Date y2 = sdf2.parse("25/06/2018 15:42:07");
		Date y3 = Date.from(Instant.parse("2018-06-25T15:42:07Z"));		// Data impressa no padrão UTC
		
		//System.out.println(y1);										// Mon Jun 25 00:00:00 BRT 2018			padrão de impressão do java
		//System.out.println(y2);										// Mon Jun 25 15:42:07 BRT 2018
		
		//System.out.println(sdf2.format(y1));							// 25/06/2018 00:00:00					Formato de impressão definido em sdf2 
		//System.out.println(sdf2.format(y2));							// 25/06/2018 15:42:07
		
		System.out.println("----------------------");				// Sem .format
		System.out.println("x1: " + x1);								// x1: Fri Apr 29 20:22:36 BRT 2022		impressão da data e hora no momento
		System.out.println("x2: " + x2);								// x2: Fri Apr 29 20:22:36 BRT 2022		impressão da data e hora no momento
		System.out.println("x3: " + x3);								// x3: Wed Dec 31 21:00:00 BRT 1969		data mais antiga registrada na classe Date
		System.out.println("x4: " + x4);								// x4: Thu Jan 01 02:00:00 BRT 1970
		System.out.println("y1: " + y1);								// y1: Mon Jun 25 00:00:00 BRT 2018		formato sdf2 concatenado
		System.out.println("y2: " + y2);								// y2: Mon Jun 25 15:42:07 BRT 2018
		System.out.println("y3: " + y3);								// y3: Mon Jun 25 12:42:07 BRT 2018
		
		System.out.println("----------------------");				// No padrão UTF (usando o sistema da máquina)
		System.out.println("x1: " + sdf2.format(x1));					// x1: 29/04/2022 20:22:36				impressão da data e hora no momento
		System.out.println("x2: " + sdf2.format(x2));					// x2: 29/04/2022 20:22:36				impressão da data e hora no momento
		System.out.println("x3: " + sdf2.format(x3));					// x3: 31/12/1969 21:00:00				data mais antiga registrada na classe Date
		System.out.println("x4: " + sdf2.format(x4));					// x4: 01/01/1970 02:00:00
		System.out.println("y1: " + sdf2.format(y1));					// y1: 25/06/2018 00:00:00				formato sdf2 concatenado
		System.out.println("y2: " + sdf2.format(y2));					// y2: 25/06/2018 15:42:07
		System.out.println("y3: " + sdf2.format(y3));					// y3: 25/06/2018 12:42:07
		
		System.out.println("----------------------");				// No padrão GMT (fuso de Greenwich)										
		System.out.println("x1: " + sdf3.format(x1));					// x1: 29/04/2022 23:22:36				impressão da data e hora no momento
		System.out.println("x2: " + sdf3.format(x2));					// x2: 29/04/2022 23:22:36				impressão da data e hora no momento
		System.out.println("x3: " + sdf3.format(x3));					// x3: 01/01/1970 00:00:00				data mais antiga registrada na classe Date
		System.out.println("x4: " + sdf3.format(x4));					// x4: 01/01/1970 05:00:00
		System.out.println("y1: " + sdf3.format(y1));					// y1: 25/06/2018 03:00:00				formato sdf3 concatenado
		System.out.println("y2: " + sdf3.format(y2));					// y2: 25/06/2018 18:42:07
		System.out.println("y3: " + sdf3.format(y3));					// y3: 25/06/2018 15:42:07
	}

}
