package com.contacts.binding;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;


@Data
@Entity
@Table(name="CONTACT_DTLS")
public class Contact {
	
	@Id
	@GeneratedValue
	private Integer contactId;
	
	private String contactName;
	
	private String contactEmail;
	
	private Long contactNum;

}
