package com.imcs.niks.passengerrepo.dao;

import com.imcs.niks.passengerrepo.entity.CreditCardDetails;

public interface IPassengerCreditCardDao {

	boolean saveCreditCard(CreditCardDetails cardDeatils);

	CreditCardDetails getCreditCardById(Integer id);

	boolean deleteCreditCardById(Integer id);

	boolean updateCreditCard(CreditCardDetails cardDetails);

}
