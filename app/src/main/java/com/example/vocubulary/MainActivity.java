package com.example.vocubulary;
/*
# developed by Aryan Bimali
 */
import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;
import android.media.AudioManager;
import android.os.Bundle;
import com.google.android.material.tabs.TabLayout;

public class MainActivity extends AppCompatActivity {
    private TabLayout mTabs;
    private ViewPager mViewpager;
   private AudioManager audioManager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        int[] mIconsArray = {R.drawable.relationship, R.drawable.music, R.drawable.eating, R.drawable.bed, R.drawable.bonus};
        mTabs = findViewById(R.id.tabs);
        mViewpager = findViewById(R.id.view_pager);
        PageAdapter pageAdapter = new PageAdapter(getSupportFragmentManager(), this);
        mViewpager.setAdapter(pageAdapter);
        mTabs.setupWithViewPager(mViewpager);
        //setting icon according to tabs postion
        for (int i = 0; i < mIconsArray.length; i++) {

            mTabs.getTabAt(i).setIcon(mIconsArray[i]);

        }


    }
}
