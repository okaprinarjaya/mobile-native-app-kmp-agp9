package com.example.mynolduaapp.book.presentation.book_list

import com.example.mynolduaapp.book.domain.Book
import com.example.mynolduaapp.core.presentation.UiText

data class BookListState(
    val searchQuery: String = "Kotlin",
    val searchResults: List<Book> = emptyList(),
    val favoriteBooks: List<Book> = emptyList(),
    val isLoading: Boolean = true,
    val selectedTabIndex: Int = 0,
    val errorMessage: UiText? = null
)
