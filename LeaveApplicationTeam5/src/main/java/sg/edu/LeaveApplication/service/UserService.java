package sg.edu.LeaveApplication.service;

import java.util.ArrayList;
import java.util.List;

import sg.edu.LeaveApplication.model.Department;
import sg.edu.LeaveApplication.model.User;

public interface UserService {
	public ArrayList<User> findAll();
	public void saveUser (User user);
	public void deleteUser (User user);
	public ArrayList<String> findAllUserNames();
	public User findUserByName(String username);
	public User findUserById(Integer id);
	public List<User> findUserBydepartment(Department dept);
}
