package com.mgj.service.seviceimpl;

import com.mgj.entity.Users;
import com.mgj.mapper.UserMapper;
import com.mgj.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;

public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    public String addUser(Users user){

        int count=userMapper.add(user);
        System.out.println("影响行数"+count);
        return count>0?"添加成功":"添加失败";
    }

}
