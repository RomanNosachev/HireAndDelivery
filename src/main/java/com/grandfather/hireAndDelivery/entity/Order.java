package com.grandfather.hireAndDelivery.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "order")
public class Order
implements Serializable
{
	private static final long serialVersionUID = -5463876984205182940L;

	@Id
	@Column(name = "id", unique = true, nullable = false)
	private long id;
	
	@Column(name = "contactPerson", length = 20)
	private String contactPerson;
	
	@Column(name = "address", nullable = false)
	private String address;
	
	@Column(name = "telepfoneNumber", nullable = false)
	private String telepfoneNumber;
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "processingTimestamp", nullable = false)
	private Date processingTimestamp;
	
	@Column(name = "note", length = 100)
	private String note;
	
	public Order() {}

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

	public String getNote()
	{
		return note;
	}

	public void setNote(String note)
	{
		this.note = note;
	}
}
