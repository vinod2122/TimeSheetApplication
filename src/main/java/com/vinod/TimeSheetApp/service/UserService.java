package com.vinod.TimeSheetApp.service;
import com.vinod.TimeSheetApp.dto.UserDto;
import com.vinod.TimeSheetApp.entity.Role;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface UserService {

	List<UserDto> findAllUsers();

    UserDto findUserByEmail(String email);

    UserDto saveUser(UserDto userDto);

    UserDto findUserByName(String userName);
}
