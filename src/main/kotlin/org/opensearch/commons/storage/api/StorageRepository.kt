package org.opensearch.commons.storage.api

import org.opensearch.commons.storage.model.StorageRequest
import org.opensearch.commons.storage.model.StorageResponse

interface StorageRepository {
    suspend fun save(request: StorageRequest<Any>): StorageResponse<Any>
    suspend fun get(request: StorageRequest<Any>): StorageResponse<Any>
    suspend fun search(request: StorageRequest<Any>): StorageResponse<Any>
    suspend fun update(request: StorageRequest<Any>): StorageResponse<Any>
    suspend fun delete(request: StorageRequest<Any>): StorageResponse<Any>
}