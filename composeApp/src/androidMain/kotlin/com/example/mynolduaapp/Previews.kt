package com.example.mynolduaapp

import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.example.mynolduaapp.book.domain.Book
import com.example.mynolduaapp.book.presentation.book_list.BookListScreen
import com.example.mynolduaapp.book.presentation.book_list.BookListState

@Preview
@Composable
private fun BookListScreenPreview() {
    BookListScreen(
        state = BookListState(
            searchResults = books,
            isLoading = false
        ),
        onAction = {}
    )
}

private val books = (1..100).map {
    Book(
        id = it.toString(),
        title = "Book $it",
        imageUrl = "https://test.local",
        authors = listOf("Oka Prinarjaya", "Janice", "Viona"),
        description = "Description $it",
        languages = emptyList(),
        firstPublishYear = null,
        averageRating = 4.67854,
        ratingCount = 5,
        numPages = 100,
        numEditions = 3
    )
}