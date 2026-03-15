package com.example.tugascrud.repository

import com.example.tugascrud.model.entity.KtpEntity
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository
import java.util.*

@Repository
interface KtpRepository : JpaRepository<KtpEntity, Int> {

    fun existsByNomorKtp(nomorKtp: String): Boolean

    fun findByNomorKtp(nomorKtp: String): Optional<KtpEntity>
}