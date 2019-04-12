package com.arnisand.remindermap.domain.usecase.event

import com.arnisand.remindermap.domain.model.entiti.event.EventMap
import io.reactivex.Completable
import io.reactivex.Single

interface EventMapUseCase {

    fun getEventMap(id: Long): Single<EventMap>
    fun getAll(): Single<List<EventMap>>

    fun saveEventMap(eventMap: EventMap): Single<Long>

    fun deleteEventMap(id: Long): Completable
}