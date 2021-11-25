package com.aaa.firebase1;

import android.app.Activity;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Random;

public class DataAdapter extends RecyclerView.Adapter<DataAdapter.ViewHolder>{

    private ArrayList<Data> dataArrayList;

    public DataAdapter(ArrayList<Data> dataArrayList) {
        this.dataArrayList = dataArrayList;
    }

    @NonNull
    @Override
    public DataAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.row_item, parent, false);

        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull DataAdapter.ViewHolder holder, int position) {
        SimpleDateFormat sdf1 = new SimpleDateFormat("HH:mm:ss");
        SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy");
        Timestamp ts = new Timestamp(System.currentTimeMillis());
        holder.tvdate.setText(sdf2.format(ts));
        holder.tvtime.setText(sdf1.format(ts));
        holder.tvstr1.setText(dataArrayList.get(position).getStr1());
        holder.tvstr2.setText(dataArrayList.get(position).getStr2());

        Random rnd = new Random();
        int color = Color.argb(255, rnd.nextInt(256), rnd.nextInt(256), rnd.nextInt(256));
        holder.cv.setCardBackgroundColor(color);

    }

    @Override
    public int getItemCount() {
        return dataArrayList.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        TextView tvdate, tvtime, tvstr1, tvstr2;
        CardView cv;
        public ViewHolder(View view) {
            super(view);
            tvdate = view.findViewById(R.id.tvdate);
            tvtime = view.findViewById(R.id.tvtime);
            tvstr1 = view.findViewById(R.id.tvstr1);
            tvstr2 = view.findViewById(R.id.tvstr2);
            cv = view.findViewById(R.id.cv);

        }
    }

}
