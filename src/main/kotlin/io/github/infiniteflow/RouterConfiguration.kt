package io.github.infiniteflow

import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.reactive.flow.asPublisher
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.http.MediaType
import org.springframework.web.reactive.function.server.body
import org.springframework.web.reactive.function.server.router

@Configuration
class RouterConfiguration {

    @Bean
    fun router() = router {
        GET("/router").nest {
            accept(MediaType.APPLICATION_STREAM_JSON) {
                ok().body(infinite().asPublisher())
            }
        }
    }
}
