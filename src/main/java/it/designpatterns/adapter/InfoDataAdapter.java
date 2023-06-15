package it.designpatterns.adapter;

import java.time.LocalDate;
import java.time.Period;
import java.time.ZoneId;

public class InfoDataAdapter implements DataSource {

	private Info info;

	public InfoDataAdapter(Info info) {
		this.info = info;
	}

	@Override
	public String getNomeCompleto() {
		return this.info.getNome() + " " + this.info.getCognome();
	}

	@Override
	public int getEta() {
		LocalDate dataNascita = this.info.getDataDiNascita().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
		LocalDate currentDate = LocalDate.now();

		return Period.between(dataNascita, currentDate).getYears();
	}
}