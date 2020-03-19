package com.adarsh.mykids.Adapter;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.palette.graphics.Palette;
import androidx.recyclerview.widget.RecyclerView;

import com.adarsh.mykids.R;
import com.adarsh.mykids.Retro.Model.TofiveModel;
import com.adarsh.mykids.VideoPlayerActivity;
import com.adarsh.mykids.VideoViewActivity;
import com.bumptech.glide.Glide;
import com.bumptech.glide.request.target.CustomTarget;
import com.bumptech.glide.request.transition.Transition;
import com.squareup.picasso.Picasso;

public class TofiveAdaper extends RecyclerView.Adapter<TofiveAdaper.MyViewHolder> {
    Context context;
    TofiveModel tofiveModel;
    public TofiveAdaper(Context context,TofiveModel tofiveModel)
    {
       this.context=context;
       this.tofiveModel=tofiveModel;
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
      Glide.with(context).load("http://srishti-systems.info/projects/CollegeApp/uploads/555447-img-20191213-wa0075.jpg").into(holder.imageView);
//        Glide
//                .with(context).asBitmap().load(tofiveModel.getVideos().get(position).getImage())///image
//                .placeholder(R.drawable.ic_add_black_24dp)
//                .into(new CustomTarget<Bitmap>() {
//                    @Override
//                    public void onResourceReady(@NonNull Bitmap resource, @Nullable Transition<? super Bitmap> transition) {
//                        holder.imageView.setImageBitmap(resource);
//                        Palette.from(resource).generate(new Palette.PaletteAsyncListener() {
//                            @Override
//                            public void onGenerated(@Nullable Palette palette) {
//                                int defaultValue = 0x000000;
//                                int vibrant = palette.getDominantColor(defaultValue);
//                                holder.linearLayout.setBackgroundColor(vibrant);
//                            }
//                        });
//                    }
//
//                    @Override
//                    public void onLoadCleared(@Nullable Drawable placeholder) {
//
//                    }
//                });


        holder.title.setText(tofiveModel.getVideos().get(position).getTitle());
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SharedPreferences sharedPreferences=context.getSharedPreferences("pref",Context.MODE_PRIVATE);
                SharedPreferences.Editor editor=sharedPreferences.edit();
                editor.putString("url",tofiveModel.getVideos().get(position).getVideo());
                editor.apply();
                Intent i=new Intent(context, VideoPlayerActivity.class);
                holder.itemView.getContext().startActivity(i);
            }
        });

    }

    @Override
    public int getItemCount() {
        return tofiveModel.getVideos().size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder
    {
        TextView title;
        ImageView imageView;
        LinearLayout linearLayout;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            imageView=itemView.findViewById(R.id.iv);
            title=itemView.findViewById(R.id.videotitle);
            linearLayout=itemView.findViewById(R.id.linearlayout1);
        }
    }
}
