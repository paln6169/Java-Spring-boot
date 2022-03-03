package com.example.REST1;
import java.util.*;

import org.springframework.beans.factory.annotation.*;
import org.springframework.http.*;
 
import org.springframework.web.bind.annotation.*;

import com.example.REST1.model.Employee;
@RestController
public class EmployeeController 
{
	@Autowired
    private EmployeeService service;
	public List<Employee> list() {
	    return service.listAll();
	}
	
	@GetMapping("/employees/{id}")
	public ResponseEntity<Employee> get(@PathVariable Integer id) {
	    try {
	        Employee emp = service.get(id);
	        return new ResponseEntity<Employee>(emp, HttpStatus.OK);
	    } catch (NoSuchElementException e) {
	        return new ResponseEntity<Employee>(HttpStatus.NOT_FOUND);
	    }      
	}
	
	@PostMapping("/employees")
	public void add(@RequestBody Employee emp) {
	    service.save(emp);
	}
	
	
	@PutMapping("/employees/{id}")
	public ResponseEntity<?> update(@RequestBody Employee emp, @PathVariable Integer id) {
	    try {
	        Employee existProduct = service.get(id);
	        service.save(emp);
	        return new ResponseEntity<Object>(HttpStatus.OK);
	    } catch (NoSuchElementException e) {
	        return new ResponseEntity<Object>(HttpStatus.NOT_FOUND);
	    }      
	}
	@DeleteMapping("/employees/{id}")
	public void delete(@PathVariable Integer id)
	{
	    service.delete(id);
	}
	
}
