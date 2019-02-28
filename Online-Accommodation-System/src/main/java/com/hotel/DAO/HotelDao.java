package com.hotel.DAO;

import java.util.List;

import com.hotel.model.Hotel;

public interface HotelDao {
	public void add(Hotel hotel);

	public void edit(String id);

	public void search(String id);
	
	public void remove(String id);
	
	public Hotel view(String id);
	
	public List<Hotel> viewAll();
	
}
