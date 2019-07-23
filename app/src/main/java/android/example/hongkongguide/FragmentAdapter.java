package android.example.hongkongguide;

import android.content.Context;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class FragmentAdapter extends FragmentPagerAdapter {

    private Context context;

    public FragmentAdapter(Context context, FragmentManager fm) {
        super( fm );
        this.context = context;
    }

    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new SightsFragment();
        } else if (position == 1) {
            return new FoodFragment();
        } else if (position == 2) {
            return new ShopsFragment();
        } else {
            return new HotelsFragment();
        }

    }

    @Override
    public int getCount() {
        return 4;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        if (position == 0) {
            return context.getString( R.string.category_sights );
        } else if (position == 1) {
            return context.getString( R.string.category_food );
        } else if (position == 2) {
            return context.getString( R.string.category_shops );
        } else {
            return context.getString( R.string.category_hotels );
        }
    }
}
