package com.everis.yankiservice.model;

import java.io.Serializable;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Customer implements Serializable {

	/**
	 * 
	 */
	
	private static final long serialVersionUID = 6679096560556364353L;
	
	@Id
	private String id;
	@Field (name = "num_doc")
    private String numDoc;
    private String name;
    private String lastname;
    private String phone;
    private String email;
    private String address;
    private long status;
    @Field (name = "type_customer")//usar el redis(Personal, Empresarial, Yanki)
    private String typeCustomer;
    
    @Field (name = "type_doc")//usar el redis (DNI, CE, Pasaporte) 
    private String typeDoc;
    private String imei;
}
