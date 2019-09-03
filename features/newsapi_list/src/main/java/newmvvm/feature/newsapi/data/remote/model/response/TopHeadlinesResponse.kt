package newmvvm.feature.newsapi.data.remote.model.response

import newmvvm.feature.newsapi.data.remote.model.ArticleModel

data class TopHeadlinesResponse(
        val status:String,
        val articles: List<ArticleModel>
)