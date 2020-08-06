package com.lti.training.postmicro.feignproxy;

import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.lti.training.postmicro.dto.UserDetailDto;

@FeignClient(name = "api-gateway")
//@FeignClient(name = "user-micro")
@RibbonClient(name = "user-micro")
public interface UserServiceProxy {
	
	// what are the rest end-point of that MS, we need to call
		// actual method signatures of those REST-endpoint
	
	 
	 @GetMapping("/user/get/{userId}")
	
	public ResponseEntity<UserDetailDto> getUserDetail(@PathVariable Integer userId);

}
