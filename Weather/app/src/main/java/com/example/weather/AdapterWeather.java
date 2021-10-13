package com.example.weather;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class AdapterWeather extends ArrayAdapter<WeatherEntity> {
    private Context context; //Nhận truyền vào 1 activity
    private int resId; // Nhận truyền vào một layout
    private List<WeatherEntity> listCountry; //Nhận truyền vào một arrlist

    public AdapterWeather(Context context, int resId, List<WeatherEntity> listCountry) {
        super(context, resId, listCountry);
        this.context = context;
        this.resId = resId;
        this.listCountry = listCountry;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View itemView = convertView;
        ViewHolder viewHolder = new ViewHolder();
        if (itemView == null) {
            //LayoutInflater chuyển xml sang 1 view trong java
            LayoutInflater inflater = (LayoutInflater) context.getSystemService((Context.LAYOUT_INFLATER_SERVICE));
            itemView = inflater.inflate(resId, null);
            // Gọi đến các thành phần giao diện đã tọa trong list.xml

            viewHolder.image = (ImageView) itemView.findViewById(R.id.image);
            viewHolder.lbCountry = (TextView) itemView.findViewById(R.id.country);
            viewHolder.lbCelsius = (TextView) itemView.findViewById(R.id.celsius);
            viewHolder.lbDescrible = (TextView) itemView.findViewById(R.id.describe);
            itemView.setTag(viewHolder);
        } else {
            viewHolder = (ViewHolder) itemView.getTag();
        }
        //Truyền vào giá trị cho các thành phần giao diện trong item list.xml
        viewHolder.image.setImageResource(listCountry.get(position).getImage());
        viewHolder.lbCountry.setText(listCountry.get(position).getCountry());
        viewHolder.lbCelsius.setText("" + listCountry.get(position).getCelsius());
        viewHolder.lbDescrible.setText(listCountry.get(position).getDescriptions());

        return itemView;
    }

    private class ViewHolder {
        ImageView image;
        TextView lbCountry;
        TextView lbDescrible;
        TextView lbCelsius;
    }
}
