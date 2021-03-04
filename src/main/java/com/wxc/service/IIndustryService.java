package com.wxc.service;

import com.wxc.common.ServerResponse;

import java.util.Map;

public interface IIndustryService {

    /**
     * 1.统计各个城市招聘人数
     * @return
     */
    ServerResponse<Map<String, Object>> countCityData() ;

    /**
     * 2.热门行业top10
     */
    ServerResponse<Map<String, Object>> getIndustryTop10();

    /**
     * 3.热门行业招聘对比图
     * @return
     */
    ServerResponse<Map<String, Object>> industryCompare();
}
