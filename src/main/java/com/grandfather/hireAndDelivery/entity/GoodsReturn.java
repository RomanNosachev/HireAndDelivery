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
@Table(name = "goodsReturn")
public class GoodsReturn
implements Serializable
{
	private static final long serialVersionUID = 8974177888825475979L;

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	@Column(name = "id", unique = true, nullable = false)
	private long id;
	
	@OneToOne
	@JoinColumn(name = "hire", unique = true, nullable = false)
	private Hire hire;
	
	@Temporal(TemporalType.DATE)
	@Column(name = "goodsReturnDate", nullable = false)
	private Date goodsReturnDate;
	
	public GoodsReturn() {}

	public long getId()
	{
		return id;
	}

	public void setId(long id)
	{
		this.id = id;
	}

	public Hire getHire()
	{
		return hire;
	}

	public void setHire(Hire hire)
	{
		this.hire = hire;
	}

	public Date getGoodsReturnDate()
	{
		return goodsReturnDate;
	}

	public void setGoodsReturnDate(Date goodsReturnDate)
	{
		this.goodsReturnDate = goodsReturnDate;
	}
}
