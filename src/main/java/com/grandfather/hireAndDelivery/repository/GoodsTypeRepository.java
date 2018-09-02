package com.grandfather.hireAndDelivery.repository;

import org.springframework.data.repository.CrudRepository;

import com.grandfather.hireAndDelivery.entity.goods.GoodsType;

public interface GoodsTypeRepository
extends CrudRepository<GoodsType, String>
{

}
