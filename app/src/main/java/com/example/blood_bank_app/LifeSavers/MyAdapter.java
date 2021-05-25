package com.example.blood_bank_app.LifeSavers;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.viewpager.widget.PagerAdapter;

import com.example.blood_bank_app.R;

import java.util.ArrayList;

public class MyAdapter extends PagerAdapter {

    private Context context;
    private ArrayList<MyModel> modelArrayList;

    //constructor
    public MyAdapter(Context context, ArrayList<MyModel> modelArrayList) {
        this.context = context;
        this.modelArrayList = modelArrayList;
    }



    @Override
    public int getCount() {
        return modelArrayList.size();//return size of items in list
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {
        return view.equals(object);
    }

    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position) {

        //inflate layout card_item.xml
        View view = LayoutInflater.from(context).inflate(R.layout.card_item, container, false);

        //init uid view from card_item.xml
        ImageView banner1 = view.findViewById(R.id.banner1);
        TextView Title1 = view.findViewById(R.id.Title1);
        TextView description1 = view.findViewById(R.id.description1);
        TextView date1 = view.findViewById(R.id.date1);

        //get data
        MyModel model = modelArrayList.get(position);
        String title = model.getTitle();
        String description = model.getDescription();
        String date = model.getDate();
        int image = model.getImage();

        //set data
        banner1.setImageResource(image);
        Title1.setText(title);
        description1.setText(description);
        date1.setText(date);

        //handle card click
        view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(context,title+ "\n"+ description+ "\n"+date ,Toast.LENGTH_SHORT).show();
            }
        });


        //add view to container
        container.addView(view, position);

        return view;
    }

    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
        container.removeView((View)object);
    }
}
