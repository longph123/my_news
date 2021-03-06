package com.longph.domain

import com.longph.mynews.data.remote.ApiResponse
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class GetNewsUseCase @Inject constructor(val newsRepository: NewsRepository) {
    suspend fun getNewsList(): ApiResponse<NewsItems> {
        return newsRepository.getNewsList()
    }

    suspend fun getNewsDetail(newsId: String): ApiResponse<News> {
        return newsRepository.getNewDetail(newsId)
    }
}