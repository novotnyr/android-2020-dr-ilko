package com.github.novotnyr.android.driko;

import android.os.Bundle;
import android.view.*;
import android.widget.*;

import androidx.annotation.*;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

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
        CityViewModel viewModel = new ViewModelProvider(requireActivity()).get(CityViewModel.class);
        cityListView = view.findViewById(R.id.cityListView);
        cityListView.setOnItemClickListener((parent, v, position, id) -> {
            String city = (String) cityListView.getItemAtPosition(position);
            viewModel.setSelectedCity(city);
        });
    }
}
