package ma.youcode.presentation;

import ma.youcode.service.EmployerMetierImpl;
import ma.youcode.service.IEmployerMetier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class mainApp {
    public static void main(String[] args) {
            System.out.println("ff");

            ApplicationContext context =
                    new ClassPathXmlApplicationContext("ApplicationContext.xml");
            IEmployerMetier employerMetier =
                    context.getBean("employeeService", EmployerMetierImpl.class);

    }
}
