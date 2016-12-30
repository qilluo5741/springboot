package com.spring.test;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.spring.Application;
import com.spring.service.UserInfoService;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes =Application.class)
public class ApplicationTest {
	@Resource  
	private UserInfoService Service;
	
	@Test
	public void ToStringLoads() {
		Service.getFindUserInfoAll();
	}
}
