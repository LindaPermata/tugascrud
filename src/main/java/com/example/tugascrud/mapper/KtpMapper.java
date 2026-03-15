package com.example.tugascrud.mapper;

import com.example.tugascrud.model.dto.KtpDto;
import com.example.tugascrud.model.entity.KtpEntity;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface KtpMapper {

    KtpDto toKtpDto(KtpEntity entity);

    KtpEntity toKtpEntity(KtpDto dto);

}