package com.adarsh.mykids.Adapter;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.adarsh.mykids.ChildHome;
import com.adarsh.mykids.Home;
import com.adarsh.mykids.R;
import com.adarsh.mykids.Retro.Model.ViewChildModel;

public class ViewChildAdapter extends RecyclerView.Adapter<ViewChildAdapter.MyViewHolder>{

    Context context;
    ViewChildModel viewChildModel;
    public ViewChildAdapter(Context context, ViewChildModel viewChildModel)
    {
        this.context=context;
        this.viewChildModel=viewChildModel;
    }
    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.child_row, parent, false);

        return new MyViewHolder(itemView);
    }


    @Override
    public void onBindViewHolder(@NonNull final MyViewHolder holder, int position) {
        final String parent_id=viewChildModel.getVaccination_Details().get(position).getParent_id();
        final String child_id=viewChildModel.getVaccination_Details().get(position).getChild_id();
        final String child_name=viewChildModel.getVaccination_Details().get(position).getChild_name();
        final String child_dob=viewChildModel.getVaccination_Details().get(position).getDob();
        final String child_gender=viewChildModel.getVaccination_Details().get(position).getGender();
        final String child_birth=viewChildModel.getVaccination_Details().get(position).getBirth();
        final String six_week=viewChildModel.getVaccination_Details().get(position).getSix_week();
        final String ten_week=viewChildModel.getVaccination_Details().get(position).getTen_week();
        final String fourteen_week=viewChildModel.getVaccination_Details().get(position).getFourteen_week();
        final String six_month=viewChildModel.getVaccination_Details().get(position).getSix_month();
        final String nine_month=viewChildModel.getVaccination_Details().get(position).getNine_month();
        final String twelve_month=viewChildModel.getVaccination_Details().get(position).getTwelve_month();
        final String fifteen_month=viewChildModel.getVaccination_Details().get(position).getFifteen_month();
        final String eighteen_month=viewChildModel.getVaccination_Details().get(position).getEighteen_month();
        final String two_year=viewChildModel.getVaccination_Details().get(position).getTwo_year();
        final String four_year=viewChildModel.getVaccination_Details().get(position).getFour_year();
        final String five_year=viewChildModel.getVaccination_Details().get(position).getFive_year();
        final String eight_year=viewChildModel.getVaccination_Details().get(position).getEight_year();
        final String ten_year=viewChildModel.getVaccination_Details().get(position).getTen_year();

        holder.textView.setText(child_name);
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SharedPreferences sharedPreferences=context.getSharedPreferences("Vaccination",Context.MODE_PRIVATE);
                SharedPreferences.Editor editor=sharedPreferences.edit();
                editor.putString("parent_id",parent_id);
                editor.putString("child_id",child_id);
                editor.putString("child_name",child_name);
                editor.putString("child_dob",child_dob);
                editor.putString("child_gender",child_gender);
                editor.putString("child_birth",child_birth);
                editor.putString("six_week",six_week);
                editor.putString("ten_week",ten_week);
                editor.putString("fourteen week",fourteen_week);
                editor.putString("six_month",six_month);
                editor.putString("nine_month",nine_month);
                editor.putString("twelve_month",twelve_month);
                editor.putString("fifteen_month",fifteen_month);
                editor.putString("eighteen_month",eighteen_month);
                editor.putString("two_year",two_year);
                editor.putString("four_year",four_year);
                editor.putString("five_year",five_year);
                editor.putString("eight_year",eight_year);
                editor.putString("ten_year",ten_year);
                editor.apply();
                Intent i=new Intent(context,ChildHome.class);
                holder.itemView.getContext().startActivity(i);

            }
        });
    }

    @Override
    public int getItemCount() {
        return viewChildModel.getVaccination_Details().size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder{

        TextView textView;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            textView=itemView.findViewById(R.id.name);
        }
    }
}
