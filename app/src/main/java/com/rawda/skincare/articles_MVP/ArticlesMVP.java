package com.rawda.skincare.articles_MVP;

import com.rawda.skincare.model.Article;

import java.util.List;

public interface ArticlesMVP {
    interface IModel {
        boolean getArticle(String title);
    }

    interface IPresenter {
        void loadArticles();
        void dropView();
        void articleClicked();
        void shareArticle();
        void markFavourite();
        void searchArticles(String title);
        void addToFavourites();
    }

    interface IView {
        void showArtclesList(List<Article> articles);
        void showSearchResults(List<Article> articles);
//        void viewShare(String message);
    }
}
