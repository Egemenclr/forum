package com.example.forum.forumUi;

import android.content.Context;

import androidx.annotation.Nullable;
import androidx.annotation.StringRes;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.example.forum.forumFragment.Film_fragment;
import com.example.forum.forumFragment.Kitap_fragment;
import com.example.forum.R;

public class SectionsPagerAdapter extends FragmentPagerAdapter {
    @StringRes
    private static final int[] TAB_TITLES = new int[]{R.string.tab_text_1, R.string.tab_text_2};
    private final Context mContext;

    public SectionsPagerAdapter(Context context, FragmentManager fm) {
        super(fm);
        mContext = context;
    }

    @Override
    public Fragment getItem(int position) {
        Fragment fragment=null;
        switch (position){
            case 0:
                return fragment= new Film_fragment();

            case 1:
                return fragment=new Kitap_fragment();

             //// Her fragment için özel ekran tasarlanacak.
            case 2:
                return fragment=new Kitap_fragment();

            case 3:
                return fragment=new Kitap_fragment();
            case 4:
                return fragment = new Kitap_fragment();
        }
        return null;

    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        switch (position){
            case 0:
                return "FİLM";

            case 1:
                return "KİTAP";

            case 2:
                return "DİZİ";

            case 3:
                return "DENEME";

            case 4:
                return "DENEME";




        }
        return null;
        //return mContext.getResources().getString(TAB_TITLES[position]);
    }

    @Override
    public int getCount() {
        // default atanabilir. Fonksiyon ile alınabilir.
        return 5;
    }
}
