package com.example.prakash.runner;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.example.prakash.repo.TimeRepository;
import com.example.prakash.time.TimeStamp;

@Component
public class TimeRunner implements CommandLineRunner {
            @Autowired
	private TimeRepository tRepo;
	@Override
	public void run(String... args) throws Exception {
		Date dt = new Date(System.currentTimeMillis());
		TimeStamp emp = new TimeStamp(10, "prakash", dt, dt, dt);
		tRepo.save(emp);

	}

}
