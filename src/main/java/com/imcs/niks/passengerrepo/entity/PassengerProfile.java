package com.imcs.niks.passengerrepo.entity;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name="passenger_profile")
@Getter
@Setter
public class PassengerProfile {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="profile_id")
	private Integer id;
	private String firstName;
	private String lastName;
	private String password;
	private String address;
	private String tel_no;
	private String email_id;
	@OneToMany(cascade=CascadeType.ALL)
	@JoinColumn(name="profile_id")
	private List<CreditCardDetails> creditCardDetails;
	
	public PassengerProfile(){
		
	}

}
