package com.example.mynolduaapp.book.data.network

import com.example.mynolduaapp.book.data.dto.BookWorkDto
import com.example.mynolduaapp.book.data.dto.SearchResponseDto
import com.example.mynolduaapp.core.domain.DataError
import com.example.mynolduaapp.core.domain.Result

interface RemoteBookDataSource {
    suspend fun searchBooks(
        query: String,
        resultLimit: Int? = null
    ): Result<SearchResponseDto, DataError.Remote>

    suspend fun getBookDetails(bookWorkId: String) : Result<BookWorkDto, DataError.Remote>
}