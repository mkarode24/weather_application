package com.example.tyler.weather_application;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;


/**
 * Created by Tyler on 1/28/2018.
 */

public class WeatherAdapter extends RecyclerView.Adapter<WeatherAdapter.ViewHolder>{

    private String[] weatherItems;
    private String[] weatherToastText;

    private Toast weatherToast;

    //weatherToast = null;

    public static class ViewHolder extends RecyclerView.ViewHolder {
         public TextView mTextView;
         public ViewHolder(View v){
             super(v);
             mTextView = itemView.findViewById(R.id.weather_text);
             //mTextView = v;
             itemView.setOnClickListener(new View.OnClickListener() {
                 @Override
                 public void onClick(View v) {
                     int position = getAdapterPosition();
                     Toast.makeText(v.getContext(), weatherToastText[position], Toast.LENGTH_LONG).show();

                 }
             });
             //getAdapterPosition();
         }


         public int getAdapterNum(){
             return getAdapterPosition();
         }
    }

    public WeatherAdapter(String[] myDataset, String[] ToastText) {
        //weatherItems = new ArrayList<String>();
        weatherItems = myDataset;
        weatherToastText = ToastText;
    }

    // Create new views (invoked by the layout manager)
    @Override
    public WeatherAdapter.ViewHolder onCreateViewHolder(ViewGroup parent,
                                                   int viewType) {
        // create a new view
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.weather_item, parent, false);

        //TextView v = (TextView) LayoutInflater.from(parent.getContext()).inflate(R.layout.weather_item, parent, false);
        // set the view's size, margins, paddings and layout parameters
        //view.setOnClickListener(weather_listener);
        WeatherAdapter.ViewHolder vh = new WeatherAdapter.ViewHolder(view);
        return vh;
    }

    // Replace the contents of a view (invoked by the layout manager)
    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        // - get element from your dataset at this position
        // - replace the contents of the view with that element
        holder.mTextView.setText(weatherItems[position]);

    }

    // Return the size of your dataset (invoked by the layout manager)
    @Override
    public int getItemCount() {
        return weatherItems.length;
    }


}
