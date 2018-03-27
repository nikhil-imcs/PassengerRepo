package com.imcs.niks.passengerrepo.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name="credit_card_details")
@Getter
@Setter
public class CreditCardDetails {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	private Long card_number;
	private String card_type;
	private Date expiration_month;
	private Date expiration_year;
	
	public CreditCardDetails(){
		
	}

}
