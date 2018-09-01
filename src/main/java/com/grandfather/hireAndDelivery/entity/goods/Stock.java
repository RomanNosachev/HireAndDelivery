package com.grandfather.hireAndDelivery.entity.goods;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "stock")
public class Stock 
implements Serializable
{
	private static final long serialVersionUID = 6619123805743206403L;

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	@Column(name = "goods", nullable = false, unique = true)
	private Goods goods;
	
	@Column(name = "freeCount", nullable = false)
	private int freeCount;
	
	@Column(name = "count", nullable = false)
	private int count;
	
	public Stock() {}

	public Goods getGoods() 
	{
		return goods;
	}

	public void setGoods(Goods goods) 
	{
		this.goods = goods;
	}

	public int getFreeCount() 
	{
		return freeCount;
	}

	public void setFreeCount(int freeCount) 
	{
		this.freeCount = freeCount;
	}

	public int getCount() 
	{
		return count;
	}

	public void setCount(int count) 
	{
		this.count = count;
	}
}
