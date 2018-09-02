package com.grandfather.hireAndDelivery.repository;

import org.springframework.data.repository.CrudRepository;

import com.grandfather.hireAndDelivery.entity.Request;

public interface RequestRepository
extends CrudRepository<Request, Long>
{

}
