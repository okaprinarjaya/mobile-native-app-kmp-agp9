package com.example.mynolduaapp

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.mynolduaapp.book.domain.Book
import com.example.mynolduaapp.book.presentation.book_list.BookListScreen
import com.example.mynolduaapp.book.presentation.book_list.BookListState
import com.example.mynolduaapp.book.presentation.book_list.books
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