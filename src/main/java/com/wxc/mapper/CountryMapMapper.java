package com.wxc.mapper;

import com.wxc.vo.CityVo;
import com.wxc.vo.ProvinceVo;

import java.util.List;

public interface CountryMapMapper {

    List<ProvinceVo> queryProvinceCity();

    List<CityVo> queryCityNum();
}
