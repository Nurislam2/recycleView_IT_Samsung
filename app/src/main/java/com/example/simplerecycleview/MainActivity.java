package com.example.simplerecycleview;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private ArrayList<Country> countries = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setData();
        RecyclerView recyclerView =findViewById(R.id.recycler);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        CountryAdapter countryAdapter = new CountryAdapter(countries, this);
        recyclerView.setAdapter(countryAdapter);

    }

    public void setData() {
        countries.add(new Country("Argentina",
                "https://upload.wikimedia.org/wikipedia/commons/thumb/1/1a/Flag_of_Argentina.svg/800px-Flag_of_Argentina.svg.png",
                "45000000", "Buenos Aires", "GMT-3"));
        countries.add(new Country("Argentina",
                "https://upload.wikimedia.org/wikipedia/commons/thumb/1/1a/Flag_of_Argentina.svg/800px-Flag_of_Argentina.svg.png",
                "45000000", "Buenos Aires", "GMT-3"));

        countries.add(new Country("Australia",
                "https://upload.wikimedia.org/wikipedia/commons/thumb/b/b9/Flag_of_Australia.svg/800px-Flag_of_Australia.svg.png",
                "25687041", "Canberra", "GMT+10"));

        countries.add(new Country("Brazil",
                "https://upload.wikimedia.org/wikipedia/commons/thumb/0/05/Flag_of_Brazil.svg/800px-Flag_of_Brazil.svg.png",
                "211000000", "Brasília", "GMT-3"));

        countries.add(new Country("Canada",
                "https://upload.wikimedia.org/wikipedia/commons/thumb/d/d9/Flag_of_Canada_%28Pantone%29.svg/800px-Flag_of_Canada_%28Pantone%29.svg.png",
                "37590000", "Ottawa", "GMT-5"));

        countries.add(new Country("China",
                "https://upload.wikimedia.org/wikipedia/commons/thumb/f/fa/Flag_of_the_People%27s_Republic_of_China.svg/800px-Flag_of_the_People%27s_Republic_of_China.svg.png",
                "1402000000", "Beijing", "GMT+8"));

        countries.add(new Country("France",
                "https://upload.wikimedia.org/wikipedia/commons/thumb/c/c3/Flag_of_France.svg/800px-Flag_of_France.svg.png",
                "67081000", "Paris", "GMT+1"));

        countries.add(new Country("Germany",
                "https://upload.wikimedia.org/wikipedia/commons/thumb/b/ba/Flag_of_Germany.svg/800px-Flag_of_Germany.svg.png",
                "83166711", "Berlin", "GMT+1"));

        countries.add(new Country("India",
                "https://upload.wikimedia.org/wikipedia/commons/thumb/4/41/Flag_of_India.svg/800px-Flag_of_India.svg.png",
                "1380004385", "New Delhi", "GMT+5:30"));

        countries.add(new Country("Italy",
                "https://upload.wikimedia.org/wikipedia/commons/thumb/0/03/Flag_of_Italy.svg/800px-Flag_of_Italy.svg.png",
                "60317116", "Rome", "GMT+1"));

        countries.add(new Country("Japan",
                "https://upload.wikimedia.org/wikipedia/commons/thumb/9/9e/Flag_of_Japan.svg/800px-Flag_of_Japan.svg.png",
                "125960000", "Tokyo", "GMT+9"));

        countries.add(new Country("Mexico",
                "https://upload.wikimedia.org/wikipedia/commons/thumb/f/fc/Flag_of_Mexico.svg/800px-Flag_of_Mexico.svg.png",
                "126014024", "Mexico City", "GMT-6"));

        countries.add(new Country("Russia",
                "https://upload.wikimedia.org/wikipedia/commons/thumb/f/f3/Flag_of_Russia.svg/800px-Flag_of_Russia.svg.png",
                "146599183", "Moscow", "GMT+3"));

        countries.add(new Country("South Africa",
                "https://upload.wikimedia.org/wikipedia/commons/thumb/a/af/Flag_of_South_Africa.svg/800px-Flag_of_South_Africa.svg.png",
                "59308690", "Pretoria", "GMT+2"));

        countries.add(new Country("South Korea",
                "https://upload.wikimedia.org/wikipedia/commons/thumb/0/09/Flag_of_South_Korea.svg/800px-Flag_of_South_Korea.svg.png",
                "51780579", "Seoul", "GMT+9"));

        countries.add(new Country("Spain",
                "https://upload.wikimedia.org/wikipedia/commons/thumb/9/9a/Flag_of_Spain.svg/800px-Flag_of_Spain.svg.png",
                "47351567", "Madrid", "GMT+1"));

        countries.add(new Country("United Kingdom",
                "https://upload.wikimedia.org/wikipedia/commons/thumb/a/ae/Flag_of_the_United_Kingdom.svg/800px-Flag_of_the_United_Kingdom.svg.png",
                "66796807", "London", "GMT+0"));


    }
}
