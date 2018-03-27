package com.imcs.niks.passengerrepo.service;

import java.util.List;

import com.imcs.niks.passengerrepo.entity.PassengerProfile;

public interface IPassengerService {
	
	boolean savePassenger(PassengerProfile p);

	PassengerProfile getPassengerById(Integer id);

	boolean deletePassengerById(Integer id);

	boolean updatePassenger(PassengerProfile p);
	
	List<PassengerProfile> getAllPassengers();

}
