package ir.mrsaadat

import io.ktor.server.engine.*
import io.ktor.server.netty.*
import ir.mrsaadat.plugins.*

fun main() {
    embeddedServer(Netty, port = 8080, host = "0.0.0.0") {
        configureRouting()
        configureSecurity()
        configureHTTP()
    }.start(wait = true)
}
