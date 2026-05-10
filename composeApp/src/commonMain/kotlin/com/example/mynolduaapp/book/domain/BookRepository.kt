package com.example.mynolduaapp.book.domain

import com.example.mynolduaapp.core.domain.DataError
import com.example.mynolduaapp.core.domain.Result

interface BookRepository {
    suspend fun searchBooks(
        query: String
    ): Result<List<Book>, DataError.Remote>
}