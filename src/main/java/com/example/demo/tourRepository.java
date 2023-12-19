package com.example.demo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;


public interface tourRepository extends JpaRepository<tour,Integer> 
{
	
	@Modifying
	@Transactional
	@Query("from tour t where t.type=:Beach")
	List<tour> Listtour(@Param("Beach") String name);
}
