package com.example.burn;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;

import java.util.List;

public class adapterclass extends PagerAdapter {

    private List<modelview> model;
    private LayoutInflater inflater;
    private Context context;

    public adapterclass(List<modelview> model, Context context) {
        this.model = model;
        this.context = context;
    }


    @Override
    public int getCount() {
        return model.size();
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {
        return view.equals(object);
    }

    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position) {
        inflater = LayoutInflater.from(context);
        View view=inflater.inflate(R.layout.view1,container,false);

        ImageView viewer;
        TextView title,desc;

        viewer = view.findViewById(R.id.viewer1);
        title = view.findViewById(R.id.viewertext);
        desc = view.findViewById(R.id.viewer1text);

        viewer.setImageResource(model.get(position).getImage());
        title.setText(model.get(position).getTitle());
        desc.setText(model.get(position).getTextbox());

        container.addView(view,0);
        return view;
    }

    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
        super.destroyItem(container, position, object);
    }
}
