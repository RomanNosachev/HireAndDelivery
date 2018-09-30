package com.grandfather.hireAndDelivery.controller;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class CatalogController
{
	@RequestMapping(value = "catalog", method = RequestMethod.GET)
	public String showCatalog(Model model, HttpSession session)
	{
		return "catalog";
	}
}
