package com.example.laboratorio05.repositories

import com.example.laboratorio05.data.dao.CastDao
import com.example.laboratorio05.data.model.CastModel

class CastRepository(private val castDao: CastDao) {

    suspend fun insertCast(casting: CastModel) = castDao.insertCast(casting)
}