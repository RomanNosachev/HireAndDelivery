package com.grandfather.hireAndDelivery.controller;

import java.math.BigDecimal;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.grandfather.hireAndDelivery.entity.goods.Goods;
import com.grandfather.hireAndDelivery.entity.goods.GoodsType;
import com.grandfather.hireAndDelivery.repository.GoodsRepository;
import com.grandfather.hireAndDelivery.repository.GoodsTypeRepository;
import com.grandfather.hireAndDelivery.repository.TariffRepository;

@Controller
public class AdminController
{
	@Resource
	private GoodsTypeRepository goodsTypeRepository;
	
	@Resource
	private TariffRepository	tariffRepository; 
	
	@Resource
	private GoodsRepository		goodsRepository;
	
	@GetMapping("/admin")
	public String showAdminPanel(Model model, HttpSession session)
	{
		model.addAttribute("goodsTypes", goodsTypeRepository.findAll());
		model.addAttribute("tariffs", tariffRepository.findAll());
		
		Goods prod = new Goods();
		prod.setType(new GoodsType());
		prod.setCollateralValue(new BigDecimal(0));
		model.addAttribute("prod", prod);
		
		return "admin";
	}
	
	@PostMapping("/createProduct")
	public String createProduct(Model model, HttpSession session, @ModelAttribute(name = "prod") Goods prod)
	{		
		goodsRepository.save(prod);
		
		return "redirect:/admin";
	}
}
