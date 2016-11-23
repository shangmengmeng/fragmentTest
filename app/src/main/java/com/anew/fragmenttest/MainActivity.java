package com.anew.fragmenttest;

import android.app.FragmentTransaction;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.FrameLayout;

import com.anew.fragmenttest.Fragment.Fragemt2;
import com.anew.fragmenttest.Fragment.Fragemt3;
import com.anew.fragmenttest.Fragment.Fragemt4;
import com.anew.fragmenttest.Fragment.Fragment1;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private ArrayList<String>title;
    private ArrayList<Fragment>fragments;
    private ViewPager vp;
    private TabLayout tabLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        intData();
        initView();

    }
    private void intData() {
        title = new ArrayList<>();
        title.add("第一话");
        title.add("第二话");
        title.add("第三话");
        title.add("第四话");
        fragments = new ArrayList<>();


        fragments.add(new Fragment1());
        fragments.add(new Fragemt2());
        fragments.add(new Fragemt3());
        fragments.add(new Fragemt4());

    }

    private void initView() {
        tabLayout = (TabLayout) findViewById(R.id.tablayout);
        vp = (ViewPager) findViewById(R.id.vp );
        vp.setAdapter(new ViewPagerAdapter(getSupportFragmentManager(),fragments,title));
        tabLayout.setupWithViewPager(vp,true);
    }


}
