package com.pluralsight.springapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SimpleSpringAppApplication implements CommandLineRunner {
	@Autowired
	private FunkPopDAO funkPopDAO;

	public static void main(String[] args) {

		SpringApplication.run(SimpleSpringAppApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
	//System.out.println(funkPopDAO.getFunkoByID());
		FunkoPops myFavoriteFunkoPop = createFavoriteFunkoPop("MyFavoriteFunkoPop");
		System.out.println("Created FunkoPop: " + myFavoriteFunkoPop.toString());
	}
	private FunkoPops createFavoriteFunkoPop(String name) {
		FunkoPops favoriteFunkoPop = new FunkoPops();
		return funkPopDAO.getFunkoByID(favoriteFunkoPop);
	}
}
