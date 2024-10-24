package com.example.simplerecycleview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.List;

public class CountryAdapter extends RecyclerView.Adapter<CountryAdapter.ViewHolder> {
    private final List<Country> countries;
    private final LayoutInflater inflater;

    public CountryAdapter(List<Country> countries, Context context) {
        this.countries = countries;
        this.inflater = LayoutInflater.from(context);
    }
    public class ViewHolder extends RecyclerView.ViewHolder{
        ImageView imageView;
        TextView name;
        TextView population;
        TextView capital;
        TextView timezone;

        public ViewHolder(@NonNull View view) {
            super(view);
            imageView = view.findViewById(R.id.imageCountry);
            name = view.findViewById(R.id.nameCountry);
            population = view.findViewById(R.id.populationCountry);
            capital = view.findViewById(R.id.capitalCountry);
            timezone = view.findViewById(R.id.timezoneCountry);
        }
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = inflater.inflate(R.layout.item_country, parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Country country = countries.get(position);
        holder.name.setText(country.getName());
        holder.population.setText(country.getPopulation());
        holder.capital.setText(country.getCapital());
        holder.timezone.setText(country.getTimezone());

        Glide.with(inflater.getContext())
                .load(country.getImage())
                .into(holder.imageView);
    }

    @Override
    public int getItemCount() {
        return countries.size();
    }


}
