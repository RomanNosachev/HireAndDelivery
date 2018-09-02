package com.grandfather.hireAndDelivery.repository;

import org.springframework.data.repository.CrudRepository;

import com.grandfather.hireAndDelivery.entity.goods.Tariff;

public interface TariffRepository
extends CrudRepository<Tariff, Long>
{

}
