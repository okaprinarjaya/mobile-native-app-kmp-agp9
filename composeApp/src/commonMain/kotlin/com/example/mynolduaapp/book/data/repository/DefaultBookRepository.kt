package com.example.mynolduaapp.book.data.repository

import com.example.mynolduaapp.book.data.mappers.toBook
import com.example.mynolduaapp.book.data.network.RemoteBookDataSource
import com.example.mynolduaapp.book.domain.Book
import com.example.mynolduaapp.book.domain.BookRepository
import com.example.mynolduaapp.core.domain.DataError
import com.example.mynolduaapp.core.domain.Result
import com.example.mynolduaapp.core.domain.map

class DefaultBookRepository(
    private val remoteBookDataSource: RemoteBookDataSource
): BookRepository {
    override suspend fun searchBooks(query: String): Result<List<Book>, DataError.Remote> {
        return remoteBookDataSource
            .searchBooks(query)
            .map { dto ->
                dto.results.map { it.toBook() }
            }
    }
}