package com.yize.miniweather.view.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.yize.miniweather.R;
import com.yize.miniweather.bean.WeatherBean;

import java.util.List;

public class IndexDetailAdapter extends RecyclerView.Adapter<IndexDetailAdapter.ViewHolder> {
    private List<WeatherBean.Index> indexDetailList;
    private Context context;

    public IndexDetailAdapter(List<WeatherBean.Index> indexDetailList) {
        this.indexDetailList = indexDetailList;
    }


    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        if(context==null){
            context=parent.getContext();
        }
        View view= LayoutInflater.from(context).inflate(R.layout.index_detail,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        WeatherBean.Index index=indexDetailList.get(position);
        holder.tv_air_condition.setText(index.getName());
        holder.tv_detail.setText(index.getDetail());
    }

    @Override
    public int getItemCount() {
        return 0;
    }

    static class ViewHolder extends RecyclerView.ViewHolder{
        private TextView tv_air_condition,tv_detail;
        public ViewHolder(@NonNull View v) {
            super(v);
            tv_air_condition = v.findViewById(R.id.tv_air_condition);
            tv_detail = v.findViewById(R.id.tv_detail);

        }
    }
}
