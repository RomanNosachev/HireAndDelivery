package com.grandfather.hireAndDelivery.entity.goods;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
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
	@Column(name = "id", unique = true, nullable = false)
	private long id;
	
	@ManyToMany
	@JoinColumn(name = "goods", nullable = false)
	private Goods goods;
	
	@Column(name = "daysCount", nullable = false)
	private int daysCount;
	
	@Column(name = "pricePerPeriod", nullable = false)
	private BigDecimal pricePerPeriod;
	
	@Column(name = "withPledge", nullable = false)
	private boolean withPledge;
	
	public Tariff() {}

	public long getId()
	{
		return id;
	}

	public void setId(long id)
	{
		this.id = id;
	}

	public Goods getGoods()
	{
		return goods;
	}

	public void setGoods(Goods goods)
	{
		this.goods = goods;
	}

	public int getDaysCount()
	{
		return daysCount;
	}

	public void setDaysCount(int daysCount)
	{
		this.daysCount = daysCount;
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
