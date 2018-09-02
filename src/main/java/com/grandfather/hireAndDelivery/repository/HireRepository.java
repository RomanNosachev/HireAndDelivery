package com.grandfather.hireAndDelivery.repository;

import org.springframework.data.repository.CrudRepository;

import com.grandfather.hireAndDelivery.entity.Hire;

public interface HireRepository
extends CrudRepository<Hire, Long>
{

}
