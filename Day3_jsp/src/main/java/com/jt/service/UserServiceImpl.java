package com.jt.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jt.mapper.UserMapper;
import com.jt.pojo.User;

@Service
public class UserServiceImpl implements UserService {
@Autowired
private UserMapper userMapper;

@Override
public List<User> findAll() {
	
	return userMapper.selectList(null);
}

}
