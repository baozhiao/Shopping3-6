package com.bao.ssm.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.bao.ssm.po.Commodity;
import com.bao.ssm.po.CommodityExpand;


public interface CommodityExpandService {
	
	public List<CommodityExpand> findCommodityList();
	
	public void insertCommodity (Commodity commodity);
	
}
