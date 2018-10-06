package com.grandfather.hireAndDelivery.controller;

import java.math.BigDecimal;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.grandfather.hireAndDelivery.entity.goods.Goods;
import com.grandfather.hireAndDelivery.entity.goods.GoodsType;
import com.grandfather.hireAndDelivery.entity.goods.Tariff;
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
		/*
		GoodsType goodsType = new GoodsType("Детские товары");
		
		Tariff tariff = new Tariff();
		tariff.setPledgeRequired(true);
		tariff.setPricePerPeriod(new BigDecimal(20));
		tariff.setRentalPeriod(1);
		
		Tariff tariffWithoutPledge = new Tariff();
		tariffWithoutPledge.setPledgeRequired(false);
		tariffWithoutPledge.setRentalPeriod(30);
		tariffWithoutPledge.setPricePerPeriod(new BigDecimal(750));
		
		Goods goods = new Goods();
		goods.setType(goodsType);
		goods.setName("Весы \"Саша\"");
		goods.setCollateralValue(new BigDecimal(5000));
		goods.setMinRentalTerm(30);
		goods.setTariffs(tariff, tariffWithoutPledge);
		
		goodsTypeRepository.save(goodsType);
		tariffRepository.save(tariff);
		tariffRepository.save(tariffWithoutPledge);
		goodsRepository.save(goods);
		*/
		
		model.addAttribute("goods", goodsRepository.findAll());
		
		return "catalog";
	}
}
