package android.example.hongkongguide;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import androidx.fragment.app.Fragment;

import java.util.ArrayList;
import java.util.List;

public class FoodFragment extends Fragment {


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        List<Location> list = new ArrayList<>();
        Food.initFoodsList( list, getContext() );

        LocationAdapter adapter = new LocationAdapter( getActivity(), -1, list );
        View view = inflater.inflate( R.layout.locations_list, container, false );
        ListView listView = (ListView) view.findViewById( R.id.listView );

        listView.setAdapter( adapter );

        return view;
    }
}
