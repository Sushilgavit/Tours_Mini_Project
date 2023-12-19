package com.example.demo;

import java.util.List;
import java.util.Optional;

public interface tourManager
{
	public void addtour(tour t);  // add tour
	public List<tour> gettours();  // view all tours
	public List<tour> getSelectedtours(String Beach); // view tour based o particular type

	
	/*void addtour(tour p);
	List<tour> gettours();
	void delete(int id);
	void update(tour tour,int id);
	Optional<tour> gettour(int id);
	List<tour> getSelected(String cat);
*/
}
