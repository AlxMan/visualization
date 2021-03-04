package com.wxc.mapper;

import com.wxc.model.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserMapper {

    // 添加用户时的用户名有效性检查
    int checkUserName(String username);

    // 用户登录
    User selectLogin(@Param("username") String username, @Param("password") String md5Password);

    // 查询所有用户
    List<User> userList();

    // 添加用户时的邮箱有效性检查
    int checkEmail(String str);

    // 添加用户
    int insert(User user);

    // 通过主键删除用户信息
    int deleteByPrimaryKey(int id);

    // 通过主键查找用户信息
    User selectByPrimaryKey(int userId);

    // 更新用户信息
    int update(User user);

    // 更新操作时的用户名有效性检查(更新用户的现有用户名不算重复)
    int checkUpdateUserName(User user);

    // 更新操作时的邮箱有效性检查(更新用户的现有邮箱不算重复)
    int checkUpdateEmail(User user);
}
