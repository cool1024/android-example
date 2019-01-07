package com.example.cool1024.android_example.classes;

import android.support.v4.app.Fragment;

public class FragmentPage {

    private Fragment fragment;
    private String title;

    public FragmentPage(Fragment fragment, String title) {
        this.fragment = fragment;
        this.title = title;
    }

    public Fragment getFragment() {
        return fragment;
    }

    public void setFragment(Fragment fragment) {
        this.fragment = fragment;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}