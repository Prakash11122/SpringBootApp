package com.example.prakash;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;
@Component

public class PropertyRunn implements CommandLineRunner {

	@Override
	public void run(String... args) throws Exception {
		@Value("${app-id}")
		private int id;
		@Value("${title}")
		private String ttl;
		@Value("${version}")
		private double ver;

	}

	@Override
	public String toString() {
		return "PropertyRunn [getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}

}
