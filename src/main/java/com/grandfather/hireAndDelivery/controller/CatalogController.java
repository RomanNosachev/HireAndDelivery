package com.grandfather.hireAndDelivery.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.grandfather.hireAndDelivery.repository.GoodsRepository;
import com.grandfather.hireAndDelivery.repository.GoodsTypeRepository;
import com.grandfather.hireAndDelivery.repository.TariffRepository;

@Controller
public class CatalogController
{
	@Resource
	private GoodsRepository goodsRepository;
	
	@Resource
	private GoodsTypeRepository goodsTypeRepository;
	
	@Resource
	private TariffRepository tariffRepository;
	
	@RequestMapping(value = "catalog", method = RequestMethod.GET)
	public String showCatalog(Model model, HttpSession session)
	{				
		model.addAttribute("goods", goodsRepository.findAll());
		
		return "catalog";
	}
}
