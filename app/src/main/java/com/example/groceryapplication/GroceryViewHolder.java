package com.example.groceryapplication;
import androidx.recyclerview.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

public class GroceryViewHolder extends RecyclerView.ViewHolder {

    public TextView textGroceryName, textGroceryNote;

    public GroceryViewHolder( View itemView) {
        super(itemView);
        textGroceryName = itemView.findViewById(R.id.textGroceryName);
        textGroceryNote = itemView.findViewById(R.id.textGroceryNote);
    }
}