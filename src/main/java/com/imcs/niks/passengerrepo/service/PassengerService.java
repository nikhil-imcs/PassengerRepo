package com.imcs.niks.passengerrepo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.imcs.niks.passengerrepo.dao.IPassengerDao;
import com.imcs.niks.passengerrepo.entity.PassengerProfile;

@Service
public class PassengerService implements IPassengerService {
	@Autowired
	private IPassengerDao passengerDao;

	public boolean savePassenger(PassengerProfile p) {
		boolean status=passengerDao.savePassenger(p);
		return status;
	}

	public PassengerProfile getPassengerById(Integer id) {
		PassengerProfile passengerProfile=passengerDao.getPassengerById(id);
		return passengerProfile;
	}

	public boolean deletePassengerById(Integer id) {
		boolean status=passengerDao.deletePassengerById(id);
		return status;
	}

	public boolean updatePassenger(PassengerProfile p) {
		boolean status=passengerDao.updatePassenger(p);
		return status;
	}

	public List<PassengerProfile> getAllPassengers() {
		List<PassengerProfile> passengers=passengerDao.getAllPassengers();
		return passengers;
	}

}
