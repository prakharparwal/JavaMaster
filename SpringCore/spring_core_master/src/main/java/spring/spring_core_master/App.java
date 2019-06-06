package spring.spring_core_master;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.prakhar.parwal.bean.Person;

/**
 * 
 *
 */
public class App {
	
    public static void main( String[] args ) {
    	
    	ApplicationContext appContext = new ClassPathXmlApplicationContext("spring-bean-configuration.xml");
    	Person p1 = (Person) appContext.getBean("personBean");
    	System.out.println(p1);
    	
    }
}
