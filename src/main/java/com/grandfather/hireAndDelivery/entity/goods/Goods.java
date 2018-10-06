package com.grandfather.hireAndDelivery.entity.goods;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "goods")
public class Goods 
implements Serializable
{
	private static final long serialVersionUID = 7508300820800857948L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	@Column(name = "id")
	private long id;
	
	@ManyToOne
	@JoinColumn(name = "type", nullable = false)
	private GoodsType type;
	
	@Column(name = "collateralValue", nullable = false)
	private BigDecimal collateralValue;
	
	@Column(name = "name", nullable = false, length = 40)
	private String name;

	@Column(name = "minRentalTerm", nullable = false)
	private int minRentalTerm;
	
	@ManyToMany
	@JoinColumn(name = "tariffs")
	private List<Tariff> tariffs;
	
	public Goods() {}
	
	public long getId()
	{
		return id;
	}
	
	public void setId(long id)
	{
		this.id = id;
	}
	
	public GoodsType getType()
	{
		return type;
	}
	
	public void setType(GoodsType type)
	{
		this.type = type;
	}
	
	public BigDecimal getCollateralValue()
	{
		return collateralValue;
	}
	
	public void setCollateralValue(BigDecimal value)
	{
		collateralValue = value;
	}
	
	public String getName()
	{
		return name;
	}
	
	public void setName(String name)
	{
		this.name = name;
	}

	public int getMinRentalTerm()
	{
		return minRentalTerm;
	}
	
	public void setMinRentalTerm(int term)
	{
		minRentalTerm = term;
	}
	
	public List<Tariff> getTariffs()
	{
		return tariffs;
	}
	
	public void setTariffs(List<Tariff> tariffs)
	{
		this.tariffs = tariffs;
	}
	
	public void setTariffs(Tariff ... tariffs)
	{
		this.tariffs = Arrays.asList(tariffs);
	}
}
