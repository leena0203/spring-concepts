package com.demo.springconcepts;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.demo.springconcepts.component.DemoBean;
import com.demo.springconcepts.component.EmployeeBean;

@SpringBootApplication
public class SpringConceptsApplication {
	public static final Logger logger = LoggerFactory.getLogger(SpringConceptsApplication.class);
	public static void main(String[] args) {
		logger.debug("Welcome to Spring Concepts");
		ApplicationContext context = SpringApplication.run(SpringConceptsApplication.class, args);
		DemoBean demobean = context.getBean(DemoBean.class);
		logger.debug("Demo Bean= "+demobean.toString() );
		logger.debug("Example using @Autowire annotation");
		EmployeeBean employeeBean = context.getBean(EmployeeBean.class);
		employeeBean.setEid(04);
		employeeBean.setEname("Spring FrameWork");
		employeeBean.showEmployeeDetails();
	}	
}


