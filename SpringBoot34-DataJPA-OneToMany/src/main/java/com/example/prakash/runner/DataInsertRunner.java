package com.example.prakash.runner;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.example.prakash.entity.Contract;
import com.example.prakash.entity.Vendor;
import com.example.prakash.repository.ContractRepository;
import com.example.prakash.repository.VenderRepository;

@Component
public class DataInsertRunner implements CommandLineRunner {
	
	@Autowired
	private ContractRepository crepo;
	@Autowired
	private VenderRepository vrepo;

	@Override
	public void run(String... args) throws Exception {
		
		Contract c1 = new Contract (100, "C1", 1200.0, "ROAD EXT");
		Contract c2 = new Contract (101, "C2", 1300.0, "WATER pipes");
		Contract c3 = new Contract (103, "C3", 1400.0, "PIPE sss");
		
		
		
		Vendor v1 = new Vendor(1010, "prakash", "odisha",  Arrays.asList(c1, c2, c3));
		
		crepo.save(c1);
		crepo.save(c2);
		crepo.save(c3);
		
		
		vrepo.save(v1);
		

	}

}
