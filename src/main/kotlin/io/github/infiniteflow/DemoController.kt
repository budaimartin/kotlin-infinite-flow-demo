package io.github.infiniteflow

import org.springframework.http.MediaType
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class DemoController {
    @GetMapping("/controller", produces = [MediaType.APPLICATION_STREAM_JSON_VALUE])
    fun get() = infinite()
}
