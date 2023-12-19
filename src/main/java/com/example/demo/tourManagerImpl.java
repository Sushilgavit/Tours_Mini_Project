package com.example.demo;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class tourManagerImpl implements tourManager
{
	@Autowired
	tourRepository repository;

	@Override
	public void addtour(tour t) {
		repository.save(t);
		
	}

	@Override
	public List<tour> gettours() {
		// TODO Auto-generated method stub
		return repository.findAll();
	}

	@Override
	public List<tour> getSelectedtours(String cat) {
		// TODO Auto-generated method stub
		
		return repository.Listtour(cat); 
	}

	
	

}
