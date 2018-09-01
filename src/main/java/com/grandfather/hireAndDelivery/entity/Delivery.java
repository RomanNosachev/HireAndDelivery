package com.grandfather.hireAndDelivery.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "delivery")
public class Delivery
implements Serializable
{
	private static final long serialVersionUID = 5272190911899987689L;

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	@Column(name = "id", unique = true, nullable = false)
	private long id;
	
	@OneToOne
	@JoinColumn(name = "request", unique = true, nullable = false)
	private Request request;
	
	@Temporal(TemporalType.DATE)
	@Column(name = "deliveryDate", nullable = false)
	private Date deliveryDate;
	
	public Delivery() {}

	public long getId()
	{
		return id;
	}

	public void setId(long id)
	{
		this.id = id;
	}

	public Request getOrder()
	{
		return request;
	}

	public void setOrder(Request request)
	{
		this.request = request;
	}

	public Date getDeliveryDate()
	{
		return deliveryDate;
	}

	public void setDeliveryDate(Date deliveryDate)
	{
		this.deliveryDate = deliveryDate;
	}
}
