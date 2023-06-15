package it.designpatterns.composite;

import java.util.ArrayList;
import java.util.List;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class Book implements ComponentBook {

	private String title;

	private List<String> authors;
	private List<ComponentBook> components = new ArrayList<>();
	private double prezzo;

	// costruttore
	public Book(String t) {
		this.title = t;
	}

	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("Book: " + title);
		components.forEach(component -> component.print());
	}

	@Override
	public int getNumberPage() {
		// TODO Auto-generated method stub
		int numberPage = 0;
		for (ComponentBook component : components) {
			numberPage += component.getNumberPage();
		}
		return numberPage;
	}

	public void addComponents(ComponentBook c) {
		this.components.add(c);
	}

}
