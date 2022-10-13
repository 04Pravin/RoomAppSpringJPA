package com.roomapp.service;

import java.time.LocalDate;
import java.util.List;

import com.roomapp.model.Room;

public interface IRoomService {
	void addRoom(Room room);

	void updateRoom(Room room);

	void deleteRoom(int roomNumber);

	Room getById(int roomNumber);

	List<Room> getAll();

	List<Room> getByType(String type);

	List<Room> getByCategory(String category);

	List<Room> getByPrice(double price);
	
	List<Room> getByTypeAndCategory(String type, String category);
	
	List<Room> getByStartDateAndCategory(LocalDate startDate, String category);

	List<Room> getByTypeAndPrice(String type, double price);
}
