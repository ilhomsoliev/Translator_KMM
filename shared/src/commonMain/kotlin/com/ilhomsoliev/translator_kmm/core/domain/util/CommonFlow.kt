package com.ilhomsoliev.translator_kmm.core.domain.util

import kotlinx.coroutines.flow.Flow

fun <T> Flow<T>.toCommonFlow() = CommonFlow(this)
expect class CommonFlow<T>(flow: Flow<T>): Flow<T>