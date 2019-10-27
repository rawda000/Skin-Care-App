package com.rawda.skincare.categories_MVP;

import com.rawda.skincare.model.Category;

import java.util.List;

public interface CategoryListContract {
    interface IModel {
        List<Category> createCategories();

        boolean updateCategory(Category newCategory);

        Category getCategory(String title);
    }

    interface IPresenter {
        List createCategories();

        void onCategoryClicked();

        void onSearch();

        void loadCategories();

        void dropView();
    }

    interface IView {
        void showCategories(List<Category> categories);

        void showLoadingError(String message);

        void showSearchResults();

        void showMenu();

        void showProgressbar();

        void categoryClickAction();
        void hideProgressbar();

        void showErrMessage(String message);
    }

    interface OnResponseCallBack {
        void onResponse(List<Category> categories);

        void onError(String message);
    }
}
