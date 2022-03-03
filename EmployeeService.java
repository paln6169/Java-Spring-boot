package com.example.REST1;
import java.util.List;

import javax.transaction.Transactional;
 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.REST1.model.Employee;
import com.example.REST1.model.EmployeeRepository;
@Service
@Transactional
public class EmployeeService
{
	@Autowired
    private EmployeeRepository repo;
	public List<Employee> listAll() 
	{
        return repo.findAll();
    }
	 public void save(Employee emp)
	 {
	        repo.save(emp);
	  }
	 public Employee get(Integer id) 
	 {
	        return repo.findById(id).get();
	 }
	 public void delete(Integer id)
	 {
	        repo.deleteById(id);
	 }
}
