package com.muhammet.mapper;

import com.muhammet.repository.entity.UserProfile;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;
import com.muhammet.dto.request.EditProfileRequestDto;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = "spring")
public interface IUserProfileMapper {

  IUserProfileMapper INSTANCE = Mappers.getMapper(IUserProfileMapper.class);

  UserProfile toUserProfile(final EditProfileRequestDto dto);

}
