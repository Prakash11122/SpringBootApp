package com.example.prakash.serviceIMPL;

import org.springframework.stereotype.Component;

import com.example.prakash.service.AlertSystem;

@Component
public class SmsAlertSystem implements AlertSystem {

	@Override
	public void sendMessage() {
		System.out.println("FROM SMS SYSTEM");

	}

}
