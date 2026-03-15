package com.example.tugascrud.service

import com.example.tugascrud.model.dto.KtpAddRequest
import com.example.tugascrud.model.dto.KtpDto


interface KtpService {
    fun addKtp(request: KtpAddRequest?): KtpDto?

    val allKtp: MutableList<KtpDto?>?

    fun getKtpById(id: Int?): KtpDto?

    fun updateKtp(id: Int?, request: KtpAddRequest?): KtpDto?

    fun deleteKtp(id: Int?)
}