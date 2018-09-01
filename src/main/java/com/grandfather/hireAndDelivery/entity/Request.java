package com.grandfather.hireAndDelivery.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.grandfather.hireAndDelivery.entity.goods.Tariff;

@Entity
@Table(name = "request")
public class Request
implements Serializable
{
	private static final long serialVersionUID = -5463876984205182940L;

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	@Column(name = "id", unique = true, nullable = false)
	private long id;
	
	@Column(name = "contactPerson", length = 20)
	private String contactPerson;
	
	@Column(name = "address", length = 40)
	private String address;
	
	@Column(name = "telepfoneNumber", nullable = false, length = 12)
	private String telepfoneNumber;

	@ManyToMany
	@JoinColumn(name = "tariff", nullable = false)
	private Set<Tariff> tariffs;
	
	@Column(name = "rentalTerm", nullable = false)
	private int rentalTerm;

	@Enumerated(EnumType.ORDINAL)
	@Column(name = "deliveryType", nullable = false)
	private DeliveryType deliveryType;
	
	@Column(name = "note", length = 100)
	private String note;
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "processingTimestamp", nullable = false)
	private Date processingTimestamp;
	
	public Request() {}

	public long getId()
	{
		return id;
	}

	public void setId(long id)
	{
		this.id = id;
	}

	public String getContactPerson()
	{
		return contactPerson;
	}

	public void setContactPerson(String contactPerson)
	{
		this.contactPerson = contactPerson;
	}

	public String getAddress()
	{
		return address;
	}

	public void setAddress(String address)
	{
		this.address = address;
	}

	public String getTelepfoneNumber()
	{
		return telepfoneNumber;
	}

	public void setTelepfoneNumber(String telepfoneNumber)
	{
		this.telepfoneNumber = telepfoneNumber;
	}

	public Date getProcessingTimestamp()
	{
		return processingTimestamp;
	}

	public void setProcessingTimestamp(Date processingTimestamp)
	{
		this.processingTimestamp = processingTimestamp;
	}

	public DeliveryType getDeliveryType()
	{
		return deliveryType;
	}

	public void setDeliveryType(DeliveryType deliveryType)
	{
		this.deliveryType = deliveryType;
	}
	
	public Set<Tariff> getTariffs()
	{
		return tariffs;
	}

	public void setTariffs(Set<Tariff> tariffs)
	{
		this.tariffs = tariffs;
	}

	public int getRentalTerm()
	{
		return rentalTerm;
	}

	public void setRentalTerm(int rentalTerm)
	{
		this.rentalTerm = rentalTerm;
	}

	public String getNote()
	{
		return note;
	}

	public void setNote(String note)
	{
		this.note = note;
	}
}
