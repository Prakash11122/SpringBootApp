package com.nt.test;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.nt.bean.WishMessageGenerator;
import com.nt.config.AppConfig;

public class DependencyManagementTest {
	
	public static void main(String args []) {
		//create ioc container
		AnnotationConfigApplicationContext ctx=new AnnotationConfigApplicationContext(AppConfig.class);
		//get target class object
		WishMessageGenerator generator=ctx.getBean("wmg",WishMessageGenerator.class);
		//invoke the b.method
		String result=generator.generateWishMessage("raja");
		System.out.println("output::"+result);
		//close ioc container
		ctx.close(); 
	}

}
