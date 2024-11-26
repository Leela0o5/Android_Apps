package com.example.viewpagerapp;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.viewpager2.widget.ViewPager2;

import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;

public class MainActivity extends AppCompatActivity {
ViewPager2 viewPager2;
TabLayout tabLayout;
MyviewPagerAdapter myviewPagerAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
tabLayout=findViewById(R.id.tableLayout);

      viewPager2=findViewById(R.id.viewPager2);
      myviewPagerAdapter=new MyviewPagerAdapter(getSupportFragmentManager(),getLifecycle());
      myviewPagerAdapter.addfragment(new BlankFragment());
        myviewPagerAdapter.addfragment(new BlankFragment2());
        myviewPagerAdapter.addfragment(new BlankFragment3());

      viewPager2.setOrientation(ViewPager2.ORIENTATION_HORIZONTAL);

      viewPager2.setAdapter(myviewPagerAdapter);


      new TabLayoutMediator(tabLayout, viewPager2, new TabLayoutMediator.TabConfigurationStrategy() {
          @Override
          public void onConfigureTab(@NonNull TabLayout.Tab tab, int position) {
              tab.setText("Fragment "+(position+1));
          }
      }).attach();




    }
}