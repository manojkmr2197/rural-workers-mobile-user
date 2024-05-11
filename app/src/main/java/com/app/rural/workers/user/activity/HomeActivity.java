package com.app.rural.workers.user.activity;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import com.app.rural.workers.user.R;
import com.app.rural.workers.user.adapter.HomeViewPagerAdapter;
import com.rd.PageIndicatorView;

import java.util.ArrayList;
import java.util.List;

public class HomeActivity extends AppCompatActivity {

    ViewPager viewPager;
    PageIndicatorView indicator;
    HomeViewPagerAdapter homeViewPagerAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        List<String> urlList =new ArrayList<>();
        urlList.add("https://www.tutorialspoint.com/images/tp-logo-diamond.png");
        urlList.add("https://www.tutorialspoint.com/images/tp-logo-diamond.png");
        urlList.add("https://www.tutorialspoint.com/images/tp-logo-diamond.png");

        homeViewPagerAdapter =new HomeViewPagerAdapter(this,urlList);
        viewPager =(ViewPager) findViewById(R.id.home_viewPager);
        indicator = (PageIndicatorView) findViewById(R.id.home_slider_dots);
        indicator.setViewPager(viewPager);


        viewPager.setAdapter(homeViewPagerAdapter);
        homeViewPagerAdapter.notifyDataSetChanged();

    }
}