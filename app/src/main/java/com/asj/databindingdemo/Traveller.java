package com.asj.databindingdemo;

import android.databinding.BindingAdapter;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

public class Traveller {
    public String pic;
    public String fName;
    public String lName;
    public String email;

    @BindingAdapter({"android:userPic"})
    public static void loadImage(ImageView view, String imageUrl) {
         Picasso.with(view.getContext()).load(imageUrl).into(view);
    }
}
