package com.grandfather.hireAndDelivery.repository;

import org.springframework.data.repository.CrudRepository;

import com.grandfather.hireAndDelivery.entity.goods.Goods;

public interface GoodsRepository 
extends CrudRepository<Goods, Long>
{

}
