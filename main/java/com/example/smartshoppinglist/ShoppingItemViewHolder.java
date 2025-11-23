package com.example.smartshoppinglist;

import android.view.View;
import android.widget.CheckBox;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

public class ShoppingItemViewHolder extends  RecyclerView.ViewHolder {

    public  TextView textItemName;
    public CheckBox checkBoxCompleted;
    public ShoppingItemViewHolder(View itemView) {
        super(itemView);
        textItemName = itemView.findViewById(R.id.textItemName);
        checkBoxCompleted = itemView.findViewById(R.id.checkBoxCompleted);

    }
}
