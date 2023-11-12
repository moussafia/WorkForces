package ma.youcode;

import ma.youcode.Service.IEmployeesService;
import ma.youcode.Service.IEmployeesServiceImpl;
import ma.youcode.entities.Departements;
import ma.youcode.entities.Employees;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        ApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");
        IEmployeesService employeesService =
                context.getBean(IEmployeesServiceImpl.class);

        Employees employees = (Employees) context.getBean("employee");
        Departements departement = (Departements) context.getBean("departement");
        employeesService.ajouterEmployee(employees, departement);

        List<Employees> employeesList = employeesService
                .afficherEmployees();
        employeesList.forEach(
                e->{
                    System.out.println(e.getName());
                    System.out.println(e.getSalaire());
                    System.out.println(e.getDepartements().getName());
                }
        );

    }
}