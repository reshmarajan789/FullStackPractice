package com.lti.training.usermicro.service;

import com.lti.training.usermicro.dto.RegisterDto;
import com.lti.training.usermicro.dto.UserDetailDto;
import com.lti.training.usermicro.entity.User;

public interface UserService {
	
	public UserDetailDto register(RegisterDto registerDto) ;
	public UserDetailDto getUserDetail(Integer userId);

}
