/**
 * 
 */
package com.roomapp.service;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.roomapp.model.Room;
import com.roomapp.repository.IRoomRepository;

/**
 * @author PravinKumarKP
 *
 */

@Service
public class RoomServiceImpl implements IRoomService {

	
	private IRoomRepository roomRepository;
	@Autowired

	public void setRoomRepository(IRoomRepository roomRepository) {
		this.roomRepository = roomRepository;
	}

	@Override
	public void addRoom(Room room) {
		roomRepository.save(room);
		
	}

	@Override
	public void updateRoom(Room room) {
		roomRepository.save(room);
		
	}

	@Override
	public void deleteRoom(int roomNumber) {
		roomRepository.deleteById(roomNumber);
		
	}

	@Override
	public Room getById(int roomNumber) {
		// TODO Auto-generated method stub
		return roomRepository.findById(roomNumber)
				.get();
	}

	@Override
	public List<Room> getAll() {
		// TODO Auto-generated method stub
		return roomRepository.findAll();
	}

	@Override
	public List<Room> getByType(String type) {
		// TODO Auto-generated method stub
		return roomRepository.findByType(type);
	}

	@Override
	public List<Room> getByCategory(String category) {
		// TODO Auto-generated method stub
		return roomRepository.findByCategory(category);
	}

	@Override
	public List<Room> getByPrice(double price) {
		// TODO Auto-generated method stub
		return roomRepository.findByPriceLessThanEqual(price);
	}

	@Override
	public List<Room> getByTypeAndCategory(String type, String category) {
		// TODO Auto-generated method stub
		return roomRepository.findByTypeAndCategory(type, category);
	}

	@Override
	public List<Room> getByStartDateAndCategory(LocalDate startDate, String category) {
		// TODO Auto-generated method stub
		return roomRepository.findByStartDateAndCategory(startDate, category);
	}

	@Override
	public List<Room> getByTypeAndPrice(String type, double price) {
		// TODO Auto-generated method stub
		return roomRepository.findByTypeAndPrice(type, price);
	}
	
	
}
