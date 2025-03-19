package com.appsv.library.domain

import com.appsv.library.common.BookModel
import com.appsv.library.common.BooksCategoryModel
import com.appsv.library.common.ResultState
import kotlinx.coroutines.flow.Flow

interface AllBookRepo {

    fun getAllBooks() : Flow<ResultState<List<BookModel>>>
    fun getAllCategory() : Flow<ResultState<List<BooksCategoryModel>>>
    fun getAllBooksByCategory(category : String) : Flow<ResultState<List<BookModel>>>

}