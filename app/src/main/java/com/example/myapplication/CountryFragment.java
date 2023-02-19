package com.example.myapplication;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.myapplication.databinding.FragmentCountryBinding;

import java.util.ArrayList;

public class CountryFragment extends Fragment {
    private ArrayList<Country> countryList;
    private CountryAdapter adapter;
    private FragmentCountryBinding binding;
    private Integer position;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentCountryBinding.inflate(getLayoutInflater());
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        position = getArguments().getInt("key");
        checkPosition(position);

        adapter = new CountryAdapter(countryList);
        binding.rvCountry.setAdapter(adapter);
    }


    private void checkPosition(Integer position) {
        if (position == 0){
            loadEurasia();
        }else if (position == 1){
            loadSouthAmerica();
        }else if (position == 2){
            loadNorthAmerica();
        }else if (position == 3){
            loadAfrica();
        }else if (position == 4){
            loadAustralia();
        }
    }

    private void loadEurasia(){
        countryList = new ArrayList<>();
        countryList.add(new Country("Armenia", "Yerevan", "https://upload.wikimedia.org/wikipedia/commons/e/e7/Flag_of_Armenia.png"));
        countryList.add(new Country("Albania", "Tirana","https://upload.wikimedia.org/wikipedia/commons/d/d0/Flag_of_Albania.png"));
        countryList.add(new Country("Belarus", "Minsk" ,"https://upload.wikimedia.org/wikipedia/commons/thumb/8/85/Flag_of_Belarus.svg/2560px-Flag_of_Belarus.svg.png"));
        countryList.add(new Country("France","Paris","https://upload.wikimedia.org/wikipedia/commons/6/62/Flag_of_France.png"));
        countryList.add(new Country("Italy","Rome","https://upload.wikimedia.org/wikipedia/commons/e/e4/Flag_of_Italy_%281946%E2%80%932003%29.png"));
        countryList.add(new Country("Slovakia","Bratislava","https://upload.wikimedia.org/wikipedia/commons/thumb/e/e6/Flag_of_Slovakia.svg/2560px-Flag_of_Slovakia.svg.png"));
        countryList.add(new Country("Turkey", "Ankara", "https://upload.wikimedia.org/wikipedia/commons/thumb/b/b4/Flag_of_Turkey.svg/640px-Flag_of_Turkey.svg.png"));
        countryList.add(new Country("Norway", "Oslo", "https://upload.wikimedia.org/wikipedia/commons/thumb/d/d9/Flag_of_Norway.svg/2000px-Flag_of_Norway.svg.png"));
        countryList.add(new Country("Germany", "Berlin", "https://upload.wikimedia.org/wikipedia/en/thumb/b/ba/Flag_of_Germany.svg/1200px-Flag_of_Germany.svg.png"));
        countryList.add(new Country("Belgium", "Brussels" , "https://upload.wikimedia.org/wikipedia/commons/thumb/9/92/Flag_of_Belgium_%28civil%29.svg/2560px-Flag_of_Belgium_%28civil%29.svg.png"));
    }

    private void loadSouthAmerica(){
        countryList = new ArrayList<>();
        countryList.add(new Country("Argentina","Buenos Aires", "https://upload.wikimedia.org/wikipedia/commons/f/f2/Argentina_Flag.png"));
        countryList.add(new Country("Bolivia", "La Paz","https://upload.wikimedia.org/wikipedia/commons/thumb/d/de/Flag_of_Bolivia_%28state%29.svg/2560px-Flag_of_Bolivia_%28state%29.svg.png"));
        countryList.add(new Country("Brazil", "Brasilia","https://upload.wikimedia.org/wikipedia/en/thumb/0/05/Flag_of_Brazil.svg/2560px-Flag_of_Brazil.svg.png"));
        countryList.add(new Country("Colombia","Bogota","https://upload.wikimedia.org/wikipedia/commons/f/f8/Flag_of_Colombia.png"));
        countryList.add(new Country("Peru", "Lima", "https://upload.wikimedia.org/wikipedia/commons/thumb/d/df/Flag_of_Peru_%28state%29.svg/1280px-Flag_of_Peru_%28state%29.svg.png"));
        countryList.add(new Country("Suriname", "Paramaribo", "https://www.countryflags.com/wp-content/uploads/suriname-flag-png-large.png"));
        countryList.add(new Country("Uruguay", "Montevideo","https://upload.wikimedia.org/wikipedia/commons/thumb/f/fe/Flag_of_Uruguay.svg/2560px-Flag_of_Uruguay.svg.png"));
        countryList.add(new Country("Venezuela","Caracas","https://upload.wikimedia.org/wikipedia/commons/thumb/0/06/Flag_of_Venezuela.svg/1280px-Flag_of_Venezuela.svg.png"));
        countryList.add(new Country("Guyana","Georgetown","https://upload.wikimedia.org/wikipedia/commons/thumb/9/99/Flag_of_Guyana.svg/2560px-Flag_of_Guyana.svg.png"));
        countryList.add(new Country("Chile","Santiago","https://upload.wikimedia.org/wikipedia/commons/a/ae/Flag_of_Chile.png"));
    }

    private void loadNorthAmerica(){
        countryList = new ArrayList<>();
        countryList.add(new Country("Bahamas","Nassau","https://upload.wikimedia.org/wikipedia/commons/thumb/9/93/Flag_of_the_Bahamas.svg/2560px-Flag_of_the_Bahamas.svg.png"));
        countryList.add(new Country("Barbados","Bridgetown","https://upload.wikimedia.org/wikipedia/commons/thumb/e/ef/Flag_of_Barbados.svg/2560px-Flag_of_Barbados.svg.png"));
        countryList.add(new Country("Belize","Belmopan","https://upload.wikimedia.org/wikipedia/commons/thumb/e/e7/Flag_of_Belize.svg/2560px-Flag_of_Belize.svg.png"));
        countryList.add(new Country("Canada","Ottawa","https://upload.wikimedia.org/wikipedia/commons/b/b6/Flag_of_Canada.png"));
        countryList.add(new Country("Cuba","Havana","https://upload.wikimedia.org/wikipedia/commons/9/92/Flag_of_Cuba.png"));
        countryList.add(new Country("Dominica","Roseau","https://upload.wikimedia.org/wikipedia/commons/0/04/Flag_of_Dominica.png"));
        countryList.add(new Country("Honduras","Tegucigalpa","https://upload.wikimedia.org/wikipedia/commons/a/a4/Honduras_flag_300.png"));
        countryList.add(new Country("Jamaica","Kingston","https://upload.wikimedia.org/wikipedia/commons/b/b4/Flag_of_Jamaica.png"));
        countryList.add(new Country("Mexico","Mexico City","https://upload.wikimedia.org/wikipedia/commons/1/17/Flag_of_Mexico.png"));
        countryList.add(new Country("Panama","Panama City","https://upload.wikimedia.org/wikipedia/commons/thumb/a/ab/Flag_of_Panama.svg/2560px-Flag_of_Panama.svg.png"));

    }

    private void loadAfrica(){
        countryList = new ArrayList<>();
        countryList.add(new Country("Banjul","Gambia","https://upload.wikimedia.org/wikipedia/commons/thumb/0/08/Flag_of_Banjul%2C_The_Gambia.svg/2560px-Flag_of_Banjul%2C_The_Gambia.svg.png"));
        countryList.add(new Country("Bamako","Mali","https://www.sanitationandwaterforall.org/sites/default/files/2020-03/MALI.png"));
        countryList.add(new Country("Bissau","Guinea-Bissau","https://upload.wikimedia.org/wikipedia/commons/thumb/0/01/Flag_of_Guinea-Bissau.svg/2560px-Flag_of_Guinea-Bissau.svg.png"));
        countryList.add(new Country("Kigali","Rwanda","https://upload.wikimedia.org/wikipedia/commons/thumb/1/17/Flag_of_Rwanda.svg/2560px-Flag_of_Rwanda.svg.png"));
        countryList.add(new Country("Kinshasa","Congo","https://upload.wikimedia.org/wikipedia/commons/thumb/6/6f/Flag_of_the_Democratic_Republic_of_the_Congo.svg/1280px-Flag_of_the_Democratic_Republic_of_the_Congo.svg.png"));
        countryList.add(new Country("Libreville","Gabon","https://upload.wikimedia.org/wikipedia/commons/thumb/0/04/Flag_of_Gabon.svg/1280px-Flag_of_Gabon.svg.png"));
        countryList.add(new Country("Lilongwe","Malawi","https://upload.wikimedia.org/wikipedia/commons/thumb/d/d1/Flag_of_Malawi.svg/1280px-Flag_of_Malawi.svg.png"));
        countryList.add(new Country("Luanda","Angola","https://upload.wikimedia.org/wikipedia/commons/thumb/8/88/Flag_of_Portuguese_Luanda.svg/2560px-Flag_of_Portuguese_Luanda.svg.png"));
        countryList.add(new Country("Lusaka","Zambia","https://upload.wikimedia.org/wikipedia/commons/thumb/0/06/Flag_of_Zambia.svg/1280px-Flag_of_Zambia.svg.png"));
        countryList.add(new Country("Nairobi","Kenya","https://upload.wikimedia.org/wikipedia/commons/thumb/8/84/Flag_of_Nairobi.svg/2560px-Flag_of_Nairobi.svg.png"));

    }

    private void loadAustralia(){
        countryList = new ArrayList<>();
        countryList.add(new Country("New Zealand","Wellington","https://upload.wikimedia.org/wikipedia/commons/thumb/3/3e/Flag_of_New_Zealand.svg/2560px-Flag_of_New_Zealand.svg.png"));
        countryList.add(new Country("Kiribati","Tarawa","https://upload.wikimedia.org/wikipedia/commons/thumb/d/d3/Flag_of_Kiribati.svg/2560px-Flag_of_Kiribati.svg.png"));
        countryList.add(new Country("Fiji","Suva","https://upload.wikimedia.org/wikipedia/commons/thumb/b/ba/Flag_of_Fiji.svg/2560px-Flag_of_Fiji.svg.png"));
        countryList.add(new Country("Australia","Canberra","https://upload.wikimedia.org/wikipedia/commons/thumb/b/b9/Flag_of_Australia.svg/2560px-Flag_of_Australia.svg.png"));

    }

}