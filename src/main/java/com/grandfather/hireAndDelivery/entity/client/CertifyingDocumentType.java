package com.grandfather.hireAndDelivery.entity.client;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "certifyingDocumentType")
public class CertifyingDocumentType 
implements Serializable
{
	private static final long serialVersionUID = -180896188881971028L;

	@Id
	@Column(name = "name", unique = true, nullable = false, length = 20) 
	private String name;
	
	public CertifyingDocumentType() {}

	public String getName() 
	{
		return name;
	}

	public void setName(String name) 
	{
		this.name = name;
	}
}
