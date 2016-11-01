package com.idea4j.service.impl;

import com.idea4j.mapper.UserMapper;
import com.idea4j.model.User;
import com.idea4j.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by markee on 2016/11/1.
 */
@Service
public class UserServiceImpl implements UserService{
    @Autowired
    private UserMapper mapper;

    public boolean add(User user) {
        return mapper.insert(user) > 0;
    }

    public List<User> findAll() {
        return mapper.selectByExample(null);
    }
}
