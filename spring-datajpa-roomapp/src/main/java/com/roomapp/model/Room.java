/**
 * 
 */
package com.roomapp.model;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * @author PravinKumarKP
 *
 */
@Entity
public class Room {
	@Id
	private Integer roomNumber;
	private String category;
	private String type;
	private LocalDate startDate;
	private LocalDate endDate;
	private int noOfGuests;
	private double price;
	private int availability;
	
	public Room() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public Room(Integer roomNumber, String category, String type, LocalDate startDate, LocalDate endDate,
			int noOfGuests, double price, int availability) {
		super();
		this.roomNumber = roomNumber;
		this.category = category;
		this.type = type;
		this.startDate = startDate;
		this.endDate = endDate;
		this.noOfGuests = noOfGuests;
		this.price = price;
		this.availability = availability;
	}


	public Integer getRoomNumber() {
		return roomNumber;
	}
	public void setRoomNumber(Integer roomNumber) {
		this.roomNumber = roomNumber;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public LocalDate getStartDate() {
		return startDate;
	}
	public void setStartDate(LocalDate startDate) {
		this.startDate = startDate;
	}
	public LocalDate getEndDate() {
		return endDate;
	}
	public void setEndDate(LocalDate endDate) {
		this.endDate = endDate;
	}
	public int getNoOfGuests() {
		return noOfGuests;
	}
	public void setNoOfGuests(int noOfGuests) {
		this.noOfGuests = noOfGuests;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getAvailability() {
		return availability;
	}
	public void setAvailability(int availability) {
		this.availability = availability;
	}


	@Override
	public String toString() {
		return "Room [roomNumber=" + roomNumber + ", category=" + category + ", type=" + type + ", startDate="
				+ startDate + ", endDate=" + endDate + ", noOfGuests=" + noOfGuests + ", price=" + price
				+ ", availability=" + availability + "]";
	}
	
	
	
}
