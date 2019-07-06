package io.github.infiniteflow

import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.onEach

fun infinite() = flow {
    var i = 0
    while (true) {
        emit(i++)
        delay(500)
    }
}.onEach {
    println("Emitted $it")
}
