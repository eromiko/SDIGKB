package com.sdig.kb.controller;

import com.sdig.kb.entity.User;
import com.sdig.kb.mapper.UserMapper;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/SDInterface")
public class UserController {
    @Resource
    UserMapper userMapper;

    @PostMapping("/persontotal")
    private List<User> getPersonTotal(){
        return userMapper.userAll();
    }

    @PostMapping("/zsqytotal")
    private List<User> getZsqyTotal(){
        return userMapper.zsqyAll();
    }

    @PostMapping("/txtotal")
    private List<User> getTxTotal(){
        return userMapper.txAll();
    }

    @PostMapping("/lztotal")
    private List<User> getLzTotal(){
        return userMapper.lzAll();
    }

    @PostMapping("/xbtotal")
    private List<User> getXbTotal(){
        return userMapper.xbAll();
    }

    @PostMapping("/rylbtotal")
    private List<User> getRylbTotal(){
        return userMapper.rylbAll();
    }

    @PostMapping("/zjtotal")
    private List<User> getZjTotal(){
        return userMapper.zjAll();
    }

    @PostMapping("/xltotal")
    private List<User> getXlTotal(){
        return userMapper.xlAll();
    }

    @PostMapping("/zctotal")
    private List<User> getZcTotal(){
        return userMapper.zcAll();
    }

    @PostMapping("/nltotal")
    private List<User> getNlTotal(){
        return userMapper.nlAll();
    }
}
