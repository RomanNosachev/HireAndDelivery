package com.grandfather.hireAndDelivery.entity.goods;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tariff")
public class Tariff
implements Serializable
{
	private static final long serialVersionUID = -3389201016130002625L;

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	@Column(name = "id", unique = true, nullable = false)
	private long id;
	
	@Column(name = "rentalPeriod", nullable = false)
	private int rentalPeriod = 1;
	
	@Column(name = "pricePerPeriod", nullable = false)
	private BigDecimal pricePerPeriod;
	
	@Column(name = "pledgeRequired", nullable = false)
	private boolean pledgeRequired = true;
	
	public Tariff() {}

	public long getId()
	{
		return id;
	}

	public void setId(long id)
	{
		this.id = id;
	}

	public int getRentalPeriod()
	{
		return rentalPeriod;
	}

	public void setRentalPeriod(int daysCount)
	{
		this.rentalPeriod = daysCount;
	}

	public BigDecimal getPricePerPeriod()
	{
		return pricePerPeriod;
	}

	public void setPricePerPeriod(BigDecimal pricePerPeriod)
	{
		this.pricePerPeriod = pricePerPeriod;
	}

	public boolean isPledgeRequired()
	{
		return pledgeRequired;
	}

	public void setPledgeRequired(boolean pledgeRequired)
	{
		this.pledgeRequired = pledgeRequired;
	}
}
