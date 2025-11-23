package com.example.smartshoppinglist;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;


public class ShoppingListAdapter extends RecyclerView.Adapter<ShoppingItemViewHolder> {
    private final List<ShoppingItem> shoppingList;

    public ShoppingListAdapter(List<ShoppingItem> shoppingList) {
        this.shoppingList = shoppingList;
    }

    @NonNull
    @Override
    public ShoppingItemViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_shopping, parent, false);
        return new ShoppingItemViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ShoppingItemViewHolder holder, int position) {

        ShoppingItem currentItem = shoppingList.get(position);

        holder.textItemName.setText(currentItem.getName());
        holder.checkBoxCompleted.setChecked(currentItem.isCompleted());
    }

    @Override
    public int getItemCount() {
        return shoppingList.size();
    }
}


