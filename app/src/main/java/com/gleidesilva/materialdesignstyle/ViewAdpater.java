package com.gleidesilva.materialdesignstyle;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by gleidesilva on 28/09/16.
 */
public class ViewAdpater extends RecyclerView.Adapter<ViewAdpater.MyViewHolder> {

    private final LayoutInflater inflater;

    public ViewAdpater(Context context) {
        inflater = LayoutInflater.from(context);
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = inflater.inflate(R.layout.custom_row, parent,false);
        MyViewHolder holder = new MyViewHolder(view);
        return null;
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    class MyViewHolder extends RecyclerView.ViewHolder {
        public MyViewHolder(View itemView) {
            super(itemView);
        }
    }
}


