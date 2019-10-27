package com.rawda.skincare.categories;

import android.content.Context;

import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class MyGridLayoutManager extends GridLayoutManager {
    private int spanCount;
    private int colWidth;

    public MyGridLayoutManager(Context context, int spanCount) {
        super(context, spanCount);
    }

    @Override
    public void setSpanCount(int spanCount) {
        this.spanCount = spanCount;
    }

    @Override
    public int getSpanCount() {
        super.getSpanCount();
        return this.spanCount;
    }

    public void setColWidth(int newColWidth) {
        if (newColWidth > 0 && newColWidth != colWidth) {
            this.colWidth = newColWidth;
        }
    }

    @Override
    public void onLayoutChildren(RecyclerView.Recycler recycler, RecyclerView.State state) {
        int totalWidth;
        if (colWidth > 0) {
            if (getOrientation() == RecyclerView.VERTICAL) {
                totalWidth = getWidth() - getPaddingTop() - getPaddingBottom();
            } else {
                totalWidth = getWidth() - getPaddingRight() - getPaddingLeft();
            }
            spanCount = Math.max(1, totalWidth / colWidth);
            setSpanCount(spanCount);
        }
    //    super.onLayoutChildren(recycler, state);
    }
}
