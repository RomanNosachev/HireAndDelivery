package com.grandfather.hireAndDelivery.entity.goods;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "goodsType")
public class GoodsType 
implements Serializable
{
	private static final long serialVersionUID = -4501158318295062855L;
	
	@Id
	@Column(name = "name", length = 30)
	private String name;
	
	public GoodsType() {}
	
	public GoodsType(String name)
	{
		this.name = name;
	}
	
	public String getName()
	{
		return name;
	}
	
	public void setName(String name)
	{
		this.name = name;
	}
}
