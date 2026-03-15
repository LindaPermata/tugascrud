package com.example.tugascrud.service;



import com.example.tugascrud.model.dto.KtpAddRequest;
import com.example.tugascrud.model.dto.KtpDto;

import java.util.List;

public interface KtpService {

    KtpDto add(KtpAddRequest request);

    List<KtpDto> getAll();

    KtpDto getById(Integer id);

    KtpDto update(Integer id, KtpAddRequest request);

    void delete(Integer id);

}