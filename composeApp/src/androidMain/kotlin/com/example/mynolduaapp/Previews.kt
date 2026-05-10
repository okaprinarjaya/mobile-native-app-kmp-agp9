package com.example.mynolduaapp

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.mynolduaapp.book.domain.Book
import com.example.mynolduaapp.book.presentation.book_list.BookListScreen
import com.example.mynolduaapp.book.presentation.book_list.BookListState
import com.example.mynolduaapp.book.presentation.book_list.components.BookSearchBar

// @Preview
// @Composable
// fun BookSearchBarPreview() {
//     MaterialTheme {
//         BookSearchBar(
//             searchQuery = "Kotlin",
//             onSearchQueryChange = {},
//             onImeSearch = {},
//             modifier = Modifier.fillMaxWidth()
//         )
//     }
// }

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

@Preview
@Composable
fun BookListScreenPreview() {
    BookListScreen(
        state = BookListState(
            searchResults = books,

            ),
        onAction = {}
    )
}