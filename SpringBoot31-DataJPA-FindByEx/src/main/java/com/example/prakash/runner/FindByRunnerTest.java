package com.example.prakash.runner;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.example.prakash.repo.ProductRepository;
import com.example.prakash.repo.ProductRepository.Myview;

@Component
public class FindByRunnerTest implements CommandLineRunner {
	@Autowired
	private ProductRepository repo;
	
	@Override
	public void run(String... args) throws Exception {
		
	//List<Product> list = 	repo.findByprodVender("NIM");
		//repo.findByprodGrade("A").forEach(System.out::println);
		//repo.findByprodCostLessThan(5000.0).forEach(System.out::println);
		//repo.findByprodCostGreaterThan(2500.0).forEach(System.out::println);
		//repo.findByProdNameLike("s%").forEach(System.out::println);
		//repo.findByProdNameLike("%TV").forEach(System.out::println);
		//repo.findByProdNameLike("____").forEach(System.out::println);
		//repo.findByProdNameLike("_____").forEach(System.out::println);
		//repo.findByProdNameNotLike("S%").forEach(System.out::println);
		//it will add symbol % at the end
	  //	repo.findByProdNameStartingWith("S").forEach(System.out::println);
		//it will add symbol % at the starting
		//repo.findByProdNameEndingWith("TV").forEach(System.out::println);
		//repo.findByProdNameContaining("A").forEach(System.out::println);
	//	repo.findByProdNameLikeAndProdCostGreaterThanEqual("%TV", 2000.0).forEach(System.out::println);
		//repo.findByProdCostOrderByProdVender(2500.0).forEach(System.out::println);
		List<Myview> list = repo.findByprodGrade("A");
		for(Myview m:list) {
			System.out.println(m.getprodName() +  "-" + m.getprodCost());
		}

	}

}
