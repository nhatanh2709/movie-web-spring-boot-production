package com.example.identity_service.mapper;

import com.example.identity_service.dto.request.UserUpdateRequest;
import com.example.identity_service.dto.response.UserResponse;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;

import com.example.identity_service.dto.request.UserCreationRequest;
import com.example.identity_service.entiy.User;


@Mapper(componentModel = "spring")
public interface UserMapper {
    User toUser(UserCreationRequest request);

    UserResponse toUserReponse(User user);
    void updateUser(@MappingTarget User user, UserUpdateRequest request);
}
