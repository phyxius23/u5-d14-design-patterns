package it.designpatterns.adapter;

import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class AdapterRunner implements CommandLineRunner {

	@Override
	public void run(String... args) throws Exception {

		Info i = new Info();
		i.setCognome("Rossi");
		i.setNome("Mario");
		i.setDataDiNascita(Date.from(LocalDate.of(1980, 2, 23).atStartOfDay(ZoneId.systemDefault()).toInstant()));

		UserData ud = new UserData();
		ud.getData(new InfoDataAdapter(i));

		System.out.println(ud.getNomeCompleto());
		System.out.println(ud.getEta());

	}

}
