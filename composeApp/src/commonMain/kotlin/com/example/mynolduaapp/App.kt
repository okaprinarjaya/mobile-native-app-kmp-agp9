package com.example.mynolduaapp

import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.tooling.preview.Preview
import com.example.mynolduaapp.book.presentation.book_list.BookListScreenRoot
import com.example.mynolduaapp.book.presentation.book_list.BookListViewModel

@Composable
@Preview
fun App() {
    BookListScreenRoot(
        viewModel = remember { BookListViewModel() },
        onBookClick = {}
    )
}