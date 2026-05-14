package com.example.mynolduaapp.book.presentation.book_detail

import com.example.mynolduaapp.book.domain.Book

data class BookDetailState(
    val isLoading: Boolean = true,
    val isFavorite: Boolean = false,
    val book: Book? = null
)
