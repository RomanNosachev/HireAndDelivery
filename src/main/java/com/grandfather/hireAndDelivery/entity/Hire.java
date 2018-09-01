package com.grandfather.hireAndDelivery.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.grandfather.hireAndDelivery.entity.client.Client;

@Entity
@Table(name = "hire")
public class Hire implements Serializable
{
	private static final long serialVersionUID = -8214007765677150374L;

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	@Column(name = "id", nullable = false, unique = true)
	private long id;

	@ManyToOne
	@JoinColumn(name = "client", nullable = false)
	private Client client;

	@OneToOne
	@JoinColumn(name = "request", nullable = false, unique = true)
	private Request request;

	@Temporal(TemporalType.DATE)
	@Column(name = "rentalStartDate", nullable = false)
	private Date rentalStartDate;

	@Temporal(TemporalType.DATE)
	@Column(name = "rentalEndDate")
	private Date rentalEndDate;

	public Hire() {}
	
	public long getId()
	{
		return id;
	}

	public void setId(long id)
	{
		this.id = id;
	}

	public Client getClient()
	{
		return client;
	}

	public void setClient(Client client)
	{
		this.client = client;
	}

	public Request getOrder()
	{
		return request;
	}

	public void setOrder(Request request)
	{
		this.request = request;
	}

	public Date getRentalStartDate()
	{
		return rentalStartDate;
	}

	public void setRentalStartDate(Date rentalStartDate)
	{
		this.rentalStartDate = rentalStartDate;
	}

	public Date getRentalEndDate()
	{
		return rentalEndDate;
	}

	public void setRentalEndDate(Date rentalEndDate)
	{
		this.rentalEndDate = rentalEndDate;
	}
}
