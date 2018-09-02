package com.grandfather.hireAndDelivery.controller;

import java.math.BigDecimal;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.grandfather.hireAndDelivery.entity.goods.Goods;
import com.grandfather.hireAndDelivery.entity.goods.GoodsType;
import com.grandfather.hireAndDelivery.entity.goods.Stock;
import com.grandfather.hireAndDelivery.repository.GoodsRepository;
import com.grandfather.hireAndDelivery.repository.GoodsTypeRepository;
import com.grandfather.hireAndDelivery.repository.StockRepository;

@Controller
@RequestMapping({"/", "index"})
public class IndexController
{
	@Resource
	private GoodsRepository goodsRepository;
	
	@Resource
	private GoodsTypeRepository goodsTypeRepository;
	
	@Resource
	private StockRepository stockRepository;
	
	@RequestMapping(method = RequestMethod.GET)
	public void showIndexPage(Model model, HttpSession session)
	{
		GoodsType type = new GoodsType("Весы детские");
		
		Goods goods = new Goods();
		goods.setCollateralValue(new BigDecimal(5000));
		goods.setMinRentalTerm(30);
		goods.setMaxRentalTerm(90);
		goods.setName("Весы \"Саша\"");
		goods.setType(type);
		
		Stock stock = new Stock();
		stock.setGoods(goods);
		stock.setCount(14);
		stock.setFreeCount(14);
		
		goodsTypeRepository.save(type);
		goodsRepository.save(goods);
		stockRepository.save(stock);
	}
}
