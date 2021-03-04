package com.wxc.service;

import com.wxc.common.ServerResponse;
import com.wxc.vo.ProvinceVo;

import java.util.List;

public interface ICountryMapService {
    ServerResponse<List<ProvinceVo>> getMapData();
}
