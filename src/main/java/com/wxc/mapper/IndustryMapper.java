package com.wxc.mapper;

import com.wxc.vo.ConverterVo;
import com.wxc.vo.IndustryVo;

import java.util.List;

public interface IndustryMapper {
    List<ConverterVo> countCityPosition();

    List<IndustryVo> countIndustryTop();

    List<IndustryVo> getIndustryData(String industryName, String startDate, String endDate);
}
