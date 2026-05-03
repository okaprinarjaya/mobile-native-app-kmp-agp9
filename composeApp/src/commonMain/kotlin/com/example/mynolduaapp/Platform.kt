package com.example.mynolduaapp

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform