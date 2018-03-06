package com.bao.ssm.mapper;

import com.bao.ssm.po.Commodity;
import com.bao.ssm.po.CommodityExample;
import com.bao.ssm.po.CommodityExpand;

import java.util.List;

public interface CommodityMapperExpand {
   
	public List<CommodityExpand> findCommodityList();
	
	public void insertCommodity (Commodity commodity);
	
}