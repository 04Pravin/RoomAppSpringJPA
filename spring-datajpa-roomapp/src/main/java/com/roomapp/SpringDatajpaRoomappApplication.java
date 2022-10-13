package com.roomapp;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.roomapp.model.Room;
import com.roomapp.service.IRoomService;

@SpringBootApplication
public class SpringDatajpaRoomappApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(SpringDatajpaRoomappApplication.class, args);
	}

	private IRoomService roomService;
	
	@Autowired
	public void setRoomService(IRoomService roomService) {
		this.roomService = roomService;
	}
	
	@Override
	public void run(String... args) throws Exception {
		Room roomOne = new Room(1,"AC","King size",LocalDate.of(2022, 10, 12),LocalDate.of(2022, 10, 30),2,7500.80,1);
		Room roomTwo = new Room(2,"Non-AC","King size",LocalDate.of(2022, 10, 15),LocalDate.of(2022, 10, 20),2,5500.80,1);
		Room roomThree = new Room(3,"AC","Queen size",LocalDate.of(2022, 10, 20),LocalDate.of(2022, 10, 30),2,8500.80,1);
		roomService.addRoom(roomOne);
		roomService.addRoom(roomTwo);
		roomService.addRoom(roomThree);
		
		//roomService.updateRoom(roomThree);
		
		//roomService.deleteRoom(3);
		
		System.out.println("All rooms");
		roomService.getAll().forEach(System.out::println);
		System.out.println();
		
		System.out.println("Search by room number");
		System.out.println(roomService.getById(1));
		System.out.println();
		
		System.out.println("Search by category");
		roomService.getByCategory("AC").forEach(System.out::println);
		System.out.println();
		
		System.out.println("Search by type");
		roomService.getByType("King size").forEach(System.out::println);
		System.out.println();
		
		System.out.println("Search by less price");
		roomService.getByPrice(9000).forEach(System.out::println);
		System.out.println();
		
		System.out.println("Search by type and category");
		roomService.getByTypeAndCategory("King size", "AC").forEach(System.out::println);
		System.out.println();
		
		System.out.println("Search by date and category");
		roomService.getByStartDateAndCategory(LocalDate.of(2022, 10, 12), "AC").forEach(System.out::println);
		System.out.println();
		
		System.out.println("Search by type and price");
		roomService.getByTypeAndPrice("King size", 7500.80).forEach(System.out::println);
		System.out.println();
	}
	

}
