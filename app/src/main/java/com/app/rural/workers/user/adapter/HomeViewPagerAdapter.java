package com.app.rural.workers.user.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;

import com.app.rural.workers.user.R;
import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;
import com.squareup.picasso.Picasso;

import java.util.List;

public class HomeViewPagerAdapter extends PagerAdapter {

    private Context context;
    private List<String> urlList;
    private LayoutInflater layoutInflater;
    int current_page;

    public HomeViewPagerAdapter(Context context, List<String> urlList)
    {
        this.context=context;
        this.urlList=urlList;
    }
    @Override
    public int getCount() {
        return urlList.size();
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {
        return view==object;
    }

    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position) {
        layoutInflater=(LayoutInflater) context.getSystemService(
                Context.LAYOUT_INFLATER_SERVICE
        );
        View view =layoutInflater.inflate(R.layout.home_viewpager_design,null);
        ImageView imageView=view.findViewById(R.id.home_viewpager_image_view);

//        Picasso.get()
//                .load("http://localhost:7080/api/v1/file/user/image/sample.jpg")
//                .error(R.drawable.app_logo)
//                .into(imageView);

        Picasso.with(context).load("http://localhost:7080/api/v1/file/user/image/sample.jpg").error(R.drawable.app_logo).into(imageView);

//        RequestOptions options = new RequestOptions()
//                .centerCrop()
//                .placeholder(R.drawable.app_logo)
//                .error(R.drawable.gradient_background);
//
//
//
//        Glide.with(context).load("https://media.geeksforgeeks.org/wp-content/uploads/20210101144014/gfglogo.png").apply(options).into(imageView);

        //Picasso.get().load(urlList.get(position)).into(imageView);
        ViewPager viewPager=(ViewPager) container;
        viewPager.addView(view,0);
        return view;
    }

    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
        ViewPager viewPager=(ViewPager) container;
        View view=(View) object;
        viewPager.removeView(view);
    }
}
