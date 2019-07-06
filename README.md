# Kotlin Infinite Flow Demo

Simple Spring Boot app with Kotlin that streams numbers from 0 to infinity. This is to demonstrate that `asPublisher()` is evaluated eagerly.

 * `/controller` endpoint is implemented with `@RestController` and is working fine
 * `/router` is implemented with `RouterFunction` and gets stuck when called
