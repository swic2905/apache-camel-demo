package com.sysco.demo.demo;

import org.apache.camel.builder.RouteBuilder;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication extends RouteBuilder {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@Override
	public void configure() throws Exception {
		// move data from one file to another file
		System.out.println(">>>>>>> Starting the file transferring ........");
		moveAllFiles();
		System.out.println(">>>>>>> Files are transferring successfully ........");
	}

	public void moveAllFiles(){
		from("file:C:/Users/Sachintha/Documents/CES-EU/Apache Camel/demo/Input?noop=true").to("file:C:/Users/Sachintha/Documents/CES-EU/Apache Camel/demo/Output");
	}
}
