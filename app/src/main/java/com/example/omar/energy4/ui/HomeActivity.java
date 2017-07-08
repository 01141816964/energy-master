package com.example.omar.energy4.ui;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.omar.energy4.R;
import com.example.omar.energy4.ui.fragment_1;
import com.example.omar.energy4.ui.fragment_2;
import com.example.omar.energy4.ui.fragment_3;
import com.pixelcan.inkpageindicator.InkPageIndicator;

public class HomeActivity extends AppCompatActivity {
    FragmentPagerAdapter adapterViewPager;
    InkPageIndicator mIndicator;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);


        ViewPager vpPager = (ViewPager) findViewById(R.id.vpPager);
        adapterViewPager = new MyPagerAdapter(getSupportFragmentManager());
        vpPager.setAdapter(adapterViewPager);
        vpPager.setCurrentItem(1);
        mIndicator = (InkPageIndicator) findViewById(R.id.indicator);
        mIndicator.setViewPager(vpPager);

    }

    public static class MyPagerAdapter extends FragmentPagerAdapter {
        private static int NUM_ITEMS = 3;

        public MyPagerAdapter(FragmentManager fragmentManager) {
            super(fragmentManager);
        }

        // Returns total number of pages.
        @Override
        public int getCount() {
            return NUM_ITEMS;
        }

        // Returns the fragment to display for a particular page.

        @Override
        public Fragment getItem(int position ) {


            switch (position) {
                case 0:
                    return fragment_3.newInstance();
                case 1:
                    return fragment_1.newInstance("titleDemo","750 KWH","125 LE", 90,R.drawable.circle_progress_background,R.drawable.circle_progress_foreground);
                case 2:
                    return fragment_2.newInstance();
                default:
                    return null;
            }
          }
        }

    }



