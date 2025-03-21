package org.opensearch.commons.storage.model

import org.opensearch.commons.storage.api.StorageEngine
import org.opensearch.commons.storage.api.StorageOperation

data class StorageResponse<T> (
    val payload: T? = null,
    val operation: StorageOperation,
    val engine: StorageEngine,
    val error: String? = null
)
