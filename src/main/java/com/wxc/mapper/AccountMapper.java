package com.wxc.mapper;

import org.apache.ibatis.annotations.Param;

public interface AccountMapper {

    //in
    public  void  transferIn(@Param("name") String name, @Param("money") double money);
    //out
    public  void  transferOut(@Param("name") String name, @Param("money") double money);

}
