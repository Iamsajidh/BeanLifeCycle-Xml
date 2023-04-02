package BeanLifeCycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClass {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
		Employee employee = (Employee) context.getBean("Employee");
		
		System.out.println(employee);
		
//		context.registerShutdownHook();
		((ClassPathXmlApplicationContext) context).close();
	}
}
