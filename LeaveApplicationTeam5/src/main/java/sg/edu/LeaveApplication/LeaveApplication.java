package sg.edu.LeaveApplication;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

import sg.edu.LeaveApplication.model.Department;
import sg.edu.LeaveApplication.model.User;
import sg.edu.LeaveApplication.repo.DepartmentRepository;
import sg.edu.LeaveApplication.repo.UserRepository;

@SpringBootApplication
public class LeaveApplication {

	@Autowired
	UserRepository urepo;
	
	@Autowired
	DepartmentRepository drepo;
	
	public static void main(String[] args) {
		SpringApplication.run(LeaveApplication.class, args);
		
	}

	@Bean
	public CommandLineRunner commandLineRunner(ApplicationContext ctx) {
	return args -> {
		//Department d1 = new Department("Engineering", 5);
		
		//drepo.save(d1);
		
		
	};

	
}}
