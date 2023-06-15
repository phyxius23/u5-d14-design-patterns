package it.designpatterns.composite;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class CompositeRunner implements CommandLineRunner {

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		Page p1 = new Page(1);
		Page p2 = new Page(2);
		Page p3 = new Page(3);
		Page p4 = new Page(4);

		Chapter s1 = new Chapter("s1");
		Chapter s2 = new Chapter("s2");

		Book l1 = new Book("l1");

		s1.addComponents(p1);
		s1.addComponents(p2);
		s1.addComponents(p3);

		s2.addComponents(p4);

		l1.addComponents(s1);
		l1.addComponents(s2);

		l1.print();
	}

}
