package com.androweb.application.screen.shot.fragments;

import android.view.View;

import android.support.v4.app.Fragment;

public abstract class BaseFragment extends Fragment {

    /**
     *
     * @return The View we want to save as an image.
     */
    public abstract View getTargetView();

}
