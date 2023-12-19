package com.example.demo;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="tour")
public class tour
{
	/**
	 * 
	 */
	public tour() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	private int id ;            //private int id;
	private String type;		//private String proname;
	private String location ;  	//private String category;
	private double cost ;       //private int quantity;
	private int no_of_days;     //private double price;
	/**
	 * @param id
	 * @param type
	 * @param location
	 * @param cost
	 * @param no_of_days
	 */
	public tour(int id, String type, String location, double cost, int no_of_days) {
		super();
		this.id = id;
		this.type = type;
		this.location = location;
		this.cost = cost;
		this.no_of_days = no_of_days;
	}
	/**
	 * @return the id
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public int getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}
	/**
	 * @return the type
	 */
	public String getType() {
		return type;
	}
	/**
	 * @param type the type to set
	 */
	public void setType(String type) {
		this.type = type;
	}
	/**
	 * @return the location
	 */
	public String getLocation() {
		return location;
	}
	/**
	 * @param location the location to set
	 */
	public void setLocation(String location) {
		this.location = location;
	}
	/**
	 * @return the cost
	 */
	public double getCost() {
		return cost;
	}
	/**
	 * @param cost the cost to set
	 */
	public void setCost(double cost) {
		this.cost = cost;
	}
	/**
	 * @return the no_of_days
	 */
	public int getNo_of_days() {
		return no_of_days;
	}
	/**
	 * @param no_of_days the no_of_days to set
	 */
	public void setNo_of_days(int no_of_days) {
		this.no_of_days = no_of_days;
	}
	@Override
	public String toString() {
		return "tour [id=" + id + ", type=" + type + ", location=" + location + ", cost=" + cost + ", no_of_days="
				+ no_of_days + "]";
	}
	
	
}
