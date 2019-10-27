package com.rawda.skincare.categories;

import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.rawda.skincare.R;


public class CategoryViewHolder extends RecyclerView.ViewHolder {
    ImageView imageView;
    TextView textView;
    ImageButton imageButton;

    public CategoryViewHolder(@NonNull View itemView) {
        super(itemView);
        imageView = itemView.findViewById(R.id.category_imageView);
        textView = itemView.findViewById(R.id.category_textView);
        imageButton = itemView.findViewById(R.id.category_imageButton);
    }


}