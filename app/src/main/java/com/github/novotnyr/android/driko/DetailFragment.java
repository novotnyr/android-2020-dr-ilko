package com.github.novotnyr.android.driko;

import android.os.Bundle;
import android.view.*;
import android.widget.TextView;

import androidx.annotation.*;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

public class DetailFragment extends Fragment {
    private TextView temperatureTextView;

    public DetailFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_detail, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        temperatureTextView = view.findViewById(R.id.temperatureTextView);
        ViewModelProvider vmProvider = new ViewModelProvider(requireActivity());
        CityViewModel viewModel = vmProvider.get(CityViewModel.class);
        viewModel.getSelectedCity().observe(this, this::setTemperature);
    }

    private void setTemperature(String city) {
        int temperature = city.hashCode() % 32;
        temperatureTextView.setText("" + temperature);
    }
}
