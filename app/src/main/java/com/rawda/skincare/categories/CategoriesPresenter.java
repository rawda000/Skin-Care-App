package com.rawda.skincare.categories;

import com.rawda.skincare.categories_MVP.CategoryListContract;
import com.rawda.skincare.model.Category;

import java.util.ArrayList;
import java.util.List;

public class CategoriesPresenter implements CategoryListContract.IPresenter {
    private CategoryListContract.IView view;
    private CategoryListContract.IModel model;
    // TODO add Model to constructor
    public CategoriesPresenter(CategoryListContract.IView view) {
        this.view = view;
    }

    public void setModel(CategoryListContract.IModel model) {
        this.model = model;
    }

    @Override
    public List createCategories() {

        List<Category> categories = new ArrayList<>();
        categories.add(new Category("Acne Cure"));
        categories.add(new Category("Anti-aging"));
        categories.add(new Category("Dry Skin"));
        categories.add(new Category("Glowing Skin"));
        categories.add(new Category("Large Pores"));
        categories.add(new Category("Oily skin"));
        categories.add(new Category("Sunscreen"));
        return categories;
    }


    @Override
    public void onCategoryClicked() {
        view.categoryClickAction();
    }

    @Override
    public void onSearch() {

    }

    @Override
    public void loadCategories() {

    }

    @Override
    public void dropView() {
        view = null;
    }
}
