package uio.androidbootcamp.fragmentstabs;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class SectionsPagerAdapter extends FragmentPagerAdapter {

    private MainActivity activity;

    public SectionsPagerAdapter(FragmentManager fm, MainActivity activity) {
        super(fm);
        this.activity = activity;
    }

    @Override
    public Fragment getItem(int position) {
        return PlaceholderFragment.newInstance(position + 1);
    }

    @Override
    public int getCount() {
        return 2;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        switch (position) {
            case 0:
                return activity.getResources().getString(R.string.tab_pokemon);
            case 1:
                return activity.getResources().getString(R.string.tab_star_wars);
        }
        return null;
    }
}
