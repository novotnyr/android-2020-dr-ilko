package com.github.novotnyr.android.driko;

import android.os.Bundle;
import android.view.*;

import androidx.fragment.app.Fragment;

public class MasterFragment extends Fragment {

    public MasterFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_master, container, false);
    }
}
