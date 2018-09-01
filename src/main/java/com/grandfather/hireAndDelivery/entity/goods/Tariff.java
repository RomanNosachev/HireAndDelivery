package com.grandfather.hireAndDelivery.entity.goods;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
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
	
	@ManyToMany
	@JoinColumn(name = "goods", nullable = false)
	private List<Goods> goods;
	
	@Column(name = "rentalPeriod", nullable = false)
	private int rentalPeriod = 1;
	
	@Column(name = "pricePerPeriod", nullable = false)
	private BigDecimal pricePerPeriod;
	
	@Column(name = "withPledge", nullable = false)
	private boolean withPledge = true;
	
	public Tariff() {}

	public long getId()
	{
		return id;
	}

	public void setId(long id)
	{
		this.id = id;
	}

	public List<Goods> getGoods()
	{
		return goods;
	}

	public void setGoods(List<Goods> goods)
	{
		this.goods = goods;
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

	public boolean withPledge()
	{
		return withPledge;
	}

	public void setPledge(boolean withPledge)
	{
		this.withPledge = withPledge;
	}
}
