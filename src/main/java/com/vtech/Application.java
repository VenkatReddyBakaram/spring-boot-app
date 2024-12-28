package com.vtech;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

import com.vtech.components.BeanComponent;
import com.vtech.components.BeanComponentTest;
import com.vtech.components.Employee;
import com.vtech.components.ProjectInfo;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {

		ApplicationContext applicationContext = SpringApplication.run(Application.class, args);

		// Employee employee = (Employee) applicationContext.getBean("employee");

		// Employee employee = (Employee) applicationContext.getBean("myEmployee");

		Employee employee = applicationContext.getBean(Employee.class);

		employee.greeting();

		employee.employeeDetails();

		ProjectInfo projectInfo = applicationContext.getBean(ProjectInfo.class);
		projectInfo.printProjectDetails();

		BeanComponent beanComponent = applicationContext.getBean(BeanComponent.class);
		beanComponent.beanComponent();

		BeanComponentTest beanComponentTest = applicationContext.getBean(BeanComponentTest.class);
		beanComponentTest.beanComponentTest();

	}

	@Bean
	BeanComponentTest getBeanComponentTest() {
		return new BeanComponentTest();
	}
}