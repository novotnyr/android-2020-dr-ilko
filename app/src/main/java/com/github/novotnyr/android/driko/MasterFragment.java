package com.github.novotnyr.android.driko;

import android.os.Bundle;
import android.view.*;
import android.widget.ListView;

import androidx.annotation.*;
import androidx.fragment.app.Fragment;

public class MasterFragment extends Fragment {
    ListView cityListView;

    public MasterFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_master, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        cityListView = view.findViewById(R.id.cityListView);
    }
}
