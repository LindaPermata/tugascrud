package com.example.tugascrud.mapper;


import com.example.tugascrud.model.dto.KtpAddRequest;
import com.example.tugascrud.model.dto.KtpDto;
import com.example.tugascrud.model.entity.Ktp;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public interface KtpMapper {

    KtpMapper INSTANCE = Mappers.getMapper(KtpMapper.class);

    KtpDto toDto(Ktp ktp);

    Ktp toEntity(KtpAddRequest request);

}