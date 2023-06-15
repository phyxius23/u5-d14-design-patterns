package it.designpatterns.adapter;

public class UserData implements DataSource {

	// attributi
	private String nomeCompleto;
	private int eta;

	// costruttore
	public void getData(DataSource ds) {
		nomeCompleto = ds.getNomeCompleto();
		eta = ds.getEta();
	}

	@Override
	public String getNomeCompleto() {
		return nomeCompleto;
	}

	@Override
	public int getEta() {
		return eta;
	}

}
