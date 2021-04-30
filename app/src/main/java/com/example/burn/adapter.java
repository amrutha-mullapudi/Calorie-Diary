package com.example.burn;

import android.content.Context;
import android.media.Image;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.Filter;
import android.widget.Filterable;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class adapter extends RecyclerView.Adapter<adapter.sviewholder> {

    private ArrayList<example_item> example_items;

    public adapter(ArrayList<example_item> example_items) {
        this.example_items = example_items;
    }

    @NonNull
    @Override
    public sviewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.breakfast,parent,false);
        adapter.sviewholder stat= new adapter.sviewholder(view);
        return stat;
    }

    @Override
    public void onBindViewHolder(@NonNull sviewholder holder, int position) {

        example_item str= example_items.get(position);
        holder.image.setImageResource(str.getImage1());
        holder.text.setText(str.getStrng());
        holder.text1.setText(str.getString1());

    }

    @Override
    public int getItemCount() {
        return example_items.size();
    }


    public static class sviewholder extends RecyclerView.ViewHolder{

        TextView text,text1;
        ImageView image;

        public sviewholder(@NonNull View itemView) {
            super(itemView);
            text= itemView.findViewById(R.id.vegietxt);
            image=itemView.findViewById(R.id.veggie);
            text1=itemView.findViewById(R.id.breakfastlayout);

        }
    }

}
