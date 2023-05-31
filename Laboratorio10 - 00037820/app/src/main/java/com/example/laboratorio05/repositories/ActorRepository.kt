package com.example.laboratorio05.repositories

import com.example.laboratorio05.data.dao.ActorDao
import com.example.laboratorio05.data.model.ActorModel

class ActorRepository(private val actorDao: ActorDao) {
        suspend fun getActor() = actorDao.getAllActor()

        suspend fun insertActor(actor: ActorModel) = actorDao.insertActors(actor)
}