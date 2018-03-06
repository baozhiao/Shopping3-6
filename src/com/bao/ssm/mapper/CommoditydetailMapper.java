package com.bao.ssm.mapper;

import com.bao.ssm.po.Commoditydetail;
import com.bao.ssm.po.CommoditydetailExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CommoditydetailMapper {
    int countByExample(CommoditydetailExample example);

    int deleteByExample(CommoditydetailExample example);

    int deleteByPrimaryKey(Integer commoditydetailId);

    int insert(Commoditydetail record);

    int insertSelective(Commoditydetail record);

    List<Commoditydetail> selectByExample(CommoditydetailExample example);

    Commoditydetail selectByPrimaryKey(Integer commoditydetailId);

    int updateByExampleSelective(@Param("record") Commoditydetail record, @Param("example") CommoditydetailExample example);

    int updateByExample(@Param("record") Commoditydetail record, @Param("example") CommoditydetailExample example);

    int updateByPrimaryKeySelective(Commoditydetail record);

    int updateByPrimaryKey(Commoditydetail record);
}