package com.rawda.skincare.categories;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.widget.GridLayout;
import android.widget.Toast;

import com.rawda.skincare.R;
import com.rawda.skincare.categories_MVP.CategoryListContract;
import com.rawda.skincare.model.Category;

import java.util.List;

// Passive View
public class CategoriesActivity extends AppCompatActivity implements CategoryListContract.IView {
    private static final String TAG = CategoriesActivity.class.getSimpleName();
    private CategoryListContract.IPresenter presenter;
    private RecyclerView recyclerView;
    private CategoryAdapter adapter;
    private final int SPAN_COUNT = 2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initViews();
    }

    private void initViews() {
        presenter = new CategoriesPresenter(this);
        adapter = new CategoryAdapter(this, presenter.createCategories());
        GridLayoutManager gridLayoutManager = new GridLayoutManager(this, SPAN_COUNT,
                RecyclerView.VERTICAL, false);
        recyclerView = findViewById(R.id.categories_recyclerView);
//    MyGridLayoutManager myGridLayoutManager = new MyGridLayoutManager(this, 2);
        recyclerView.setLayoutManager(gridLayoutManager);
        recyclerView.setAdapter(adapter);
    }

    private void showOrHideListView(boolean flag) {
        if (flag) {
            recyclerView.setVisibility(View.VISIBLE);
        } else {
            recyclerView.setVisibility(View.VISIBLE);
        }
    }

    @Override
    public void showCategories(List<Category> categories) {
        if (!categories.isEmpty()) {
            adapter.setCategories(categories);
            showOrHideListView(true);
        }
    }

    @Override
    public void showLoadingError(String message) {
        hideProgressbar();
        showOrHideListView(false);
        showErrMessage(message);

    }

    @Override
    public void showSearchResults() {

    }

    @Override
    public void showMenu() {

    }

    @Override
    public void showProgressbar() {

    }

    @Override
    public void categoryClickAction() {

    }

    @Override
    public void hideProgressbar() {

    }

    @Override
    public void showErrMessage(String message) {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        presenter.dropView();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        super.onCreateOptionsMenu(menu);
        getMenuInflater().inflate(R.menu.categories_menu, menu);
        return true;
    }
}
