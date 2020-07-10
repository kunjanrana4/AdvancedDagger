package com.raywenderlich.common.events

/**
 * A consumer of an event of selection into a RecyclerView
 */
typealias OnViewHolderItemSelected<T> = (T) -> Unit
