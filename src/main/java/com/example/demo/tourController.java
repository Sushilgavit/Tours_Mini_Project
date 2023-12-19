package com.example.demo;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


@RestController  
@CrossOrigin("http://127.0.0.1:5500")
public class tourController
{
	@Autowired
	tourManager manager;
	
	 @PostMapping(value = "api/tour")
	 public void addtour(@RequestBody tour tour)
	 {
		System.out.println("addtour called");
		manager.addtour(tour);
	 }

	
	 @GetMapping(value = "api/tour")
	 public List<tour> gettour()
	 {
		  //return manager.getProducts();
		  return manager.gettours();
		
	 }
	
	 
	 @GetMapping(value = "api/productsBytype/{Beach}")
	 public List<tour> gettourbytype(@PathVariable String Beach)
	 {
		
		 return manager.getSelectedtours(Beach);
	 }
	
}
	
	
