package com.lti.training.usermicro.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lti.training.usermicro.dto.RegisterDto;
import com.lti.training.usermicro.dto.UserDetailDto;
import com.lti.training.usermicro.dto.UserExceptionDto;
import com.lti.training.usermicro.service.UserService;
import com.lti.usermicro.exception.UserConstraintException;

  @RestController
  
  @RequestMapping("/user") public class UserController {
  
  private UserService userService;
 
 @Autowired public UserController(UserService userService) { 
	 this.userService=userService;
 
  }
 
  
	/*              Method just to post without any response status
	 * @PostMapping("/register") public UserDetailDto register (@Valid @RequestBody
	 * RegisterDto registerDto, BindingResult result) { if(result.hasErrors()) { //
	 * throw a custom exception throw new
	 * UserConstraintException("Invalid Registration data!!!"); }
	 * 
	 * UserDetailDto userDetailDto = this.userService.register(registerDto); return
	 * userDetailDto;
	 * 
	 * } 
	 * 
	 */
 
 
 
 @PostMapping("/register")
	
	public ResponseEntity<UserDetailDto> register(@Valid @RequestBody RegisterDto registerDto, BindingResult result) {
		if(result.hasErrors()) {
			// throw a custom exception
			throw new UserConstraintException("Invalid Registration data!!!");
		}
		// take help of service layer
		UserDetailDto userDetailDto =  this.userService.register(registerDto);
		ResponseEntity<UserDetailDto> response = 
				new ResponseEntity<UserDetailDto>(userDetailDto, HttpStatus.OK);
		return response;
	}
  
	/*      placed this method in UserGlobalexceptionHandler
	 * @ExceptionHandler(UserConstraintException.class) public
	 * ResponseEntity<UserExceptionDto>
	 * handleConstraintException(UserConstraintException ex) { UserExceptionDto
	 * exception = new UserExceptionDto(ex.getMessage(), System.currentTimeMillis(),
	 * HttpStatus.BAD_REQUEST.value()); ResponseEntity<UserExceptionDto> response =
	 * new ResponseEntity<UserExceptionDto>(exception, HttpStatus.BAD_REQUEST);
	 * return response; }
	 */
 
 }
 

