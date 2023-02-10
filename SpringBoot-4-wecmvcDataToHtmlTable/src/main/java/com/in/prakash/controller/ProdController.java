package com.in.prakash.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.in.prakash.model.Product;

@Controller
@RequestMapping("/product")
public class ProdController {
	
	@GetMapping("/all")
	public String showProds(Model model) {
		List<Product> list = Arrays.asList(
				new Product(1212, "pen", 100.0, "ANC"),
				new Product(1213, "penc", 110.0, "CFD"),
				new Product(1214, "BOX", 111.0, "XYZ"),
				new Product(1215, "TOL", 120.0, "WED")
				);
		
		//send data to ui table
		model.addAttribute("products", list);
		return  "ProductView";
	}

}
