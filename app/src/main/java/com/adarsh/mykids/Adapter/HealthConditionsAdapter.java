package com.adarsh.mykids.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.adarsh.mykids.R;
import com.adarsh.mykids.Retro.Model.GrowthStageModel;
import com.adarsh.mykids.Retro.ViewHealthConditionsModel;

public class HealthConditionsAdapter extends RecyclerView.Adapter<HealthConditionsAdapter.MyViewHolder> {
    Context context;
    ViewHealthConditionsModel growthStageModel;
    public HealthConditionsAdapter(Context context, ViewHealthConditionsModel growthStageModel)
    {
        this.context=context;
        this.growthStageModel=growthStageModel;
    }
    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.stage_row,parent,false);
        MyViewHolder holder=new MyViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull final MyViewHolder holder, final int position) {

        holder.title.setText(growthStageModel.getHealth().get(position).getTitle());
        holder.desc.setText(growthStageModel.getHealth().get(position).getDescription());


    }

    @Override
    public int getItemCount() {
        return growthStageModel.getHealth().size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder
    {
        TextView title,desc;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            title=itemView.findViewById(R.id.stagetitle);
            desc=itemView.findViewById(R.id.stagedesc);

        }
    }
}
