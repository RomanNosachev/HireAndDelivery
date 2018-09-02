package com.grandfather.hireAndDelivery.repository;

import org.springframework.data.repository.CrudRepository;

import com.grandfather.hireAndDelivery.entity.client.Client;

public interface ClientRepository
extends CrudRepository<Client, String>
{

}
