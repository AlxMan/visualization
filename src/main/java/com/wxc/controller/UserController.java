package com.wxc.controller;

import com.github.pagehelper.PageInfo;
import com.wxc.common.Const;
import com.wxc.common.ResponseCode;
import com.wxc.common.ServerResponse;
import com.wxc.model.User;
import com.wxc.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;
import javax.xml.ws.Response;

@Controller
@RequestMapping("/user")
@Transactional
public class UserController {

    @Autowired
    private IUserService iUserService;

    //login
    @RequestMapping(value ="login.do",method = RequestMethod.POST)
    @ResponseBody
    public ServerResponse<User> login (String username, String password, HttpSession session) {
        ServerResponse<User> response=iUserService.login(username,password);
        if (response.getStatus()== ResponseCode.SUCCESS.getCode()){
            session.setAttribute(Const.CURRENT_USER,response.getData());
        }

        return response;
    }

    /**
     * 2.分页查找
     */
    @RequestMapping(value = "list.do", method = RequestMethod.POST)
    @ResponseBody
    public ServerResponse<PageInfo>  list(@RequestParam(value = "pageNum", defaultValue = "1") int pageNum,
                                          @RequestParam(value = "pageSize", defaultValue = "10") int pageSize){
        ServerResponse<PageInfo> users =  iUserService.getUsers(pageNum,pageSize);
        return users;
    }


    /**
     * 3.添加用户
     */
    @RequestMapping(value = "add.do", method = RequestMethod.POST)
    @ResponseBody
    public ServerResponse<String> add(User user){

        return iUserService.add(user);
    }

    /**
     * 4.删除用户
     */
    @RequestMapping(value = "deleteUser.do",method = RequestMethod.POST)
    @ResponseBody
    public ServerResponse<String> delete(int id){

        return iUserService.deleteByPrimary(id);
    }

    /**
     * 5.用户退出登录
     */
    @RequestMapping(value = "logout.do", method = RequestMethod.POST)
    @ResponseBody
    public ServerResponse<String> logout(HttpSession session){
        try{
            session.removeAttribute(Const.CURRENT_USER);
            return ServerResponse.createBySuccessMsg("注销成功");
        }catch (Exception e){
            return ServerResponse.createByErrorMsg("注销失败");
        }
    }

    /**
     * 6.根据 id更新用户信息
     */
    @RequestMapping(value = "update.do", method = RequestMethod.POST)
    @ResponseBody
    public ServerResponse<String> update(User user){
        return iUserService.update(user);
    }

    /**
     * 7.根据id查找用户信息
     */
    @RequestMapping(value = "findById.do", method = RequestMethod.POST)
    @ResponseBody
    public ServerResponse<User> findById(int id){

        return iUserService.findById(id);
    }
}
