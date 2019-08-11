package com.example.vocubulary;

import android.content.Context;

import androidx.annotation.Nullable;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class PageAdapter extends FragmentPagerAdapter {

Context mContext;
    public PageAdapter(FragmentManager fm,Context context) {
        super(fm);
        mContext=context;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        switch (position) {
            case 0:
                return mContext.getString(R.string.Title_Relationship);
            case 1:
                return mContext.getString(R.string.Title_Music);
            case 2:
                return mContext.getString(R.string.Title_Eating);
            case 3:
                return mContext.getString(R.string.Title_Bed);
            case 4:
                return mContext.getString(R.string.Title_XtraWords);
        }
        return null;
    }

    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                return new Relationship_fragment();
            case 1:
                return new Music_fragment();
            case 2:
                return new Eating_fragment();
            case 3:
                return new Bed_fragment();
            case 4:
                return new ExtraWords_fragment();
        }
        return null;
    }

    @Override
    public int getCount() {
        return 5;
    }
}
