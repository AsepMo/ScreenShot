package com.androweb.application.screen.shot;

import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.androweb.application.screen.shot.fragments.SurfaceViewFragment;
import com.androweb.application.screen.shot.fragments.TextureViewFragment;
import com.androweb.application.screen.shot.fragments.ViewFragment;

public class ViewPagerAdapter extends FragmentPagerAdapter {

    private String[] titles = {"View", "SurfaceView", "TextureView"};
    private Fragment[] fragments = {new ViewFragment(), new SurfaceViewFragment(), new TextureViewFragment()};

    public ViewPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return titles[position];
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        return fragments[position];
    }

    @Override
    public int getCount() {
        return fragments.length;
    }


}
