package com.kang.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.kang.common.msg.ErrorCode;
import com.kang.common.msg.Message;
import com.kang.mapper.master.MasterUserMapper;
import com.kang.mapper.slave.SlaveUserMapper;

@RestController
public class UserController {

	@Autowired
	private MasterUserMapper masterUserMapper;
	
	@Autowired
	private SlaveUserMapper slaveUserMapper;
	
	
	@RequestMapping(value = "/userList",method=RequestMethod.GET)
    public Message<?> userList() {
		Map<String,Object> result = new HashMap<>();
		result.put("masterUserList", masterUserMapper.getUserAll());
		result.put("slaveUserList", slaveUserMapper.getUserAll());
        return new Message<>(ErrorCode.SUCCESS,result);
    }
	
	@Transactional
	@RequestMapping(value = "/updateUser",method=RequestMethod.GET)
    public Message<?> updateUser() {
		masterUserMapper.updateUser();
		//int i = 1 / 0;
		slaveUserMapper.updateUser();
        return new Message<>(ErrorCode.SUCCESS);
    }
}
