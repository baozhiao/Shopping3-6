package com.bao.ssm.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.ModelAndViewDefiningException;

import com.bao.ssm.po.Commodity;
import com.bao.ssm.po.CommodityExpand;
import com.bao.ssm.service.CommodityExpandService;
import com.bao.ssm.serviceimpl.CommodityExpandServiceImpl;

@Controller
public class CommodityController {
	
	@Autowired
	private CommodityExpandService commodityExpandService;
	
	@RequestMapping("/CommodityList.action")
	public ModelAndView CommodityList() {
		
		List<CommodityExpand> list = commodityExpandService.findCommodityList();
		
		System.out.println("---------5555555------------------");
		
		for (CommodityExpand commodityExpand : list) {
			System.out.println(commodityExpand);
		}
		
		ModelAndView mov = new ModelAndView();
		
		mov.addObject("list", list);
		
		mov.setViewName("commodityList");
		
		return mov;
	}
	
	@RequestMapping("/insertCommodity.action")
	public void insertCommodity() {
		Commodity commodity = new Commodity();
		

		
		
		commodityExpandService.insertCommodity(commodity);
	}
}
