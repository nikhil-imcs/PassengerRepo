package com.imcs.niks.passengerrepo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.imcs.niks.passengerrepo.dao.IPassengerCreditCardDao;
import com.imcs.niks.passengerrepo.entity.CreditCardDetails;

@Service
public class CreditCardService implements ICreditCardService {
	@Autowired
	private IPassengerCreditCardDao creditDao;

	public boolean saveCreditCard(CreditCardDetails cardDetails) {
		boolean status=creditDao.saveCreditCard(cardDetails);
		return status;
	}

	public CreditCardDetails getCreditCardById(Integer id) {
		CreditCardDetails card=creditDao.getCreditCardById(id);
		return card;
	}

	public boolean deleteCreditCardById(Integer id) {
		boolean status=creditDao.deleteCreditCardById(id);
		return status;
	}

	public boolean updateCreditCard(CreditCardDetails cardDetails) {
		boolean status=creditDao.updateCreditCard(cardDetails);
		return status;
	}

}
