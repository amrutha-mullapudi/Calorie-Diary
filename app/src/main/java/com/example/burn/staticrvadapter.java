package com.example.burn;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class staticrvadapter extends RecyclerView.Adapter<staticrvadapter.staticrviewholder> {

    private ArrayList<staticrvmodel> rvitems;
    int row_index=-1;

    public staticrvadapter(ArrayList<staticrvmodel> rvitems) {
        this.rvitems = rvitems;
    }


    @NonNull
    @Override
    public staticrviewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.staticrv_item,parent,false);
        staticrviewholder staticr= new staticrviewholder(view);
        return staticr;
    }

    @Override
    public void onBindViewHolder(@NonNull staticrviewholder holder, final int position) {
      staticrvmodel str= rvitems.get(position);
      holder.image.setImageResource(str.getImage());
      holder.text.setText(str.getText());

      holder.linearLayout.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View view) {
              row_index=position;
              notifyDataSetChanged();
          }

      });
      if (position==row_index){
          holder.linearLayout.setBackgroundResource(R.drawable.backcolor);
      }
      else {
          holder.linearLayout.setBackgroundResource(R.drawable.homepageshape);
      }
    }

    @Override
    public int getItemCount() {
        return rvitems.size();
    }

    public static class staticrviewholder extends RecyclerView.ViewHolder{

        TextView text;
        ImageView image;
        LinearLayout linearLayout;

        public staticrviewholder(@NonNull View itemView) {
            super(itemView);
            text= itemView.findViewById(R.id.vegietxt);
            image=itemView.findViewById(R.id.veggie);
            linearLayout = itemView.findViewById(R.id.item);

        }





    }

}
