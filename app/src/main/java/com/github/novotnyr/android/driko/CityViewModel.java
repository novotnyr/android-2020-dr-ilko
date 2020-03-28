package com.github.novotnyr.android.driko;

import androidx.lifecycle.*;

public class CityViewModel extends ViewModel {
    private MutableLiveData<String> selectedCity = new MutableLiveData<>();

    public LiveData<String> getSelectedCity() {
        return selectedCity;
    }

    public void setSelectedCity(String selectedCity) {
        this.selectedCity.postValue(selectedCity);
    }
}
