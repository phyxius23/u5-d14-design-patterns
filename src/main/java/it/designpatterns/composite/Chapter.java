package it.designpatterns.composite;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Chapter implements ComponentBook {

	// attributi
	private String title;
	private List<ComponentBook> components = new ArrayList<>();

	// costruttore
	public Chapter(String t) {
		this.title = t;
	}

	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("Chapter: " + title);
		components.forEach(component -> component.print());

	}

	@Override
	public int getNumberPage() {
		// TODO Auto-generated method stub
		int numberPage = components.stream().collect(Collectors.summingInt(ComponentBook::getNumberPage));
		return numberPage;
	}

	public void addComponents(ComponentBook c) {
		this.components.add(c);
	}

}
