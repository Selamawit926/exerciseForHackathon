package com.example.exerciseforhackathon;

import android.os.Bundle;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager2.widget.ViewPager2;

import com.example.eshi_blood.adapter.BloodViewPagerAdapter;
import com.example.eshi_blood.R;
import com.example.eshi_blood.views.fragments.BloodDonateFragment;
import com.example.eshi_blood.views.fragments.HomeFragment;
import com.example.eshi_blood.views.fragments.NewsAndEventFragment;
import com.example.eshi_blood.views.fragments.NotficationFragment;
import com.example.eshi_blood.views.fragments.UserFragment;
import com.google.android.material.badge.BadgeDrawable;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;

public class News extends AppCompatActivity {

    private ViewPager2 activityViewPager;
    private ViewPagerAdapter viewPagerAdapter;
    private TabLayout tabLayout;

    private ImageView imageView;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ui);

        activityViewPager = findViewById(R.id.blood_activity_view_pager);
        tabLayout = findViewById(R.id.blood_activity_tab_layout);
        viewPagerAdapter = new ViewPagerAdapter(News.this);

        viewPagerAdapter.addFragment(new NewsFragment(), "newsAndEvent");
        viewPagerAdapter.addFragment(new UploadFragment(), "newsAndEvent");
        viewPagerAdapter.addFragment(new NotficationFragment(), "notification");
        viewPagerAdapter.addFragment(new UserFragment(), "userInfo");

        activityViewPager.setAdapter(viewPagerAdapter);



        TabLayoutMediator tabLayoutMediator = new TabLayoutMediator(
                tabLayout, activityViewPager, new TabLayoutMediator.TabConfigurationStrategy() {
            @Override
            public void onConfigureTab(@NonNull TabLayout.Tab tab, int position) {
                tabLayout.setBackgroundColor(getResources().getColor(R.color.colorPrimary));
                switch (position){
                    case 0:{
                        tab.setIcon(R.drawable.ic_news_feed);
                        break;
                    }
                    case 1:{
                        tab.setIcon(R.drawable.ic_upload);
                        BadgeDrawable badgeDrawable = tab.getOrCreateBadge();
                        badgeDrawable.setNumber(2);
                        break;
                    }
                    case 2:{
                        tab.setIcon(R.drawable.ic_notification);
                        break;
                    }
                    case 3:{
                        tab.setIcon(R.drawable.ic_account);
                        BadgeDrawable badgeDrawable = tab.getOrCreateBadge();
                        badgeDrawable.setNumber(2);
                        break;
                    }
                }
            }
        }
        );
        tabLayoutMediator.attach();

    }
}
