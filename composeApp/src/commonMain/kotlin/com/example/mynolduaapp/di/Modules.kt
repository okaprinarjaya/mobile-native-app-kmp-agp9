package com.example.mynolduaapp.di

import com.example.mynolduaapp.book.data.network.KtorRemoteBookDataSource
import com.example.mynolduaapp.book.data.network.RemoteBookDataSource
import com.example.mynolduaapp.book.data.repository.DefaultBookRepository
import com.example.mynolduaapp.book.domain.BookRepository
import com.example.mynolduaapp.book.presentation.SelectedBookViewModel
import com.example.mynolduaapp.book.presentation.book_detail.BookDetailViewModel
import com.example.mynolduaapp.book.presentation.book_list.BookListViewModel
import com.example.mynolduaapp.core.data.HttpClientFactory
import org.koin.core.module.Module
import org.koin.core.module.dsl.singleOf
import org.koin.core.module.dsl.viewModelOf
import org.koin.dsl.bind
import org.koin.dsl.module

expect val platformModule: Module

val sharedModule = module {
    single {
        HttpClientFactory.create(get())
    }
    singleOf(::KtorRemoteBookDataSource).bind<RemoteBookDataSource>()
    singleOf(::DefaultBookRepository).bind<BookRepository>()


    viewModelOf(::BookListViewModel)
    viewModelOf(::BookDetailViewModel)
    viewModelOf(::SelectedBookViewModel)
}