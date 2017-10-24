package uio.androidbootcamp.fragmentstabs;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class StarWarsFragment extends Fragment {

    public StarWarsFragment() {
        // Required empty public constructor
    }

    public static StarWarsFragment newInstance() {
        return new StarWarsFragment();
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_star_wars, container, false);
    }
}
