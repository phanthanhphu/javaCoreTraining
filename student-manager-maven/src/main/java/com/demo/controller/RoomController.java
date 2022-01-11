package com.demo.controller;

import java.util.ArrayList;
import java.util.List;

import com.demo.model.Room;
import com.demo.service.RoomServer;

public class RoomController implements RoomServer{
	List<Room> rooms;
	public RoomController() {
		this.rooms = new ArrayList<Room>();
	}
	@Override
	public void saveRoom(Room room) {
		this.rooms.add(room);
		
	}

	@Override
	public void showRoomInfor() {
		this.rooms.forEach(room -> System.out.println(room.toString()));
		
	}



	
}
