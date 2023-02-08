package com.ilhomsoliev.translator_kmm.core.domain.util

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.StateFlow

fun <T> StateFlow<T>.toCommonStateFlow() = CommonStateFlow(this)
expect class CommonStateFlow<T>(flow: StateFlow<T>): StateFlow<T>