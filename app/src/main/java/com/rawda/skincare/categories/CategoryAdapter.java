package com.rawda.skincare.categories;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.rawda.skincare.R;
import com.rawda.skincare.model.Category;

import java.util.List;

public class CategoryAdapter extends RecyclerView.Adapter<CategoryViewHolder> {
    private static final String TAG = CategoriesActivity.class.getSimpleName();
    private Context context;
    private List<Category> categories;

    public CategoryAdapter(Context context, List<Category> categories) {
        this.context = context;
        this.categories = categories;
    }

    public void setCategories(List<Category> categories) {
        this.categories = categories;
    }

    @NonNull
    @Override
    public CategoryViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.category_item, parent, false);
        /*ImageView imageView = view.findViewById(R.id.category_imageView);
        TextView textView = view.findViewById(R.id.category_textView);
        ImageButton imageButton = view.findViewById(R.id.category_imageButton);*/

        return new CategoryViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final CategoryViewHolder holder, int position) {
        Log.v(TAG, "onBindViewHolder Position : " + position);
        final Category category = categories.get(position);
        holder.textView.setText(category.getTitle());
        holder.imageView.setImageResource(category.getImage());
        if (category.isFavourite()) {
            holder.imageButton.setImageResource(R.drawable.favorite);
        } else {
            holder.imageButton.setImageResource(R.drawable.favorite_border);
        }
        holder.imageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                category.setFavourite(!category.isFavourite());
                if (category.isFavourite())
                    holder.imageButton.setImageResource(R.drawable.favorite);
                else holder.imageButton.setImageResource(R.drawable.favorite_border);
            }
        });
        holder.imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //TODO
            }
        });
    }

    @Override
    public int getItemCount() {
        return categories.size();
    }

}
