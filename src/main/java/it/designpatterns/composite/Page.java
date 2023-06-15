package it.designpatterns.composite;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Page implements ComponentBook {

	// attributi
	private int numberPage;
	private String content;

	// costruttore
	public Page(int np) {
		this.numberPage = np;
	}

	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("Page: " + numberPage);
	}

	@Override
	public int getNumberPage() {
		// TODO Auto-generated method stub
		return 1;
	}

}
