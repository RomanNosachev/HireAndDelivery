package com.grandfather.hireAndDelivery.repository;

import org.springframework.data.repository.CrudRepository;

import com.grandfather.hireAndDelivery.entity.goods.Stock;

public interface StockRepository
extends CrudRepository<Stock, Long>
{

}
