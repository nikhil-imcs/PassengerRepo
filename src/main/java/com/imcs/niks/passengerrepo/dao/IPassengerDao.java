package com.imcs.niks.passengerrepo.dao;

import java.util.List;

import com.imcs.niks.passengerrepo.entity.PassengerProfile;

public interface IPassengerDao {
	
	boolean savePassenger(PassengerProfile p);

	PassengerProfile getPassengerById(Integer id);

	boolean deletePassengerById(Integer id);

	boolean updatePassenger(PassengerProfile p);
	
	List<PassengerProfile> getAllPassengers();

}
