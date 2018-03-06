package com.bao.ssm.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bao.ssm.mapper.CommodityMapper;
import com.bao.ssm.mapper.CommodityMapperExpand;
import com.bao.ssm.po.Commodity;
import com.bao.ssm.po.CommodityExpand;
import com.bao.ssm.service.CommodityExpandService;

@Service
public class CommodityExpandServiceImpl implements CommodityExpandService {
	
	@Autowired
	private CommodityMapperExpand commodityMapperExpand;

	public List<CommodityExpand> findCommodityList() {
		
		List<CommodityExpand> list= commodityMapperExpand.findCommodityList();
		
		for (CommodityExpand commodityExpand : list) {
			System.out.println(commodityExpand);
		}
				
		return list;
	}
	
	public void insertCommodity (Commodity commodity) {
		
		commodityMapperExpand.insertCommodity(commodity);
		
	}

}
