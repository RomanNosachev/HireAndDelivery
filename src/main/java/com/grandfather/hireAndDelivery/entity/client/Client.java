package com.grandfather.hireAndDelivery.entity.client;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "client")
public class Client
implements Serializable
{
	private static final long serialVersionUID = -6847642188008630378L;

	@Id
	@Column(name = "id", unique = true, nullable = false, length = 10)
	private String id;
	
	@ManyToOne
	@JoinColumn(name = "documentType", nullable = false)
	private CertifyingDocumentType documentType;
	
	@Column(name = "name", nullable = false, length = 15)
	private String name;
	
	@Column(name = "surname", nullable = false, length = 20)
	private String surname;
	
	@Column(name = "patronymic", length = 20)
	private String patronymic;
	
	@Column(name = "address", length = 50)
	private String address;
	
	@Column(name = "telephoneNumber", nullable = false, length = 12)
	private List<String> telephoneNumbers;
	
	@Column(name = "email", length = 20)
	private String email;
	
	public Client() {}

	public String getId()
	{
		return id;
	}

	public void setId(String id)
	{
		this.id = id;
	}

	public CertifyingDocumentType getDocumentType()
	{
		return documentType;
	}

	public void setDocumentType(CertifyingDocumentType documentType)
	{
		this.documentType = documentType;
	}

	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public String getSurname()
	{
		return surname;
	}

	public void setSurname(String surname)
	{
		this.surname = surname;
	}

	public String getPatronymic()
	{
		return patronymic;
	}

	public void setPatronymic(String patronymic)
	{
		this.patronymic = patronymic;
	}

	public String getAddress()
	{
		return address;
	}

	public void setAddress(String address)
	{
		this.address = address;
	}

	public List<String> getTelephoneNumbers()
	{
		return telephoneNumbers;
	}

	public void setTelephoneNumbers(List<String> telephoneNumbers)
	{
		this.telephoneNumbers = telephoneNumbers;
	}

	public String getEmail()
	{
		return email;
	}

	public void setEmail(String email)
	{
		this.email = email;
	}
}
