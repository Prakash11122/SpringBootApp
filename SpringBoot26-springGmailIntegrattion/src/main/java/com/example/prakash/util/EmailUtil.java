package com.example.prakash.util;

import javax.mail.internet.MimeMessage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.Resource;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Component;

@Component
public class EmailUtil {
	
	@Autowired
	private JavaMailSender sender;
	
	public boolean send(
			String to,
			String cc[],
			String bcc[],
			String subject,
			String text,
			Resource file ) {
		
		boolean flag  =  false;
		try {
			//1.create empty message
			MimeMessage message =  sender.createMimeMessage();
			
			//2.use helper class object
			
			MimeMessageHelper helper = new MimeMessageHelper( message , file!=null?true:false);
			//set details
			helper.setTo(to);
			helper.setSubject(subject);
			helper.setText(text);
			
			if(cc!=null && cc.length>0)
				helper.setCc(cc);
			if(bcc!=null && bcc.length>0)
				helper.setBcc(bcc);
			
			if(file!=null)
				helper.addAttachment(file.getFilename(), file);
			
			//3.  send email		
			sender.send(message);
			flag = true;//success
		} catch(Exception e){
			flag = false; //false
			e.printStackTrace();
		}
		
		return flag;
		
	}

}
