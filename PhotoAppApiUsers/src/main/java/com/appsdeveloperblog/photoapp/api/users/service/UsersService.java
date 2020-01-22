package com.appsdeveloperblog.photoapp.api.users.service;

import org.springframework.security.core.userdetails.UserDetailsService;

import com.appsdeveloperblog.photoapp.api.users.shared.UserDTO;

public interface UsersService extends UserDetailsService {
	UserDTO createUser(UserDTO userDetails);
	UserDTO getUserByUserId(String userId);
	UserDTO getUserDetailsByEmail(String email);
}
