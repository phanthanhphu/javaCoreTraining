package com.demo.service;

import com.demo.model.Room;

public interface RoomServer {
	// 4 .Interface segregation principle
	public void saveRoom(Room room);

	public void showRoomInfor();

}
