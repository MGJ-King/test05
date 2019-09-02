package com.mgj.mapper;

import com.mgj.entity.Users;
import org.apache.ibatis.annotations.Insert;

public interface UserMapper {

    @Insert("insert into users (id,usercode,username,department) values (null,#{usercode},#{username},#{department})")
    int add(Users user);
}
