package com.imcs.niks.passengerrepo.service;

import com.imcs.niks.passengerrepo.entity.CreditCardDetails;

public interface ICreditCardService {

	boolean saveCreditCard(CreditCardDetails cardDeatils);

	CreditCardDetails getCreditCardById(Integer id);

	boolean deleteCreditCardById(Integer id);

	boolean updateCreditCard(CreditCardDetails cardDetails);
}
