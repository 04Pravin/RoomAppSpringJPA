package com.roomapp.repository;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.roomapp.model.Room;

public interface IRoomRepository extends JpaRepository<Room, Integer> {

	List<Room> findByType(String type);

	List<Room> findByCategory(String category);

	List<Room> findByPriceLessThanEqual(double price);

	List<Room> findByTypeAndCategory(String type, String category);
	
	List<Room> findByStartDateAndCategory(LocalDate startDate, String category);

	List<Room> findByTypeAndPrice(String type, double price);
}
