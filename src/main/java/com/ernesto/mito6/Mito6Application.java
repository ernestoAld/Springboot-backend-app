package com.ernesto.mito6;

import com.ernesto.mito6.models.Category;
import com.ernesto.mito6.repositories.ICategoryRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;

@SpringBootApplication
public class Mito6Application implements CommandLineRunner {

	@Autowired
	private ICategoryRepo repo;

	public static void main(String[] args) {
		SpringApplication.run(Mito6Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Category c1 = new Category("Cocina","Articulos de cocina",true);
		Category c3 = new Category("Linea blanca","Linea blanca para el hogar",true);
		Category c2 = new Category("Deportes","Articulos deportivos",true);
		repo.saveAll(Arrays.asList(c1,c2,c3));
	}
}
