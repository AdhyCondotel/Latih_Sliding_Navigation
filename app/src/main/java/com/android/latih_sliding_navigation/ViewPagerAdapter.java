package com.android.latih_sliding_navigation;


import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import com.android.latih_sliding_navigation.Fragment.MainFragment_One;
import com.android.latih_sliding_navigation.Fragment.MainFragment_Tri;
import com.android.latih_sliding_navigation.Fragment.MainFragment_Two;

/**
 * Created by Edwin on 15/02/2015.
 */
public class ViewPagerAdapter extends FragmentStatePagerAdapter {

    CharSequence Titles[]; // This will Store the Titles of the Tabs which are Going to be passed when ViewPagerAdapter is created
    int NumbOfTabs; // Store the number of tabs, this will also be passed when the ViewPagerAdapter is created


    // Build a Constructor and assign the passed Values to appropriate values in the class
    public ViewPagerAdapter(FragmentManager fm, CharSequence mTitles[], int mNumbOfTabsumb) {
        super(fm);

        this.Titles = mTitles;
        this.NumbOfTabs = mNumbOfTabsumb;

    }

    //This method return the fragment for the every position in the View Pager
    @Override
    public Fragment getItem(int position) {

        if(position == 0) // if the position is 0 we are returning the First tab
        {
            MainFragment_One tab1 = new MainFragment_One();
            return tab1;
        }
        else if (position == 1 ){
            MainFragment_Two tab2 = new MainFragment_Two();
            return tab2;
        }

        else             // As we are having 2 tabs if the position is now 0 it must be 1 so we are returning second tab
        {
            MainFragment_Tri tab3 = new MainFragment_Tri();
            return tab3;
        }

    }

    // This method return the titles for the Tabs in the Tab Strip
    @Override
    public CharSequence getPageTitle(int position) {
        return Titles[position];
    }

    // This method return the Number of tabs for the tabs Strip

    @Override
    public int getCount() {
        return NumbOfTabs;
    }
}