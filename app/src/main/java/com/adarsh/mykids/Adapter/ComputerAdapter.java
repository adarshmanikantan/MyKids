package com.adarsh.mykids.Adapter;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.adarsh.mykids.R;
import com.adarsh.mykids.Retro.Model.ComputerModel;
import com.adarsh.mykids.Retro.Model.EnglishModel;
import com.adarsh.mykids.VideoPlayerActivity;
import com.bumptech.glide.Glide;

public class ComputerAdapter extends RecyclerView.Adapter<ComputerAdapter.MyViewHolder> {
    Context context;
    ComputerModel computerModel;
    public ComputerAdapter(Context context, ComputerModel computerModel)
    {
        this.context=context;
        this.computerModel=computerModel;
    }
    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.video_row,parent,false);
        MyViewHolder holder=new MyViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull final MyViewHolder holder, final int position) {
        Glide.with(context)
                //.load(mImageUri) // Load image from assets
                .load(computerModel.getVideos().get(position).getImage().trim()) // Image URL
                .centerCrop() // Image scale type
                // Resize image
                .placeholder(R.drawable.ic_add_a_photo_black_24dp) // Place holder image
//                .error(R.drawable.ic_error_black_36dp) // On error image
                .into(holder.imageView); // ImageView to display
        holder.title.setText(computerModel.getVideos().get(position).getTitle());
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SharedPreferences sharedPreferences=context.getSharedPreferences("pref",Context.MODE_PRIVATE);
                SharedPreferences.Editor editor=sharedPreferences.edit();
                editor.putString("url",computerModel.getVideos().get(position).getVideo());
                editor.apply();
                Intent i=new Intent(context, VideoPlayerActivity.class);
                holder.itemView.getContext().startActivity(i);
            }
        });

    }

    @Override
    public int getItemCount() {
        return computerModel.getVideos().size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder
    {
        TextView title;
        ImageView imageView;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            imageView=itemView.findViewById(R.id.iv);
            title=itemView.findViewById(R.id.videotitle);
        }
    }
}
