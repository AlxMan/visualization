package com.wxc.service;

import com.github.pagehelper.PageInfo;
import com.wxc.common.ServerResponse;
import com.wxc.model.User;

public interface IUserService {
    /**
     * login
     *
     * @param username
     * @param password
     * @return
     */
    public ServerResponse<User> login(String username, String password);

    ServerResponse<PageInfo> getUsers(int pageNum, int pageSize);

    ServerResponse<String> add(User user);

    ServerResponse<String> deleteByPrimary(int id);

    ServerResponse<User> findById(int id);

    ServerResponse<String> update(User user);
}
