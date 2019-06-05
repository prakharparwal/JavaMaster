package spring.spring_core_master;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.prakhar.parwal.data.Person;

/**
 * 
 *
 */
public class App {
	
    public static void main( String[] args ) {
    	
    	ApplicationContext appContext = new ClassPathXmlApplicationContext("spring-bean-configuration.xml");
    	Person e1 = (Person) appContext.getBean("personBean");
    	System.out.print(e1);
    }
}
